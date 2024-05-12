package com.bytedance.realx.video;

import X.C16880lQ;
import X.V0N;
import X.ZV3;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Display;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes33.dex */
public class ScreenCaptureAndroidManager implements VideoCapturer, VideoSink {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public CapturerObserver capturerObserver;
    public int height;
    public boolean isDisposed;
    public boolean isSurfaceDispose;
    public Context mContext;
    public DeviceOrientation mCurrentOrientation;
    public Display mDisplay;
    public int mFrameIndex;
    public Map<Integer, CountDownLatch> mLocks;
    public boolean mPicoCapture2DTexture;
    public boolean mPicoCreateMediaProjection;
    public boolean mPicoNotCheckOrientation;
    public int mPicoVirtualDisplayDpi;
    public int mPicoVirtualDisplayFlag;
    public String mPicoVirtualDisplayName;
    public Map<Integer, VideoFrame> mVideoFrames;
    public MediaProjection mediaProjection;
    public MediaProjection.Callback mediaProjectionCallback;
    public MediaProjectionManager mediaProjectionManager;
    public Intent mediaProjectionPermissionResultData;
    public long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    public int width;

    /* loaded from: classes33.dex */
    public static final class HOLDER {
        public static final ScreenCaptureAndroidManager INSTANCE = new ScreenCaptureAndroidManager();
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void dispose() {
        SurfaceTextureHelper surfaceTextureHelper;
        this.isDisposed = true;
        if (this.isSurfaceDispose && (surfaceTextureHelper = this.surfaceTextureHelper) != null) {
            surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int enableFollowGravity(boolean z) {
        return -1;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int setCameraZoomRatio(float f) {
        return 0;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.bytedance.realx.video.ScreenCaptureAndroidManager.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_ScreenCaptureAndroidManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_ScreenCaptureAndroidManager$1__run$___twin___() {
                ScreenCaptureAndroidManager.this.surfaceTextureHelper.stopListening();
                ScreenCaptureAndroidManager.this.capturerObserver.onCapturerStopped();
            }

            public static void com_bytedance_realx_video_ScreenCaptureAndroidManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_realx_video_ScreenCaptureAndroidManager$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOnFlashLight() {
    }

    private void checkNotDisposed() {
        if (!this.isDisposed) {
        } else {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        if (this.mediaProjection == null) {
            RXLogging.e("ScreenCapture", "createVirtualDisplay failed, mediaProjection is null");
        } else {
            this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        }
    }

    private int getDeviceRotation() {
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    private DeviceOrientation getDisplayOrientation() {
        if (this.mContext.getResources().getConfiguration().orientation == 1) {
            return DeviceOrientation.PORTRAIT;
        }
        return DeviceOrientation.LANDSCAPE;
    }

    public ScreenCaptureAndroidManager() {
        this.mPicoVirtualDisplayName = "RTCScreenCapture";
        this.mPicoVirtualDisplayDpi = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.mPicoVirtualDisplayFlag = 11;
        this.mVideoFrames = new HashMap();
        this.mLocks = new HashMap();
    }

    private boolean maybeDoRotation() {
        int deviceRotation = getDeviceRotation();
        DeviceOrientation deviceOrientation = getDeviceOrientation(deviceRotation);
        DeviceOrientation displayOrientation = getDisplayOrientation();
        if (displayOrientation == this.mCurrentOrientation) {
            return false;
        }
        RXLogging.w("ScreenCapture", C16880lQ.LLLZ("[ScreenCapture] call |maybeDoRotation| and orientation != mCurrentOrientation, rotation:%d, orientation:%s, orientation1:%s", new Object[]{Integer.valueOf(deviceRotation), displayOrientation.toString(), deviceOrientation.toString()}));
        this.mCurrentOrientation = displayOrientation;
        rotateCaptureOrientation(displayOrientation);
        return true;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int getDeviceOrientation() {
        return ZV3.LIZIZ(ContextUtils.getApplicationContext());
    }

    public static ScreenCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    /* loaded from: classes33.dex */
    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE;

        public static DeviceOrientation valueOf(String str) {
            return (DeviceOrientation) V0N.LJJJ(DeviceOrientation.class, str);
        }
    }

    private DeviceOrientation getDeviceOrientation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return DeviceOrientation.LANDSCAPE;
                    }
                }
            }
            return DeviceOrientation.LANDSCAPE;
        }
        return DeviceOrientation.PORTRAIT;
    }

    private void rotateCaptureOrientation(DeviceOrientation deviceOrientation) {
        if ((deviceOrientation == DeviceOrientation.LANDSCAPE && this.width < this.height) || (deviceOrientation == DeviceOrientation.PORTRAIT && this.height < this.width)) {
            RXLogging.w("ScreenCapture", C16880lQ.LLLZ("[ScreenCapture] call |rotateCaptureOrientation| before(orientation:%s, width:%d, height:%d)", new Object[]{deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)}));
            int i = this.width;
            int i2 = this.height;
            this.height = i;
            this.width = i + (i2 - i);
            RXLogging.w("ScreenCapture", C16880lQ.LLLZ("[ScreenCapture] call |rotateCaptureOrientation| after(orientation:%s, width:%d, height:%d)", new Object[]{deviceOrientation.toString(), Integer.valueOf(this.width), Integer.valueOf(this.height)}));
        }
    }

