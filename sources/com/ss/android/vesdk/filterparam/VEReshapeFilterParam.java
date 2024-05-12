package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEReshapeFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEReshapeFilterParam> CREATOR = new IDCreatorS56S0000000_14(58);
    public float cheekIntensity;
    public float eyeIntensity;
    public String resPath;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEReshapeFilterParam() {
        this.filterName = "reshape filter";
        this.filterType = 13;
        this.filterDurationType = 1;
        this.resPath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEReshapeFilterParam{resPath='");
        Q89.LIZIZ(LIZ, this.resPath, '\'', ", eyeIntensity=");
        LIZ.append(this.eyeIntensity);
        LIZ.append(", cheekIntensity=");
        LIZ.append(this.cheekIntensity);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEReshapeFilterParam(Parcel parcel) {
        super(parcel);
        this.resPath = parcel.readString();
        this.eyeIntensity = parcel.readFloat();
        this.cheekIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeFloat(this.eyeIntensity);
        parcel.writeFloat(this.cheekIntensity);
    }
}
