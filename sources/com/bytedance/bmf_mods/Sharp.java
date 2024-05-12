package com.bytedance.bmf_mods;

import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;

/* loaded from: classes34.dex */
public class Sharp {
    public long mNativePtr;

    private native long nativeCreateHydraSharp();

    private native int nativeHydraSharpGetResultTexture(long j);

    private native int nativeHydraSharpProcess(long j, int i, int i2, int i3);

    private native int nativeHydraSharpProcessOes(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3);

    private native int nativeInitHydraSharp(long j, int i, int i2, int i3, String str, float f, float f2, float f3, boolean z, float f4, float f5);

    private native int nativeInitHydraSharp2(long j, int i, int i2, int i3, int i4, String str, float f, float f2, float f3, boolean z, float f4, float f5);

    private native void nativeReleaseHydraSharp(long j);

    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseHydraSharp(j);
    }

    public int GetResult() {
        return nativeHydraSharpGetResultTexture(this.mNativePtr);
    }

    public Sharp() {
        Logging.d("New Sharp");
    }

    public int ProcessTexture(int i, int i2, int i3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeHydraSharpProcess(j, i, i2, i3);
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        if (fArr == null || fArr2 == null) {
            return nativeHydraSharpProcessOes(j, i, i2, i3, new float[0], new float[0], fArr3);
        }
        return nativeHydraSharpProcessOes(j, i, i2, i3, fArr, fArr2, fArr3);
    }

    public int Init(int i, int i2, int i3, String str, float f, float f2, float f3, boolean z, float f4, float f5) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long nativeCreateHydraSharp = nativeCreateHydraSharp();
        this.mNativePtr = nativeCreateHydraSharp;
        if (nativeCreateHydraSharp == 0) {
            return -1;
        }
        return nativeInitHydraSharp(nativeCreateHydraSharp, i, i2, i3, str, f, f2, f3, z, f4, f5);
    }

    public int Init(int i, int i2, int i3, int i4, String str, float f, float f2, float f3, boolean z, float f4, float f5) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long nativeCreateHydraSharp = nativeCreateHydraSharp();
        this.mNativePtr = nativeCreateHydraSharp;
        if (nativeCreateHydraSharp == 0) {
            return -1;
        }
        return nativeInitHydraSharp2(nativeCreateHydraSharp, i, i2, i3, i4, str, f, f2, f3, z, f4, f5);
    }
}
