package com.ss.android.vesdk.filterparam;

import X.C0JT;
import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoAjustmentFilterParam> CREATOR = new IDCreatorS56S0000000_14(62);
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoAjustmentFilterParam{ajustmentName=");
        LIZ.append(Arrays.toString(this.ajustmentName));
        LIZ.append(", ajustmentType=");
        C0JT.LIZLLL(this.ajustmentType, LIZ, ", ajustmentIntensity=");
        LIZ.append(Arrays.toString(this.ajustmentIntensity));
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEVideoAjustmentFilterParam(Parcel parcel) {
        super(parcel);
        this.ajustmentName = parcel.createStringArray();
        this.ajustmentType = parcel.createIntArray();
        this.ajustmentIntensity = parcel.createFloatArray();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.ajustmentName);
        parcel.writeIntArray(this.ajustmentType);
        parcel.writeFloatArray(this.ajustmentIntensity);
    }
}
