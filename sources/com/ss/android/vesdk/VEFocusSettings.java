package com.ss.android.vesdk;

import X.C08380Uo;
import X.EnumC81106VsM;
import X.InterfaceC83711WtH;
import X.InterfaceC84079WzD;
import X.InterfaceC84080WzE;
import X.InterfaceC84081WzF;
import X.X1D;

/* loaded from: classes15.dex */
public class VEFocusSettings {
    public InterfaceC84079WzD mCameraFaceFocusPoint;
    public InterfaceC84080WzE mCameraFocusArea;
    public InterfaceC84081WzF mCameraMeteringArea;
    public float mDisplayDensity;
    public InterfaceC83711WtH mFocusCallback;
    public int mHeight;
    public boolean mIsLock;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean mNeedFocus = true;
    public boolean mNeedMetering = true;
    public boolean mFromUser = true;
    public EnumC81106VsM mCoordinatesMode = EnumC81106VsM.VIEW;

    public InterfaceC84079WzD getCameraFaceFocusPoint() {
        return null;
    }

    public InterfaceC84080WzE getCameraFocusArea() {
        return null;
    }

    public InterfaceC84081WzF getCameraMeteringArea() {
        return null;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(this.mX);
        LIZ.append(", ");
        return C08380Uo.LIZ(LIZ, this.mY, "]", LIZ);
    }

    public EnumC81106VsM getCoordinatesMode() {
        return this.mCoordinatesMode;
    }

    public float getDisplayDensity() {
        return this.mDisplayDensity;
    }

    public InterfaceC83711WtH getFocusCallback() {
        return this.mFocusCallback;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public boolean isFromUser() {
        return this.mFromUser;
    }

    public boolean isLock() {
        return this.mIsLock;
    }

    public boolean isNeedFocus() {
        return this.mNeedFocus;
    }

    public boolean isNeedMetering() {
        return this.mNeedMetering;
    }

    public void setCoordinatesMode(EnumC81106VsM enumC81106VsM) {
        this.mCoordinatesMode = enumC81106VsM;
    }

    public void setDisplayDensity(float f) {
        this.mDisplayDensity = f;
    }

    public void setFromUser(boolean z) {
        this.mFromUser = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setLock(boolean z) {
        this.mIsLock = z;
    }

    public void setNeedFocus(boolean z) {
        this.mNeedFocus = z;
    }

    public void setNeedMetering(boolean z) {
        this.mNeedMetering = z;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public VEFocusSettings(int i, int i2, int i3, int i4, float f) {
        this.mWidth = i3;
        this.mHeight = i4;
        this.mX = i;
        this.mY = i2;
        this.mDisplayDensity = f;
    }

    public VEFocusSettings(int i, int i2, int i3, int i4, float f, InterfaceC83711WtH interfaceC83711WtH) {
        this.mWidth = i3;
        this.mHeight = i4;
        this.mX = i;
        this.mY = i2;
        this.mDisplayDensity = f;
        this.mFocusCallback = interfaceC83711WtH;
    }
}
