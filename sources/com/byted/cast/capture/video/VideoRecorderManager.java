package com.byted.cast.capture.video;

import X.X1D;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.byted.cast.capture.surface.GLSurfaceManager;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.capture.video.camera.CameraRecorder;
import com.byted.cast.capture.video.other.ExternalSurface;
import com.byted.cast.capture.video.screen.ScreenRecorder;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.HandlerWrapper;
import com.byted.cast.mediacommon.utils.Logger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes29.dex */
public class VideoRecorderManager {
    public static Object vLockStop = new Object();
    public boolean bPrepare;
    public GLSurfaceManager glSurfaceManager;
    public Context mContext;
    public boolean mIsCaptureStarted;
    public MediaProjection mMediaProjection;
    public final ScreenRecordThread mScreenRecordManagerThread = new ScreenRecordThread();
    public final HandlerWrapper mScreenRecordManagerThreadHandler;
    public int mScreenRotation;
    public MediaSetting mSetting;
    public ISurfaceListener mSurfaceListener;
    public IVideoCallback mVideoCallback;
    public VideoProfile mVideoProfile;
    public VideoRecorderBase mVideoRecoder;
    public VirtualDisplay.Callback mVirtualDisplayCallback;

    /* loaded from: classes29.dex */
    public interface IVideoCallback {
        void onCreateVirtualDisplayFail(String str);

        void onRecevieFrameTimeout();

        void onVideoEncoder(String str, int i, int i2, int i3, int i4);

        void onVideoEncoderStop();

        void onVideoFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2, MediaSetting.VideoFormat videoFormat, long j, int i3, int i4);

        void onVideoFrameCodec(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4);

        void onVideoOutputFormatChange(MediaFormat mediaFormat);

        void onVideoRecordError(int i, String str);

