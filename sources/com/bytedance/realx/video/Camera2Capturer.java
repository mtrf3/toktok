package com.bytedance.realx.video;

import X.C16880lQ;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import com.bytedance.realx.video.CameraSession;
import com.bytedance.realx.video.CameraVideoCapturer;

/* loaded from: classes33.dex */
public class Camera2Capturer extends CameraCapturer {
    public final CameraManager cameraManager;
    public final Context context;

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ float getCameraZoomMaxRatio() {
        return super.getCameraZoomMaxRatio();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ int getDeviceOrientation() {
        return super.getDeviceOrientation();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraTorchSupported() {
        return super.isCameraTorchSupported();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isCameraZoomSupported() {
        return super.isCameraZoomSupported();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // com.bytedance.realx.video.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOffFlashLight() {
        super.turnOffFlashLight();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void turnOnFlashLight() {
        super.turnOnFlashLight();
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ int enableFollowGravity(boolean z) {
        return super.enableFollowGravity(z);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ int setCameraZoomRatio(float f) {
        return super.setCameraZoomRatio(f);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    public Camera2Capturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.context = context;
        this.cameraManager = (CameraManager) C16880lQ.LLILL(context, "camera");
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3) {
        super.startCapture(i, i2, i3);
    }

    @Override // com.bytedance.realx.video.CameraCapturer, com.bytedance.realx.video.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3, int i4) {
        super.startCapture(i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }
}
