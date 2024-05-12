package com.byted.cast.common;

import X.InterfaceC65349Pkn;

/* loaded from: classes29.dex */
public class DisplayInfo {

    @InterfaceC65349Pkn("deviceID")
    public String mDeviceID;

    @InterfaceC65349Pkn("features")
    public int mFeatures;

    @InterfaceC65349Pkn("refreshRate")
    public int mFps;

    @InterfaceC65349Pkn("height")
    public int mHeight;

    @InterfaceC65349Pkn("width")
    public int mWidth;

    @InterfaceC65349Pkn("uuid")
    public String uuid;

    public DisplayInfo() {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mFps = 60;
        this.mDeviceID = "";
        this.mFeatures = 1;
    }

    public String getDeviceID() {
        return this.mDeviceID;
    }

    public int getFeatures() {
        return this.mFeatures;
    }

    public int getFps() {
        return this.mFps;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public DisplayInfo(int i, int i2, int i3, int i4, String str) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        this.mFeatures = i4;
        this.mDeviceID = str;
    }
}
