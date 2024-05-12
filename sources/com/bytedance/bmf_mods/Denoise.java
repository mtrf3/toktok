package com.bytedance.bmf_mods;

import X.C58096Mr6;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.DenoiseAPI;

/* loaded from: classes34.dex */
public class Denoise implements DenoiseAPI {
    public long mNativePtr;
    public int mAlgType = -1;
    public int[] output_data = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    private native long nativeCreateHydraDenoise();

    private native int nativeGetHydraDenoiseReport(long j, int[] iArr);

    private native int nativeGetHydraDenoiseResult(long j);

    private native int nativeHydraDenoiseOesProcess(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z);

    private native int nativeHydraDenoiseProcess(long j, int i, int i2, int i3, int i4, boolean z);

    private native int nativeHydraDenoiseProcessTexture(long j, int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5);

    private native int nativeInitHydraDenoise(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, int i8, int i9, int i10, int i11);

    private native void nativeReleaseHydraDenoise(long j);

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseHydraDenoise(j);
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int[] GetReport() {
        nativeGetHydraDenoiseReport(this.mNativePtr, this.output_data);
        return this.output_data;
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int GetResult() {
        return nativeGetHydraDenoiseResult(this.mNativePtr);
    }

    public Denoise() {
        Logging.d("New denoise");
    }

    public static DenoiseAPI createDenoiseAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(DenoiseAPI.class, z);
        if (LIZ != null) {
            return (DenoiseAPI) LIZ;
        }
        return new Denoise();
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int ProcessTexture(int i, int i2, int i3, int i4, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeHydraDenoiseProcess(j, i, i2, i3, i4, z);
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr, int i4, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeHydraDenoiseOesProcess(j, i, i2, i3, fArr, i4, z);
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int ProcessTexture(int i, boolean z, int i2, int i3, float[] fArr, int i4, boolean z2, int i5) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeHydraDenoiseProcessTexture(j, i, z, i2, i3, fArr, i4, z2, i5);
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int Init(int i, int i2, int i3, boolean z, String str, int i4, int i5, int i6, int i7) {
        int i8 = i4;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long nativeCreateHydraDenoise = nativeCreateHydraDenoise();
        this.mNativePtr = nativeCreateHydraDenoise;
        if (nativeCreateHydraDenoise == 0) {
            return -1;
        }
        this.mAlgType = 0;
        if (i8 >= 268435456) {
            i8 -= 268435456;
            this.mAlgType = 1;
        }
        return nativeInitHydraDenoise(nativeCreateHydraDenoise, this.mAlgType, 2, 3, i, i2, i3, z, str, i8, i5, i6, i7, 0);
    }

    @Override // com.bytedance.bmf_mods_api.DenoiseAPI
    public int Init(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i3;
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        this.mAlgType = i;
        if (i < 0 || i > 4 || i2 < 1 || i2 > 3) {
            Logging.d("Denoise: alg_type range is [0,4],backend is [2,3] ");
            return -1;
        }
        long nativeCreateHydraDenoise = nativeCreateHydraDenoise();
        this.mNativePtr = nativeCreateHydraDenoise;
        if (nativeCreateHydraDenoise == 0) {
            return -1;
        }
        if (i12 <= 0 || i12 > 10) {
            Logging.d("Denoise: pool size should be more than 0, change to 3 for default");
            i12 = 3;
        }
        return nativeInitHydraDenoise(this.mNativePtr, i, i2, i12, i4, i5, i6, z, str, i7, i8, i9, i10, i11);
    }
}
