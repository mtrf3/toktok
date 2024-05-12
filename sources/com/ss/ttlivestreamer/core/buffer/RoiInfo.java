package com.ss.ttlivestreamer.core.buffer;

import com.ss.ttlivestreamer.core.engine.NativeObject;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class RoiInfo extends NativeObject {
    public long externalNativeObj;

    private native void nativeCreate();

    private native int nativeGetCenterPosX();

    private native int nativeGetCenterPosY();

    private native ByteBuffer nativeGetFacePointsData();

    private native int nativeGetRoiHeight();

    private native float nativeGetRoiPitch();

    private native float nativeGetRoiRoll();

    private native int nativeGetRoiWidth();

    private native float nativeGetRoiYaw();

    private native int[] nativeGetStretchedRoi();

    private native void nativeLockFacePointsData();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetRoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3);

    private native void nativeUnlockFacePointsData();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        if (this.externalNativeObj != 0) {
            setNativeObj(0L);
            this.externalNativeObj = 0L;
        }
        super.release();
    }

    public RoiInfo() {
        nativeCreate();
    }

    public int getCenterPosX() {
        return nativeGetCenterPosX();
    }

    public int getCenterPosY() {
        return nativeGetCenterPosY();
    }

    public ByteBuffer getFacePointsData() {
        return nativeGetFacePointsData();
    }

    public int getRoiHeight() {
        return nativeGetRoiHeight();
    }

    public float getRoiPitch() {
        return nativeGetRoiPitch();
    }

    public float getRoiRoll() {
        return nativeGetRoiRoll();
    }

    public int getRoiWidth() {
        return nativeGetRoiWidth();
    }

    public float getRoiYaw() {
        return nativeGetRoiYaw();
    }

    public int[] getStretchedRoi() {
        return nativeGetStretchedRoi();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
    }

    public void lockFacePointsData() {
        nativeLockFacePointsData();
    }

    public void unlockFacePointsData() {
        nativeUnlockFacePointsData();
    }

    public RoiInfo(long j) {
        this.externalNativeObj = j;
        setNativeObj(j);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }

    public RoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this();
        nativeSetRoiInfo(i, i2, i3, i4, f, f2, f3);
    }
}
