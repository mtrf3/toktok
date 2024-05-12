package com.bytedance.realx.video;

import android.content.Context;

/* loaded from: classes33.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    int enableFollowGravity(boolean z);

    float getCameraZoomMaxRatio();

    int getDeviceOrientation();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isCameraTorchSupported();

    boolean isCameraZoomSupported();

    boolean isScreencast();

    int setCameraZoomRatio(float f);

    void startCapture(int i, int i2, int i3);

    void startCapture(int i, int i2, int i3, int i4);

    void stopCapture();

    void turnOffFlashLight();

    void turnOnFlashLight();
}
