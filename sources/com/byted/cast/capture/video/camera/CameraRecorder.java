package com.byted.cast.capture.video.camera;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.util.Size;
import android.view.Surface;
import com.byted.cast.capture.encoder.VideoEncoder;
import com.byted.cast.capture.surface.GLSurfaceManager;
import com.byted.cast.capture.video.VideoRecorderBase;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.IMediaCamera;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import com.byted.cast.mediacommon.utils.Utils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes29.dex */
public class CameraRecorder extends VideoRecorderBase {
    public static final String TAG = C16880lQ.LJLLJ(CameraRecorder.class);
    public IMediaCamera mCamera;
    public Surface mEncodeSurface;
    public GLSurfaceManager mGLSurfaceManager;

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void stop() {
        Logger.i(TAG, "stop ");
        IMediaCamera iMediaCamera = this.mCamera;
        if (iMediaCamera != null) {
            iMediaCamera.releaseCamera();
        }
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
        VideoEncoder videoEncoder = this.mVideoEncoder;
        if (videoEncoder != null) {
            videoEncoder.release();
            this.mVideoEncoder = null;
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public String getTag() {
        return TAG;
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setConfig(Config config) {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setConfig ");
        LIZ.append(config);
        Logger.i(str, X1D.LIZIZ(LIZ));
        IMediaCamera iMediaCamera = this.mCamera;
        if (iMediaCamera != null) {
            iMediaCamera.setConfig(config);
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void setFlashEnable(boolean z) {
        Logger.i(TAG, "setFlashEnable ");
        IMediaCamera iMediaCamera = this.mCamera;
        if (iMediaCamera != null) {
            iMediaCamera.setFlashEnable(z);
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void start(MediaProjection mediaProjection) {
        this.mVideoEncoder = new VideoEncoder(this.mContext, this.mVideoProfile, this.mVideoListener);
        String str = TAG;
        Logger.i(str, "start +");
        if (this.mGLSurfaceManager == null) {
            Logger.e(str, "surfaceManager is null, camera must set GLSurfaceManager!!!");
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "nullptr", "mGLSurfaceManager is null");
            return;
        }
        IMediaCamera iMediaCamera = this.mCamera;
        if (iMediaCamera != null) {
            iMediaCamera.openCamera(this.mWidth, this.mHeight, this.mFps, this.mVideoProfile.getCameraInfo(), this.mOriented);
            Point cameraSize = this.mCamera.getCameraSize();
            if (cameraSize == null) {
                Logger.e(str, "openCamera ERROR");
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "openCamera", "openCamera ERROR");
                return;
            }
            Point point = this.mScreenSize;
            if (point.x > point.y) {
                this.vitrualDisplayW = cameraSize.x;
                this.vitrualDisplayH = cameraSize.y;
            } else {
                this.vitrualDisplayW = cameraSize.y;
                this.vitrualDisplayH = cameraSize.x;
            }
            this.mFps = this.mCamera.getFps() / 1000;
        }
        Surface prepareVideoEncoder = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, false);
        this.mEncodeSurface = prepareVideoEncoder;
        if (prepareVideoEncoder == null) {
            Logger.e(str, "init mediacodec fail, will try with OMX.google.h264.encoder");
            Surface prepareVideoEncoder2 = this.mVideoEncoder.prepareVideoEncoder("OMX.google.h264.encoder", this.mCodecType, this.mWidth, this.mHeight, this.mFps, this.mBitrate * 1024, false);
            this.mEncodeSurface = prepareVideoEncoder2;
            if (prepareVideoEncoder2 == null) {
                if (this.mVideoListener != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("resolution:");
                    LIZ.append(this.mWidth);
                    LIZ.append("x");
                    LIZ.append(this.mHeight);
                    MediaMonitor.onMonitor("MediaCapture_Error", 14004009, "unsupported resolution", X1D.LIZIZ(LIZ));
                }
                Logger.e(str, "init mediacodec fail, will try with 360x480, 30fps, 8Mb/s");
                Size computeVideoSize = Utils.computeVideoSize(this.mWidth, this.mHeight, 360, 480);
                this.mWidth = computeVideoSize.getWidth();
                int height = computeVideoSize.getHeight();
                this.mHeight = height;
                this.mFps = 30;
                this.mBitrate = FileUtils.BUFFER_SIZE;
                Surface prepareVideoEncoder3 = this.mVideoEncoder.prepareVideoEncoder("OMX.google.h264.encoder", this.mCodecType, this.mWidth, height, 30, 8388608, false);
                this.mEncodeSurface = prepareVideoEncoder3;
                if (prepareVideoEncoder3 == null) {
                    Logger.e(str, "init mediacodec fail, will try with 720x1280, 30fps, 8Mb/s");
                    int i = this.vitrualDisplayW;
                    this.mWidth = i;
                    int i2 = this.vitrualDisplayH;
                    this.mHeight = i2;
                    this.mFps = 30;
                    this.mBitrate = FileUtils.BUFFER_SIZE;
                    Surface prepareVideoEncoder4 = this.mVideoEncoder.prepareVideoEncoder("", this.mCodecType, i, i2, 30, 8388608, true);
                    this.mEncodeSurface = prepareVideoEncoder4;
                    if (prepareVideoEncoder4 == null) {
                        Logger.e(str, "fail to init codec again !!!!");
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
        this.mGLSurfaceManager.setDefaultBufferSize(this.vitrualDisplayW, this.vitrualDisplayH);
        this.mGLSurfaceManager.setDefaultOutputSurface(this.mEncodeSurface, MediaSetting.FILL_TYPE.PADDING);
        this.mVideoEncoder.start();
        IMediaCamera iMediaCamera2 = this.mCamera;
        if (iMediaCamera2 != null) {
            iMediaCamera2.startPreview(this.mGLSurfaceManager.getInputTexture());
        }
    }

    @Override // com.byted.cast.capture.video.VideoRecorderBase
    public void prepare(GLSurfaceManager gLSurfaceManager, int i) {
        Logger.i(TAG, "prepare");
        this.mGLSurfaceManager = gLSurfaceManager;
        init();
    }

    public CameraRecorder(Context context, MediaSetting mediaSetting, VideoRecorderManager.IVideoCallback iVideoCallback) {
        super(context, mediaSetting.getVideoProfile(), iVideoCallback);
        this.mGLSurfaceManager = null;
        try {
            IMediaCamera iMediaCamera = (IMediaCamera) Class.forName("com.byted.cast.capture.video.camera.MediaCamera").newInstance();
            this.mCamera = iMediaCamera;
            iMediaCamera.setConfig(mediaSetting.getConfig());
        } catch (Throwable unused) {
            this.mCamera = null;
            Logger.e(TAG, "init Error, you need to implementation MediaCamera");
        }
        Logger.i(TAG, "construct");
    }
}
