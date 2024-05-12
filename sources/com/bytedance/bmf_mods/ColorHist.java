package com.bytedance.bmf_mods;

import X.C58096Mr6;
import com.bytedance.bmf_mods.common.Logging;
import com.bytedance.bmf_mods.common.SoLoader;
import com.bytedance.bmf_mods_api.ColorHistAPI;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class ColorHist implements ColorHistAPI {
    public long mNativePtr;
    public m resultJson = new m();
    public float[] output_data = {-1.0f, -1.0f, -1.0f};

    private native int nativeColorHistOesProcess(long j, int i, float[] fArr, int i2, int i3, long j2, float[] fArr2);

    private native int nativeColorHistProcess(long j, int i, int i2, int i3, long j2, float[] fArr);

    private native int nativeColorHistRestStatus(long j);

    private native long nativeCreateColorHist();

    private native int nativeInitColorHist(long j, int i, int i2, int i3, int i4, int i5);

    private native void nativeReleaseColorHist(long j);

    @Override // com.bytedance.bmf_mods_api.ColorHistAPI
    public void Free() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleaseColorHist(j);
    }

    public int ResetStatus() {
        long j = this.mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeColorHistRestStatus(j);
    }

    public ColorHist() {
        Logging.d("New color hist");
    }

    @Override // com.bytedance.bmf_mods_api.ColorHistAPI
    public m GetResult() {
        return this.resultJson;
    }

    public static ColorHistAPI createColorHistAPIbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ColorHistAPI.class, z);
        if (LIZ != null) {
            return (ColorHistAPI) LIZ;
        }
        return new ColorHist();
    }

    @Override // com.bytedance.bmf_mods_api.ColorHistAPI
    public int ProcessTexture(int i, int i2, int i3, long j) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            return -1;
        }
        int nativeColorHistProcess = nativeColorHistProcess(j2, i, i2, i3, j, this.output_data);
        if (nativeColorHistProcess > 0) {
            this.resultJson.LJJIIJ("valid", Integer.valueOf(nativeColorHistProcess));
            this.resultJson.LJJIIJ("constract", Float.valueOf(this.output_data[0]));
            this.resultJson.LJJIIJ("brightness", Float.valueOf(this.output_data[1]));
            this.resultJson.LJJIIJ("saturation", Float.valueOf(this.output_data[2]));
        }
        return nativeColorHistProcess;
    }

    @Override // com.bytedance.bmf_mods_api.ColorHistAPI
    public int Init(int i, int i2, int i3, int i4, int i5) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long nativeCreateColorHist = nativeCreateColorHist();
        this.mNativePtr = nativeCreateColorHist;
        if (nativeCreateColorHist == 0) {
            return -1;
        }
        return nativeInitColorHist(nativeCreateColorHist, i, i2, i3, i4, i5);
    }

    @Override // com.bytedance.bmf_mods_api.ColorHistAPI
    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr, long j) {
        if (!SoLoader.getInstance().isSoInitialized()) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            return -1;
        }
        int nativeColorHistOesProcess = nativeColorHistOesProcess(j2, i, fArr, i2, i3, j, this.output_data);
        if (nativeColorHistOesProcess > 0) {
            this.resultJson.LJJIIJ("valid", Integer.valueOf(nativeColorHistOesProcess));
            this.resultJson.LJJIIJ("constract", Float.valueOf(this.output_data[0]));
            this.resultJson.LJJIIJ("brightness", Float.valueOf(this.output_data[1]));
            this.resultJson.LJJIIJ("saturation", Float.valueOf(this.output_data[2]));
        }
        return nativeColorHistOesProcess;
    }
}
