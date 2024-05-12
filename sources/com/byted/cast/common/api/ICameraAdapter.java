package com.byted.cast.common.api;

import android.hardware.Camera;

/* loaded from: classes29.dex */
public interface ICameraAdapter {
    Camera openCamera();

    Camera openCamera(int i);

    void releaseCamera(Camera camera);
}
