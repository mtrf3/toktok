package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public class CaptureBase {

    @Serialized("audioCapture")
    public AudioCaptureParams audioCapture = new AudioCaptureParams();

    @Serialized("videoCapture")
    public VideoCaptureParams videoCapture = new VideoCaptureParams();

    /* loaded from: classes12.dex */
    public static class AudioCaptureParams {

        @Serialized("delayScreenMicPackage")
        public int delayScreenMicPackage;

        @Serialized("audioUsingHighQuality")
        public boolean useHighQuality;

        @Serialized("audioCaptureDevice")
        public int device = 5;

        @Serialized("gameInnerVolume")
        public float gameInnerVolume = 0.1f;

        @Serialized("audioCaptureSample")
        public int sample = 44100;

        @Serialized("audioCaptureChannel")
        public int channel = 1;
        public int audioCaptureBitwidth = 16;

        @Serialized("audioCaptureSampleOnVoIP")
        public int sampleOnVoIP = 16000;

        @Serialized("audioCaptureChannelOnVoIP")
        public int channelOnVoIP = 1;
    }

    /* loaded from: classes12.dex */
    public static class VideoCaptureParams {

        @Serialized("cameraFaceAEStrategy")
        public int cameraFaceAEStrategy;

        @Serialized("cameraFrameFormat")
        public int cameraFrameFormat;

        @Serialized("cameraFrameRateStrategy")
        public int cameraFrameRateStrategy;

        @Serialized("camera_log_level")
        public int cameraLogLevel;

        @Serialized("camera_open_retry_cnt")
        public int cameraOpenRetryCount;

        @Serialized("camera_retry_start_preview_cnt")
        public int cameraRetryStartPreviewCount;

        @Serialized("cameraType")
        public int cameraType;

        @Serialized("enablePreviewTemplate")
        public boolean enableCameraPreviewTemplate;

        @Serialized("enableCameraStabilization")
        public boolean enableCameraStabilization;

        @Serialized("enable_change_fps")
        public boolean enableChangeCameraFpsWhenRunning;

        @Serialized("enableFallback")
        public boolean enableFallback;

        @Serialized("enableMinCapFpsChange")
        public boolean enableMinCapFpsChange;

        @Serialized("enableOpenCamera1Opt")
        public boolean enableOpenCamera1Opt;

        @Serialized("enableWideAngle")
        public boolean enableWideAngle;

        @Serialized("fixFpsRangeCompareBug")
        public boolean fixFpsRangeCompareBug;

        @Serialized("is_camera_open_close_sync")
        public boolean isCameraOpenCloseSync;

        @Serialized("isForceCloseCamera")
        public boolean isForceCloseCamera;

        @Serialized("videoCaptureMinFps")
        public int minFps;

        @Serialized("need_oes_to_2d")
        public boolean needOesTo2D;

        @Serialized("resetFpsRange")
        public boolean resetFpsRange;

        @Serialized("textureMinFilter")
        public String textureMinFilter;

        @Serialized("useCamera2API")
        public boolean useCamera2Api;

        @Serialized("videoCaptureDevice")
        public int device = 4;

        @Serialized("videoCaptureWidth")
        public int width = 720;

        @Serialized("videoCaptureHeight")
        public int height = 1280;

        @Serialized("videoCaptureFps")
        public int fps = 30;

        @Serialized("radioModeFps")
        public int radioModeFps = -1;

        @Serialized("enableWideFov")
        public boolean enableWideFov = true;

        @Serialized("requiredCameraLevel")
        public int requiredCameraLevel = -1;

        @Serialized("cameraMode")
        public int cameraMode = -1;

        @Serialized("enableFrontFacingVideoContinueFocus")
        public boolean enableFrontCameraContinueFocus = true;

        @Serialized("enableCallBackStop")
        public boolean enableCallBackStop = true;

        @Serialized("try_delive_frame_with_time")
        public boolean tryDeliverFrameWithTime = true;

        @Serialized("using_self_define_timestamp")
        public boolean usingSelfDefineTimeStamp = true;
    }
}
