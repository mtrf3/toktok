package com.bytedance.bmf_mods;

import X.C58096Mr6;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.AdaptiveGradingAPI;

/* loaded from: classes34.dex */
public class AdaptiveGrading implements AdaptiveGradingAPI {
    public long mNativePtr;

    private native int nativeAdaptiveGradingGetResultTexture(long j);

    private native int nativeAdaptiveGradingOesProcess(long j, int i, int i2, int i3, float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    private native int nativeAdaptiveGradingProcess(long j, int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    private native long nativeCreateAdaptiveGrading();

    private native int nativeInitAdaptiveGrading(long j, int i, int i2, String str, float[] fArr, float[] fArr2, float[] fArr3);

    private native void nativeReleaseAdaptiveGrading(long j);

    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseAdaptiveGrading(j);
    }

    public AdaptiveGrading() {
        Logging.d("New AdaptiveGrading");
    }

    public static AdaptiveGradingAPI createAdaptiveGradingAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(AdaptiveGradingAPI.class, z);
        if (LIZ != null) {
            return (AdaptiveGradingAPI) LIZ;
        }
        return new AdaptiveGrading();
    }

    public int Init(int i, int i2, String str, float[] fArr, float[] fArr2, float[] fArr3) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long nativeCreateAdaptiveGrading = nativeCreateAdaptiveGrading();
        this.mNativePtr = nativeCreateAdaptiveGrading;
        if (nativeCreateAdaptiveGrading == 0) {
            return -1;
        }
        return nativeInitAdaptiveGrading(nativeCreateAdaptiveGrading, i, i2, str, fArr, fArr2, fArr3);
    }

    public int ProcessTexture(int i, int i2, int i3, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        int nativeAdaptiveGradingProcess = nativeAdaptiveGradingProcess(j, i, i2, i3, f, f2, f3, f4, f5, f6, z);
        if (nativeAdaptiveGradingProcess == 0) {
            return nativeAdaptiveGradingGetResultTexture(this.mNativePtr);
        }
        return nativeAdaptiveGradingProcess;
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        int nativeAdaptiveGradingOesProcess = nativeAdaptiveGradingOesProcess(j, i, i2, i3, fArr, f, f2, f3, f4, f5, f6, z);
        if (nativeAdaptiveGradingOesProcess == 0) {
            return nativeAdaptiveGradingGetResultTexture(this.mNativePtr);
        }
        return nativeAdaptiveGradingOesProcess;
    }
}