    public int addFrame(VideoFrame videoFrame) {
        int i = this.mFrameIndex;
        this.mVideoFrames.put(Integer.valueOf(i), videoFrame);
        this.mFrameIndex++;
        return i;
    }

    public synchronized void dispose(int i) {
        CountDownLatch remove = this.mLocks.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.countDown();
        }
        dispose();
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.mPicoNotCheckOrientation && maybeDoRotation()) {
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public VideoFrame removeFrame(int i) {
        if (this.mVideoFrames.containsKey(Integer.valueOf(i))) {
            return this.mVideoFrames.remove(Integer.valueOf(i));
        }
        return null;
    }

    public void addLock(int i, CountDownLatch countDownLatch) {
        this.mLocks.put(Integer.valueOf(i), countDownLatch);
    }

    public void setData(Intent intent, MediaProjection.Callback callback) {
        this.isDisposed = false;
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
        this.mPicoNotCheckOrientation = intent.getBooleanExtra("pico_not_check_orientation", false);
        this.mPicoCreateMediaProjection = intent.getBooleanExtra("pico_create_media_projection", false);
        this.mPicoVirtualDisplayName = C16880lQ.LLJJIJIIJIL(intent, "pico_virtual_display_name");
        this.mPicoVirtualDisplayDpi = intent.getIntExtra("pico_virtual_display_dpi", LiveChatShowDelayForHotLiveSetting.DEFAULT);
        this.mPicoVirtualDisplayFlag = intent.getIntExtra("pico_virtual_display_flags", 11);
        this.mPicoCapture2DTexture = intent.getBooleanExtra("pico_need_capture_2d_texture", false);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            SurfaceTextureHelper create = SurfaceTextureHelper.create("RXLocalCapturer", context, false, this.mPicoCapture2DTexture);
            this.surfaceTextureHelper = create;
            this.isSurfaceDispose = true;
            this.mCurrentOrientation = null;
            if (create == null) {
                capturerObserver.onCapturerError("surfaceTextureHelper is null.");
                throw new RuntimeException("surfaceTextureHelper is null.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        startCapture(i, i2, i3, 4);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.isSurfaceDispose = false;
                this.mCurrentOrientation = null;
            } else {
                capturerObserver.onCapturerError("surfaceTextureHelper not set.");
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        checkNotDisposed();
        RXLogging.w("ScreenCapture", C16880lQ.LLLZ("[ScreenCapture] call |startCapture|,  width=%d, height=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        maybeDoRotation();
    }

    public synchronized void startCapture(int i, int i2, int i3, int i4, MediaProjection mediaProjection) {
        checkNotDisposed();
        RXLogging.w("ScreenCapture", C16880lQ.LLLZ("[ScreenCapture] call |startCapture|,  width=%d, height=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (i <= 0 || i2 <= 0) {
            this.width = this.mDisplay.getWidth();
            this.height = this.mDisplay.getHeight();
        } else {
            this.width = i;
            this.height = i2;
        }
        this.width = ((this.width + 7) / 8) * 8;
        this.height = ((this.height + 7) / 8) * 8;
        maybeDoRotation();
    }
}