        void onVideoSizeChanged(int i);
    }

    /* loaded from: classes29.dex */
    public static class ScreenRecordThread extends HandlerThread {
        public ScreenRecordThread() {
            super("VideoRecorderManagerThread", -16);
        }
    }

    /* renamed from: com.byted.cast.capture.video.VideoRecorderManager$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$mediacommon$MediaSetting$VIDEO_SOURCE_TYPE;

        static {
            int[] iArr = new int[MediaSetting.VIDEO_SOURCE_TYPE.values().length];
            $SwitchMap$com$byted$cast$mediacommon$MediaSetting$VIDEO_SOURCE_TYPE = iArr;
            try {
                iArr[MediaSetting.VIDEO_SOURCE_TYPE.SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$mediacommon$MediaSetting$VIDEO_SOURCE_TYPE[MediaSetting.VIDEO_SOURCE_TYPE.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$mediacommon$MediaSetting$VIDEO_SOURCE_TYPE[MediaSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$3() {
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reStart$5() {
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase == null) {
            return;
        }
        videoRecorderBase.stop();
        this.bPrepare = false;
        lambda$prepareVideoEncoder$0();
        this.mVideoRecoder.start(this.mMediaProjection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resume$4() {
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$2() {
        MediaMonitor.onMonitor("MediaCapture_VideoRecorder_Stop", "");
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.stop();
            this.mVideoRecoder = null;
        }
        this.mMediaProjection = null;
        this.bPrepare = false;
        this.mIsCaptureStarted = false;
        synchronized (vLockStop) {
            vLockStop.notify();
            Logger.i("VideoRecorderManager", "vLockStop.notify");
        }
    }

    public Surface getInputSurface() {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            return gLSurfaceManager.getInputSurface();
        }
        return null;
    }

    public void insertFrame() {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.insertFrame();
        }
    }

    public boolean isStoped() {
        return !this.mIsCaptureStarted;
    }

    public void pause() {
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZJ
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$pause$3();
            }
        });
    }

    public void prepareVideoEncoder() {
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZL
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$prepareVideoEncoder$0();
            }
        });
    }

    public void release() {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.release();
            this.glSurfaceManager = null;
        }
    }

    public void requestIDR() {
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.requestIDR();
        }
    }

    public void resume() {
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZK
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$resume$4();
            }
        });
    }

    public void stop() {
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZM
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$stop$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareVideoEncoder$0() {
        initVideoRecoder();
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase == null) {
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "nullptr", "prepare mVideoRecoder is null");
            Logger.e("VideoRecorderManager", "initVideoRecoder ERROR mVideoRecoder is null");
        } else {
            videoRecorderBase.prepare(this.glSurfaceManager, this.mScreenRotation);
            this.bPrepare = true;
        }
    }

    public void initVideoRecoder() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initVideoRecoder:");
        LIZ.append(this.mVideoProfile.getSourceType());
        LIZ.append(this.mVideoProfile);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        int i = AnonymousClass1.$SwitchMap$com$byted$cast$mediacommon$MediaSetting$VIDEO_SOURCE_TYPE[this.mVideoProfile.getSourceType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Logger.e("VideoRecorderManager", "setCaptureSource Do not support type");
                } else {
                    this.mVideoRecoder = new ExternalSurface(this.mContext, this.mVideoProfile, this.mVideoCallback, this.mSurfaceListener);
                }
            } else {
                this.mVideoRecoder = new CameraRecorder(this.mContext, this.mSetting, this.mVideoCallback);
            }
        } else {
            this.mVideoRecoder = new ScreenRecorder(this.mContext, this.mVideoProfile, this.mVideoCallback, this.mVirtualDisplayCallback);
        }
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.setVideoProfile(this.mVideoProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1(MediaProjection mediaProjection) {
        MediaMonitor.onMonitor("MediaCapture_VideoRecorder_Start", "");
        if (!this.bPrepare) {
            lambda$prepareVideoEncoder$0();
        }
        this.mMediaProjection = mediaProjection;
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.start(mediaProjection);
        }
        this.mIsCaptureStarted = true;
    }

    public void changeSurfaceFillType(MediaSetting.FILL_TYPE fill_type) {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.changeSurfaceFillType(fill_type);
        }
    }

    public void enableSetMaxFps(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSetMaxFps: ");
        LIZ.append(z);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        this.mVideoProfile.enableSetMaxFps(z);
    }

    public boolean getPicture(String str) {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            return gLSurfaceManager.getPicture(str);
        }
        return false;
    }

    public void reStart(int i) {
        Logger.i("VideoRecorderManager", "reStart: ");
        this.mScreenRotation = i;
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZI
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$reStart$5();
            }
        });
    }

    public void removeSurface(Surface surface) {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.removeSurface(surface);
        }
    }

    public void setBitrateKbps(int i) {
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.setBitrateKbps(i);
        }
    }

    public void setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE video_source_type) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCaptureSource: ");
        LIZ.append(video_source_type);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        if (this.mVideoProfile.getSourceType() == video_source_type) {
            return;
        }
        this.mVideoProfile.setSourceType(video_source_type);
        if (this.mIsCaptureStarted) {
            if (video_source_type == MediaSetting.VIDEO_SOURCE_TYPE.SCREEN) {
                i = this.mScreenRotation;
            } else {
                i = 0;
            }
            reStart(i);
        }
    }

    public void setConfig(Config config) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setConfig: ");
        LIZ.append(config);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        MediaSetting mediaSetting = this.mSetting;
        if (mediaSetting != null) {
            mediaSetting.setConfig(config);
        }
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.setConfig(config);
        }
    }

    public void setFlashEnable(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFlashEnable: ");
        LIZ.append(z);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        VideoRecorderBase videoRecorderBase = this.mVideoRecoder;
        if (videoRecorderBase != null) {
            videoRecorderBase.setFlashEnable(z);
        }
    }

    public void setInputSurfaceListener(ISurfaceListener iSurfaceListener) {
        this.mSurfaceListener = iSurfaceListener;
    }

    public void setResizeScreen(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setResizeScreen: ");
        LIZ.append(z);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        this.mVideoProfile.setNeedResize(z);
    }

    public void setVideoCodecID(MediaSetting.VCODEC_ID vcodec_id) {
        this.mVideoProfile.setCodecId(vcodec_id);
    }

    public void setVirtualDisplayFlag(int i) {
        this.mVideoProfile.setVirtualDisplayFlag(i);
    }

    public void setVirtualDisplayName(String str) {
        this.mVideoProfile.setVirtualDisplayName(str);
    }

    public void start(final MediaProjection mediaProjection) {
        this.mScreenRecordManagerThreadHandler.post(new Runnable() { // from class: X.ZZH
            @Override // java.lang.Runnable
            public final void run() {
                VideoRecorderManager.this.lambda$start$1(mediaProjection);
            }
        });
    }

    public void switchCamera(String str) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchCamera: ");
        LIZ.append(str);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        try {
            i = CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseInt cameraId ");
            LIZ2.append(str);
            LIZ2.append(" error:");
            LIZ2.append(e);
            Logger.e("VideoRecorderManager", X1D.LIZIZ(LIZ2));
            i = 0;
        }
        this.mVideoProfile.setCameraInfo(i);
        if (this.mIsCaptureStarted && this.mVideoProfile.getSourceType() == MediaSetting.VIDEO_SOURCE_TYPE.CAMERA) {
            reStart(0);
        }
    }

    public void setVirtualDisplayWH(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayWH: ");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        Logger.i("VideoRecorderManager", X1D.LIZIZ(LIZ));
        this.mVideoProfile.setVirtualDisplayWH(i, i2);
    }

    public void addSurface(Surface surface, MediaSetting.FILL_TYPE fill_type, boolean z) {
        GLSurfaceManager gLSurfaceManager = this.glSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.addSurface(surface, fill_type, z);
        }
    }

    public VideoRecorderManager(Context context, MediaSetting mediaSetting, IVideoCallback iVideoCallback, VirtualDisplay.Callback callback) {
        this.mContext = context;
        this.mSetting = mediaSetting;
        this.mVideoProfile = mediaSetting.getVideoProfile();
        this.mVideoCallback = iVideoCallback;
        this.mVirtualDisplayCallback = callback;
        if (this.mVideoProfile.isOpenGlEnable()) {
            try {
                this.glSurfaceManager = new GLSurfaceManager(this.mVideoProfile);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GLSurfaceManager Init Error : ");
                LIZ.append(e.toString());
                Logger.e("VideoRecorderManager", X1D.LIZIZ(LIZ));
                this.glSurfaceManager = null;
            }
        } else {
            this.glSurfaceManager = null;
        }
        this.mScreenRecordManagerThread.start();
        this.mScreenRecordManagerThreadHandler = new HandlerWrapper(new Handler(this.mScreenRecordManagerThread.getLooper()));
    }

    public void setDisplay(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            this.mVideoProfile.setResolution(i, i2);
        }
        if (i3 > 0) {
            this.mVideoProfile.setBitrate(i3, i3);
        }
        if (i4 > 0) {
            this.mVideoProfile.setFps(i4);
        }
    }
}
