package com.bytedance.realx.video;

import X.V0N;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraVideoCapturer;

/* loaded from: classes33.dex */
public interface CameraSession {

    /* loaded from: classes33.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* loaded from: classes33.dex */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    int enableFollowGravity(boolean z);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    int setCameraZoomRatio(float f);

    void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode);

    void stop();

    void turnOffFlashLight();

    void turnOnFlashLight();

    /* loaded from: classes33.dex */
    public enum UIDeviceOrientation {
        Portrait(0),
        LandscapeLeft(90),
        PortraitUpsideDown(180),
        LandscapeRight(270);

        public int value;

        public int value() {
            return this.value;
        }

        public static UIDeviceOrientation valueOf(String str) {
            return (UIDeviceOrientation) V0N.LJJJ(UIDeviceOrientation.class, str);
        }

        UIDeviceOrientation(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED;

        public static FailureType valueOf(String str) {
            return (FailureType) V0N.LJJJ(FailureType.class, str);
        }
    }
}
