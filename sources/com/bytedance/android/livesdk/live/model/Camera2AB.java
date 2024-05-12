package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class Camera2AB {

    @InterfaceC65349Pkn("camera_hw_level")
    public int cameraHWLevel;

    @InterfaceC65349Pkn("camera_type")
    public int cameraType;

    public Camera2AB() {
        this.cameraType = 1;
    }

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
