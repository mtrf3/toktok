package com.ss.ttlivestreamer.core.capture.video;

import X.C03880Dg;
import X.C16880lQ;
import X.C29174Bcg;
import X.C65300Pk0;
import X.P33;
import X.P34;
import X.Q0C;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;

/* loaded from: classes12.dex */
public class ScreenVideoCapturer extends VideoCapturer implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public volatile int dupInterval;
    public int fps;
    public int frameInterval;
    public int height;
    public boolean isDisposed;
    public Context mApplicationContext;
    public long mNextFrameTimeStamp;
    public final VideoCapturer.VideoCapturerObserver mObserver;
    public MediaProjection mediaProjection;
    public MediaProjectionManager mediaProjectionManager;
    public final Intent mediaProjectionPermissionResultData;
    public long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    public int width;
    public final MediaProjection.Callback mediaProjectionCallback = new MediaProjection.Callback() { // from class: com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            VideoCapturer.VideoCapturerObserver videoCapturerObserver = ScreenVideoCapturer.this.mObserver;
            if (videoCapturerObserver != null) {
                videoCapturerObserver.onVideoCaptureError(-201, new Exception("mediaProjection session is no longer valid"));
            }
            MediaProjection mediaProjection = ScreenVideoCapturer.this.mediaProjection;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this);
            }
        }
    };
    public final Runnable mDupFrameTask = new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer.2
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$2__run$___twin___() {
            ScreenVideoCapturer screenVideoCapturer = ScreenVideoCapturer.this;
            SurfaceTextureHelper surfaceTextureHelper = screenVideoCapturer.surfaceTextureHelper;
            if (surfaceTextureHelper == null || screenVideoCapturer.mStat != 1) {
                return;
            }
            surfaceTextureHelper.insertTextureFrameIfNeed();
        }

        public static void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public int mStat = 2;

    private synchronized void dispose() {
        this.isDisposed = true;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer, com.ss.ttlivestreamer.core.engine.VideoSource
    public boolean isScreenCast() {
        return true;
    }

    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer.3
            public static void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
                if (new C03880Dg(2).LIZJ(102102, "android/media/projection/MediaProjection", "stop", mediaProjection, new Object[0], "void", new C65300Pk0(false, "()V", "-3280126553863167901")).LIZ) {
                    return;
                }
                mediaProjection.stop();
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3__run$___twin___() {
                ScreenVideoCapturer.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenVideoCapturer.this.mDupFrameTask);
                ScreenVideoCapturer.this.surfaceTextureHelper.stopListening();
                VirtualDisplay virtualDisplay = ScreenVideoCapturer.this.virtualDisplay;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    ScreenVideoCapturer.this.virtualDisplay = null;
                }
                ScreenVideoCapturer screenVideoCapturer = ScreenVideoCapturer.this;
                if (screenVideoCapturer.mApplicationContext != null) {
                    screenVideoCapturer.mApplicationContext = null;
                }
                MediaProjection mediaProjection = screenVideoCapturer.mediaProjection;
                if (mediaProjection != null) {
                    mediaProjection.unregisterCallback(screenVideoCapturer.mediaProjectionCallback);
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("MediaProjection stop ");
                        LIZ.append(ScreenVideoCapturer.this.mediaProjection);
                        AVLog.ioi("ScreenVideoCapturer", X1D.LIZIZ(LIZ));
                        com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3_android_media_projection_MediaProjection_stop(ScreenVideoCapturer.this.mediaProjection);
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("MediaProjection stop exception: ");
                        LIZ2.append(e.getMessage());
                        AVLog.ioe("ScreenVideoCapturer", X1D.LIZIZ(LIZ2));
                    }
                    ScreenVideoCapturer screenVideoCapturer2 = ScreenVideoCapturer.this;
                    screenVideoCapturer2.mediaProjection = null;
                    VideoCapturer.VideoCapturerObserver videoCapturerObserver = screenVideoCapturer2.mObserver;
                    if (videoCapturerObserver != null) {
                        videoCapturerObserver.onVideoCaptureStopped();
                    }
                }
                ScreenVideoCapturer.this.mStat = 0;
            }

            public static void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void checkNotDisposed() {
        if (!this.isDisposed) {
        } else {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        try {
            this.virtualDisplay = P33.LIZ(this.mediaProjection, "WebRTC_ScreenCapture", this.width, this.height, LiveChatShowDelayForHotLiveSetting.DEFAULT, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, DataflowID0x58004001.ttlsScreenVideoRecordStartRecord());
        } catch (Q0C e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaProjection createVirtualDisplay failed():");
            LIZ.append(this.mediaProjection);
            AVLog.ioi("ScreenVideoCapturer", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        dispose();
        super.release();
        this.mStat = 2;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        stopCapture();
    }

    private boolean keepFrame(long j) {
        long j2 = this.mNextFrameTimeStamp;
        if (j2 > 0) {
            long j3 = j2 - j;
            long abs = Math.abs(j3);
            int i = this.frameInterval;
            if (abs < i * 2) {
                if (j3 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += i;
                return true;
            }
        }
        this.mNextFrameTimeStamp = j + (this.frameInterval / 2);
        return true;
    }

    public void updateDupInterval(int i) {
        this.dupInterval = i;
        DebugLogUtils.isEnableDebugLog();
    }

    public ScreenVideoCapturer(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        this.mediaProjectionPermissionResultData = intent;
        this.mObserver = videoCapturerObserver;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context) {
        checkNotDisposed();
        this.mApplicationContext = context;
        if (surfaceTextureHelper != null) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.mediaProjectionManager = (MediaProjectionManager) C16880lQ.LLILL(context, "media_projection");
            this.mStat = 0;
        } else {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
    }

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$4__run$___twin___() {
                ScreenVideoCapturer.this.virtualDisplay.release();
                ScreenVideoCapturer.this.createVirtualDisplay();
            }

            public static void com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_core_capture_video_ScreenVideoCapturer$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.surfaceTextureHelper.getHandler().removeCallbacks(this.mDupFrameTask);
        if (this.dupInterval == 0) {
            this.surfaceTextureHelper.getHandler().postDelayed(this.mDupFrameTask, this.frameInterval);
        } else if (this.dupInterval > 0) {
            this.surfaceTextureHelper.getHandler().postDelayed(this.mDupFrameTask, this.dupInterval);
        }
        this.numCapturedFrames++;
        long j2 = j / 1000;
        if (!keepFrame(j2 / 1000)) {
            this.surfaceTextureHelper.returnTextureFrame(true);
            return;
        }
        VideoFrame.TextureBuffer createTextureBuffer = this.surfaceTextureHelper.createTextureBuffer(this.width, this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
        onFrame(createTextureBuffer, this.width, this.height, 0, j2);
        createTextureBuffer.release();
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        startCapture(i, i2, i3);
    }

    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.frameInterval = 1000 / i3;
        DebugLogUtils.isEnableDebugLog();
        try {
            Cert ttlsScreenVideoRecordStartRecord = DataflowID0x58004001.ttlsScreenVideoRecordStartRecord();
            MediaProjectionManager mediaProjectionManager = this.mediaProjectionManager;
            Intent intent = this.mediaProjectionPermissionResultData;
            C29174Bcg.LIZ.getClass();
            this.mediaProjection = P34.LIZJ(mediaProjectionManager, -1, intent, ttlsScreenVideoRecordStartRecord);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaProjectionManager getMediaProjection ");
            LIZ.append(this.mediaProjection);
            AVLog.ioi("ScreenVideoCapturer", X1D.LIZIZ(LIZ));
            MediaProjection mediaProjection = this.mediaProjection;
            if (mediaProjection == null) {
                this.mObserver.onVideoCaptureError(-203, new Exception("mediaProjection is null, please check permission"));
                return;
            }
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.surfaceTextureHelper.startListening(this);
            this.mStat = 1;
            VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
            if (videoCapturerObserver != null) {
                videoCapturerObserver.onVideoCaptureStarted();
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MediaProjectionManager getMediaProjection fail(): ");
            LIZ2.append(e.getMessage());
            AVLog.ioe("ScreenVideoCapturer", X1D.LIZIZ(LIZ2));
            this.mObserver.onVideoCaptureError(-202, e);
        }
    }
}
