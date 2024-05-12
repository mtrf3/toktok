package com.byted.cast.capture.video.screen;

import X.X1D;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.util.Size;
import android.view.Surface;
import com.byted.cast.capture.encoder.VideoEncoder;
import com.byted.cast.capture.surface.GLSurfaceManager;
import com.byted.cast.capture.video.VideoRecorderBase;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.ISafetyInterface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.mediacommon.utils.Utils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes29.dex */
public final class ScreenRecorder extends VideoRecorderBase {
    public Surface mEncodeSurface;
    public GLSurfaceManager mGLSurfaceManager;
    public MediaProjection mMediaProjection;
    public ISafetyInterface mSafetyInterface;
    public int mScreenRotation;
    public VideoRecorderManager.IVideoCallback mVideoCallback;
    public VirtualDisplay mVirtualDisplay;
    public volatile VirtualDisplay.Callback mVirtualDisplayCallback;

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public String getTag() {
        return "ScreenRecorder";
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setConfig(Config config) {
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setFlashEnable(boolean z) {
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void stop() {
        Logger.i("ScreenRecorder", "stop +");
        GLSurfaceManager gLSurfaceManager = this.mGLSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.removeSurface(this.mEncodeSurface);
        }
        VideoEncoder videoEncoder = this.mVideoEncoder;
        if (videoEncoder != null) {
            videoEncoder.release();
            this.mVideoEncoder = null;
        }
        Surface surface = this.mEncodeSurface;
        if (surface != null) {
            surface.release();
            this.mEncodeSurface = null;
        }
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.mVirtualDisplay = null;
        }
        this.mMediaProjection = null;
        this.mVirtualDisplayCallback = null;
        this.mGLSurfaceManager = null;
        Logger.i("ScreenRecorder", "stop -");
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void start(MediaProjection mediaProjection) {
        Surface surface;
        int i;
        this.mVideoEncoder = new VideoEncoder(this.mContext, this.mVideoProfile, this.mVideoListener);
        this.mMediaProjection = mediaProjection;
        Logger.i("ScreenRecorder", "start +");
        if (this.mMediaProjection == null) {
            Logger.e("ScreenRecorder", "mMediaProjection is NULL !!!");
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "nullptr", "mMediaProjection is null");
            return;
        }
        if (this.mVideoProfile.isNeedResize()) {
            String property = Utils.getProperty("ro.build.product", "");
            if (property.equals("kkm7642") || property.equals("KKHi3751V900") || property.equals("ab30a5")) {
                Point point = this.mScreenSize;
                int i2 = point.x;
                if (i2 > 1920 && (i = point.y) > 1080) {
                    point.set(i2 / 2, i / 2);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("initialize, change display, x:");
                LIZ.append(this.mScreenSize.x);
                LIZ.append(", y:");
                LIZ.append(this.mScreenSize.y);
                Logger.w("ScreenRecorder", X1D.LIZIZ(LIZ));
            }
            Point point2 = this.mScreenSize;
            Size computeVideoSize = Utils.computeVideoSize(point2.x, point2.y, this.vitrualDisplayW, this.vitrualDisplayH);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start, mScreenSize.x:");
            LIZ2.append(this.mScreenSize.x);
            LIZ2.append(", mScreenSize.y:");
            LIZ2.append(this.mScreenSize.y);
            LIZ2.append(", vitrualDisplayW:");
            LIZ2.append(this.vitrualDisplayW);
            LIZ2.append(", vitrualDisplayH:");
            LIZ2.append(this.vitrualDisplayH);
            LIZ2.append(", sz.getWidth():");
            LIZ2.append(computeVideoSize.getWidth());
            LIZ2.append(", sz.getHeight():");
            LIZ2.append(computeVideoSize.getHeight());
            Logger.i("ScreenRecorder", X1D.LIZIZ(LIZ2));
            this.vitrualDisplayW = computeVideoSize.getWidth();
            this.vitrualDisplayH = computeVideoSize.getHeight();
            this.mWidth = computeVideoSize.getWidth();
            this.mHeight = computeVideoSize.getHeight();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("init, orient:");
            LIZ3.append(this.mOriented);
            LIZ3.append(", mScreenRotation:");
            LIZ3.append(this.mScreenRotation);
            LIZ3.append(", w:");
            LIZ3.append(this.mWidth);
            LIZ3.append(", h:");
            LIZ3.append(this.mHeight);
            Logger.i("ScreenRecorder", X1D.LIZIZ(LIZ3));
        }
        this.vitrualDisplayW = Utils.Alias8(this.vitrualDisplayW);
        this.vitrualDisplayH = Utils.Alias8(this.vitrualDisplayH);
        this.mWidth = Utils.Alias8(this.mWidth);
        this.mHeight = Utils.Alias8(this.mHeight);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("start, prepareVideoEncoder mCodecType");
        LIZ4.append(this.mCodecType);
        LIZ4.append(", width:");
        LIZ4.append(this.mWidth);
        LIZ4.append(", height:");
        LIZ4.append(this.mHeight);
        LIZ4.append(", mFps");
        LIZ4.append(this.mFps);
        LIZ4.append(", mBitrate");
        LIZ4.append(this.mBitrate);
        Logger.i("ScreenRecorder", X1D.LIZIZ(LIZ4));
        if (!this.mVideoEncoder.checkVideoEncoderFormat(this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024)) {
            Logger.e("ScreenRecorder", "checkVideoEncoderFormat failed, will set default format!!!");
            this.mWidth = this.mVideoEncoder.getDefaultWidth();
            this.mHeight = this.mVideoEncoder.getDefaultHeight();
            this.mFps = this.mVideoEncoder.getDefaultFrameRate();
            this.mBitrate = this.mVideoEncoder.getDefaultBitrate();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("change formate to width:");
            LIZ5.append(this.mWidth);
            LIZ5.append(", height:");
            LIZ5.append(this.mHeight);
            LIZ5.append(", mFps");
            LIZ5.append(this.mFps);
            LIZ5.append(", mBitrate");
            LIZ5.append(this.mBitrate);
            Logger.e("ScreenRecorder", X1D.LIZIZ(LIZ5));
        }
        Surface prepareVideoEncoder = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, false);
        this.mEncodeSurface = prepareVideoEncoder;
        if (prepareVideoEncoder == null) {
            if (this.mVideoListener != null) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("resolution:");
                LIZ6.append(this.mWidth);
                LIZ6.append("x");
                LIZ6.append(this.mHeight);
                MediaMonitor.onMonitor("MediaCapture_Error", 14004009, "unsupported resolution", X1D.LIZIZ(LIZ6));
            }
            Logger.e("ScreenRecorder", "init mediacodec fail, will try with 1920x1080, 30fps, 8Mb/s");
            this.mWidth = 1920;
            this.mHeight = 1080;
            this.mFps = 30;
            this.mBitrate = FileUtils.BUFFER_SIZE;
            Surface prepareVideoEncoder2 = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, 1920, 1080, 30, 8388608, false);
            this.mEncodeSurface = prepareVideoEncoder2;
            if (prepareVideoEncoder2 == null) {
                Logger.e("ScreenRecorder", "init mediacodec fail, will try with 1280x720, 30fps, 8Mb/s");
                this.mWidth = 1280;
                this.mHeight = 720;
                this.mFps = 30;
                this.mBitrate = FileUtils.BUFFER_SIZE;
                Surface prepareVideoEncoder3 = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, 1280, 720, 30, 8388608, false);
                this.mEncodeSurface = prepareVideoEncoder3;
                if (prepareVideoEncoder3 == null) {
                    Logger.e("ScreenRecorder", "init mediacodec fail, will try OMX.google.h264.encoder");
                    Surface prepareVideoEncoder4 = this.mVideoEncoder.prepareVideoEncoder("OMX.google.h264.encoder", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, true);
                    this.mEncodeSurface = prepareVideoEncoder4;
                    if (prepareVideoEncoder4 == null) {
                        Logger.e("ScreenRecorder", "fail to init codec again !!!!");
                        VideoEncoder.IRecorderListener iRecorderListener = this.mVideoListener;
                        if (iRecorderListener != null) {
                            iRecorderListener.onVideoRecordError(14004007, "create mediacodec fail");
                            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "nullptr", "mEncodeSurface is null");
                            return;
                        }
                    }
                }
            }
        }
        GLSurfaceManager gLSurfaceManager = this.mGLSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.setDefaultBufferSize(this.vitrualDisplayW, this.vitrualDisplayH);
            this.mGLSurfaceManager.setDefaultOutputSurface(this.mEncodeSurface, MediaSetting.FILL_TYPE.PADDING);
            surface = this.mGLSurfaceManager.getInputSurface();
        } else {
            surface = this.mEncodeSurface;
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("mMediaProjection ");
        LIZ7.append(this.mMediaProjection);
        LIZ7.append(" vitrualDisplayName ");
        LIZ7.append(this.vitrualDisplayName);
        LIZ7.append(" mWidth ");
        LIZ7.append(this.mWidth);
        LIZ7.append(" mHeight ");
        LIZ7.append(this.mHeight);
        LIZ7.append(" mDpi ");
        LIZ7.append(this.mDpi);
        LIZ7.append(" inputSurface ");
        LIZ7.append(surface);
        LIZ7.append("VirtualDisplayWH:");
        LIZ7.append(this.vitrualDisplayW);
        LIZ7.append("x");
        LIZ7.append(this.vitrualDisplayH);
        Logger.i("ScreenRecorder", X1D.LIZIZ(LIZ7));
        try {
            ISafetyInterface iSafetyInterface = this.mSafetyInterface;
            if (iSafetyInterface != null) {
                this.mVirtualDisplay = iSafetyInterface.createVirtualDisplay(this.mMediaProjection, this.vitrualDisplayName, this.vitrualDisplayW, this.vitrualDisplayH, this.mDpi, this.mVirtualDisplayFlag, surface, this.mVirtualDisplayCallback, null);
                this.mVideoEncoder.start();
                Logger.i("ScreenRecorder", "start -");
                return;
            }
            throw new Exception("mSafetyInterface is null");
        } catch (Exception e) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("createVirtualDisplay failed! will retry ... !!!");
            LIZ8.append(e);
            Logger.e("ScreenRecorder", X1D.LIZIZ(LIZ8));
            this.mVideoCallback.onCreateVirtualDisplayFail(e.toString());
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void prepare(GLSurfaceManager gLSurfaceManager, int i) {
        Logger.i("ScreenRecorder", "prepare");
        this.mGLSurfaceManager = gLSurfaceManager;
        this.mScreenRotation = i;
        init();
    }

    public ScreenRecorder(Context context, VideoProfile videoProfile, VideoRecorderManager.IVideoCallback iVideoCallback, VirtualDisplay.Callback callback) {
        super(context, videoProfile, iVideoCallback);
        Logger.i("ScreenRecorder", "construct");
        this.mVideoCallback = iVideoCallback;
        if (this.mVirtualDisplayCallback == null) {
            this.mVirtualDisplayCallback = callback;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init mVirtualDisplayCallback:");
            LIZ.append(this.mVirtualDisplayCallback);
            Logger.d("ScreenRecorder", X1D.LIZIZ(LIZ));
        }
        try {
            this.mSafetyInterface = (ISafetyInterface) Class.forName("com.byted.cast.capture.safetyinterface.SafetyInterface").newInstance();
        } catch (Throwable th) {
            this.mSafetyInterface = null;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create safetyinterface fail : ");
            LIZ2.append(th.toString());
            Logger.e("ScreenRecorder", X1D.LIZIZ(LIZ2));
        }
    }
}
