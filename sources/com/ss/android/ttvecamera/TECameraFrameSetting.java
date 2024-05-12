package com.ss.android.ttvecamera;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class TECameraFrameSetting {
    public boolean isMatchFrameHandleFps;
    public byte[] mBufferData;
    public int mBufferSize;
    public int mCameraFacing;
    public int mCameraFormat;
    public int mCameraFrameHeight;
    public int mCameraFrameWidth;
    public int mCameraOutputMode;
    public int mCameraRotation;
    public int mCameraTextureID;
    public Bitmap mDirectBitmap;
    public int mExposureTime;
    public int mExtRotate;
    public int mIso;
    public float[] mMVPMatrix;
    public int mMaxIso;
    public HashMap<String, Integer> mMetadataMap;
    public int mMinIso;
    public ByteBuffer mUBuf;
    public int[] mUParams;
    public ByteBuffer mVBuf;
    public int[] mVParams;
    public ByteBuffer mYBuf;
    public int[] mYParams;
    public long timestampInNS;
    public int mAeState = -1;
    public boolean isDependSurfaceTimestamp = true;

    public int getAeState() {
        return this.mAeState;
    }

    public byte[] getBufferData() {
        return this.mBufferData;
    }

    public int getBufferDataSize() {
        return this.mBufferSize;
    }

    public int getCameraFacing() {
        return this.mCameraFacing;
    }

    public int getCameraFormat() {
        return this.mCameraFormat;
    }

    public int getCameraFrameHeight() {
        return this.mCameraFrameHeight;
    }

    public int getCameraFrameWidth() {
        return this.mCameraFrameWidth;
    }

    public int getCameraOutPutMode() {
        return this.mCameraOutputMode;
    }

    public int getCameraRotation() {
        return this.mCameraRotation;
    }

    public int getCameraTextureID() {
        return this.mCameraTextureID;
    }

    public Bitmap getDirectBitmap() {
        return this.mDirectBitmap;
    }

    public int getExposureTime() {
        return this.mExposureTime;
    }

    public int getExtRotate() {
        return this.mExtRotate;
    }

    public int getIso() {
        return this.mIso;
    }

    public float[] getMVPMatrix() {
        return this.mMVPMatrix;
    }

    public int getMaxIso() {
        return this.mMaxIso;
    }

    public HashMap<String, Integer> getMetadata() {
        return this.mMetadataMap;
    }

    public int getMinIso() {
        return this.mMinIso;
    }

    public long getTimestampInNS() {
        return this.timestampInNS;
    }

    public ByteBuffer getUBuffer() {
        return this.mUBuf;
    }

    public int[] getUParams() {
        return this.mUParams;
    }

    public ByteBuffer getVBuffer() {
        return this.mVBuf;
    }

    public int[] getVParams() {
        return this.mVParams;
    }

    public ByteBuffer getYBuffer() {
        return this.mYBuf;
    }

    public int[] getYParams() {
        return this.mYParams;
    }

    public boolean isDependSurfaceTimestamp() {
        return this.isDependSurfaceTimestamp;
    }

    public boolean isMatchFrameHandleFps() {
        return this.isMatchFrameHandleFps;
    }

    public void setCameraFrameWidth(int i) {
        this.mCameraFrameWidth = i;
    }

    public void setCameraOutPutMode(int i) {
        this.mCameraOutputMode = i;
    }

    public void setCameraRotation(int i) {
        this.mCameraRotation = i;
    }

    public void setCameraTextureID(int i) {
        this.mCameraTextureID = i;
    }

    public void setDependSurfaceTimestamp(boolean z) {
        this.isDependSurfaceTimestamp = z;
    }

    public void setDirectBitmap(Bitmap bitmap) {
        this.mDirectBitmap = bitmap;
    }

    public void setEnableMatchFrameHandleFps(boolean z) {
        this.isMatchFrameHandleFps = z;
    }

    public void setMVPMatrix(float[] fArr) {
        this.mMVPMatrix = fArr;
    }

    public void setMetadata(HashMap<String, Integer> hashMap) {
        this.mMetadataMap = hashMap;
        this.mAeState = hashMap.get("aeState").intValue();
    }

    public void setTimestampInNS(long j) {
        this.timestampInNS = j;
    }

    public void setmCameraFacing(int i) {
        this.mCameraFacing = i;
    }

    public void setmCameraFrameHeight(int i) {
        this.mCameraFrameHeight = i;
    }

    public TECameraFrameSetting(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.mBufferData = bArr;
        this.mBufferSize = i;
        this.mCameraFrameWidth = i2;
        this.mCameraFrameHeight = i3;
        this.mCameraRotation = i4;
        this.mCameraFormat = i5;
    }

    public TECameraFrameSetting(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6) {
        this.mCameraOutputMode = i;
        this.mCameraFrameWidth = i2;
        this.mCameraFrameHeight = i3;
        this.mCameraRotation = i4;
        this.mCameraFacing = i5;
        this.mBufferData = bArr;
        this.mCameraFormat = i6;
    }

    public TECameraFrameSetting(int i, int i2, int i3, int i4, int i5, float[] fArr, int i6, int i7, int i8) {
        this.mCameraTextureID = i;
        this.mCameraOutputMode = i2;
        this.mCameraFrameWidth = i3;
        this.mCameraFrameHeight = i4;
        this.mCameraRotation = i5;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i6;
        this.mCameraFormat = i7;
        this.mExtRotate = i8;
    }

    public TECameraFrameSetting(int i, int i2, int i3, int i4, int i5, float[] fArr, int i6, byte[] bArr, int i7) {
        this.mCameraTextureID = i;
        this.mCameraOutputMode = i2;
        this.mCameraFrameWidth = i3;
        this.mCameraFrameHeight = i4;
        this.mCameraRotation = i5;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i6;
        this.mBufferData = bArr;
        this.mCameraFormat = i7;
    }

    public TECameraFrameSetting(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4) {
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFrameWidth = i;
        this.mCameraFrameHeight = i2;
        this.mCameraRotation = i3;
        this.mCameraFormat = i4;
    }

    public TECameraFrameSetting(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i6) {
        this.mCameraOutputMode = i;
        this.mCameraFrameWidth = i2;
        this.mCameraFrameHeight = i3;
        this.mCameraRotation = i4;
        this.mCameraFacing = i5;
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFormat = i6;
    }

    public TECameraFrameSetting(int i, int i2, int i3, int i4, int i5, float[] fArr, int i6, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i7) {
        this.mCameraTextureID = i;
        this.mCameraOutputMode = i2;
        this.mCameraFrameWidth = i3;
        this.mCameraFrameHeight = i4;
        this.mCameraRotation = i5;
        this.mMVPMatrix = fArr;
        this.mCameraFacing = i6;
        this.mYBuf = byteBuffer;
        this.mUBuf = byteBuffer2;
        this.mVBuf = byteBuffer3;
        this.mYParams = iArr;
        this.mUParams = iArr2;
        this.mVParams = iArr3;
        this.mCameraFormat = i7;
    }
}
