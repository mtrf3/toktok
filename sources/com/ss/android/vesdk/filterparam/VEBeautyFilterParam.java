package com.ss.android.vesdk.filterparam;

import X.C74221TAz;
import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEBeautyFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBeautyFilterParam> CREATOR = new IDCreatorS56S0000000_14(41);
    public String beautyName;
    public int beautyType;
    public float brightenIntensity;
    public float sharpIntensity;
    public float skinToneIntensity;
    public String skinTonePath;
    public float smoothIntensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEBeautyFilterParam() {
        this.filterName = "beauty";
        this.filterType = 12;
        this.filterDurationType = 1;
        this.beautyName = "";
        this.beautyType = -1;
        this.skinTonePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEBeautyFilterParam{beautyName='");
        Q89.LIZIZ(LIZ, this.beautyName, '\'', ", beautyType=");
        LIZ.append(this.beautyType);
        LIZ.append(", brightenIntensity=");
        LIZ.append(this.brightenIntensity);
        LIZ.append(", smoothIntensity=");
        LIZ.append(this.smoothIntensity);
        LIZ.append(", sharpIntensity=");
        LIZ.append(this.sharpIntensity);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", skinTonePath='");
        Q89.LIZIZ(LIZ, this.skinTonePath, '\'', ", skinToneIntensity=");
        return C74221TAz.LIZLLL(LIZ, this.skinToneIntensity, '}', LIZ);
    }

    public VEBeautyFilterParam(Parcel parcel) {
        super(parcel);
        this.beautyName = parcel.readString();
        this.beautyType = parcel.readInt();
        this.brightenIntensity = parcel.readFloat();
        this.smoothIntensity = parcel.readFloat();
        this.sharpIntensity = parcel.readFloat();
        this.skinTonePath = parcel.readString();
        this.skinToneIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.beautyName);
        parcel.writeInt(this.beautyType);
        parcel.writeFloat(this.brightenIntensity);
        parcel.writeFloat(this.smoothIntensity);
        parcel.writeFloat(this.sharpIntensity);
        parcel.writeString(this.skinTonePath);
        parcel.writeFloat(this.skinToneIntensity);
    }
}
