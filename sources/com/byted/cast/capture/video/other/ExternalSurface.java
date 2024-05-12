package com.byted.cast.capture.video.other;

import X.X1D;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.byted.cast.capture.encoder.VideoEncoder;
import com.byted.cast.capture.surface.GLSurfaceManager;
import com.byted.cast.capture.video.VideoRecorderBase;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.mediacommon.utils.Utils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes29.dex */
public class ExternalSurface extends VideoRecorderBase {
    public Surface mEncodeSurface;
    public GLSurfaceManager mGLSurfaceManager;
    public ISurfaceListener mSurfaceListener;

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public String getTag() {
        return "ExternalSurface";
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setConfig(Config config) {
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setFlashEnable(boolean z) {
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void stop() {
        Logger.i("ExternalSurface", "stop");
        GLSurfaceManager gLSurfaceManager = this.mGLSurfaceManager;
        if (gLSurfaceManager != null) {
            gLSurfaceManager.removeSurface(this.mEncodeSurface);
            this.mGLSurfaceManager = null;
        }
        Surface surface = this.mEncodeSurface;
        if (surface != null) {
            surface.release();
            this.mEncodeSurface = null;
        }
        if (this.mVideoEncoder != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mVideoEncoder stop:");
            LIZ.append(this.mVideoEncoder);
            Logger.i("ExternalSurface", X1D.LIZIZ(LIZ));
            this.mVideoEncoder.release();
            this.mVideoEncoder = null;
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void start(MediaProjection mediaProjection) {
        Logger.i("ExternalSurface", "start +");
        this.mVideoEncoder.start();
        Logger.i("ExternalSurface", "start -");
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void prepare(GLSurfaceManager gLSurfaceManager, int i) {
        Logger.i("ExternalSurface", "prepare");
        init();
        this.mVideoEncoder = new VideoEncoder(this.mContext, this.mVideoProfile, this.mVideoListener);
        this.mGLSurfaceManager = gLSurfaceManager;
        this.mWidth = Utils.Alias8(this.mWidth);
        this.mHeight = Utils.Alias8(this.mHeight);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start, prepareVideoEncoder mCodecType");
        LIZ.append(this.mCodecType);
        LIZ.append(", width:");
        LIZ.append(this.mWidth);
        LIZ.append(", height:");
        LIZ.append(this.mHeight);
        LIZ.append(", mFps");
        LIZ.append(this.mFps);
        LIZ.append(", mBitrate");
        LIZ.append(this.mBitrate);
        Logger.i("ExternalSurface", X1D.LIZIZ(LIZ));
        if (!this.mVideoEncoder.checkVideoEncoderFormat(this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024)) {
            Logger.e("ExternalSurface", "checkVideoEncoderFormat failed, will set default format!!!");
            this.mWidth = this.mVideoEncoder.getDefaultWidth();
            this.mHeight = this.mVideoEncoder.getDefaultHeight();
            this.mFps = this.mVideoEncoder.getDefaultFrameRate();
            this.mBitrate = this.mVideoEncoder.getDefaultBitrate();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("change formate to width:");
            LIZ2.append(this.mWidth);
            LIZ2.append(", height:");
            LIZ2.append(this.mHeight);
            LIZ2.append(", mFps");
            LIZ2.append(this.mFps);
            LIZ2.append(", mBitrate");
            LIZ2.append(this.mBitrate);
            Logger.e("ExternalSurface", X1D.LIZIZ(LIZ2));
        }
        Surface prepareVideoEncoder = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, false);
        this.mEncodeSurface = prepareVideoEncoder;
        if (prepareVideoEncoder == null) {
            if (this.mVideoListener != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("resolution:");
                LIZ3.append(this.mWidth);
                LIZ3.append("x");
                LIZ3.append(this.mHeight);
                MediaMonitor.onMonitor("MediaCapture_Error", 14004009, "unsupported resolution", X1D.LIZIZ(LIZ3));
            }
            Logger.e("ExternalSurface", "init mediacodec fail, will try with 1920x1080, 30fps, 8Mb/s");
            this.mWidth = 1920;
            this.mHeight = 1080;
            this.mFps = 30;
            this.mBitrate = FileUtils.BUFFER_SIZE;
            Surface prepareVideoEncoder2 = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, 1920, 1080, 30, 8388608, false);
            this.mEncodeSurface = prepareVideoEncoder2;
            if (prepareVideoEncoder2 == null) {
                Logger.e("ExternalSurface", "init mediacodec fail, will try with 1280x720, 30fps, 8Mb/s");
                this.mWidth = 1280;
                this.mHeight = 720;
                this.mFps = 30;
                this.mBitrate = FileUtils.BUFFER_SIZE;
                Surface prepareVideoEncoder3 = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, 1280, 720, 30, 8388608, false);
                this.mEncodeSurface = prepareVideoEncoder3;
                if (prepareVideoEncoder3 == null) {
                    Logger.e("ExternalSurface", "init mediacodec fail, will try OMX.google.h264.encoder");
                    Surface prepareVideoEncoder4 = this.mVideoEncoder.prepareVideoEncoder("OMX.google.h264.encoder", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, true);
                    this.mEncodeSurface = prepareVideoEncoder4;
                    if (prepareVideoEncoder4 == null) {
                        Logger.e("ExternalSurface", "fail to init codec again !!!!");
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
        ISurfaceListener iSurfaceListener = this.mSurfaceListener;
        if (iSurfaceListener == null) {
            Logger.e("ExternalSurface", "mSurfaceListener is null!!!");
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "nullptr", "mSurfaceListener is null");
            return;
        }
        GLSurfaceManager gLSurfaceManager2 = this.mGLSurfaceManager;
        if (gLSurfaceManager2 != null) {
            gLSurfaceManager2.setDefaultBufferSize(this.vitrualDisplayW, this.vitrualDisplayH);
            this.mGLSurfaceManager.setDefaultOutputSurface(this.mEncodeSurface, MediaSetting.FILL_TYPE.PADDING);
            this.mSurfaceListener.surfaceAvailable(this.mGLSurfaceManager.getInputSurface(), this.vitrualDisplayW, this.vitrualDisplayH);
            return;
        }
        iSurfaceListener.surfaceAvailable(this.mEncodeSurface, this.vitrualDisplayW, this.vitrualDisplayH);
    }

    public ExternalSurface(Context context, VideoProfile videoProfile, VideoRecorderManager.IVideoCallback iVideoCallback, ISurfaceListener iSurfaceListener) {
        super(context, videoProfile, iVideoCallback);
        this.mSurfaceListener = iSurfaceListener;
    }
}
