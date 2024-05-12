package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import android.os.Parcel;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEVideoLensOneKeyHdrParam extends VEBaseFilterParam {
    public int asf_mode;
    public int hdr_mode;
    public String kernel_path;
    public String model_path;
    public int power_level = 3;
    public int scene_case = 20001;
    public int disable_denoise = 1;

    public VEVideoLensOneKeyHdrParam() {
        this.filterName = "lens one key hdr";
        this.filterType = 35;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoAjustmentFilterParam{, model_path=");
        LIZ.append(this.model_path);
        LIZ.append(", kernel_path=");
        LIZ.append(this.kernel_path);
        LIZ.append(", power_level=");
        LIZ.append(this.power_level);
        LIZ.append(", scene_case=");
        LIZ.append(this.scene_case);
        LIZ.append(", disable_denoise=");
        LIZ.append(this.disable_denoise);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
