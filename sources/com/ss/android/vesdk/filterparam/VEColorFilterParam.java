package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEColorFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorFilterParam> CREATOR = new IDCreatorS56S0000000_14(44);
    public float intensity;
    public String leftFilterPath;
    public float position;
    public String rightFilterPath;
    public float rightIntensity;
    public boolean useFilterResIntensity;
    public boolean useFilterV3;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEColorFilterParam() {
        this.filterName = "color filter";
        this.filterType = 7;
        this.filterDurationType = 1;
        this.leftFilterPath = "";
        this.rightFilterPath = "";
        this.position = 1.0f;
        this.intensity = 1.0f;
        this.rightIntensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEColorFilterParam{leftFilterPath='");
        Q89.LIZIZ(LIZ, this.leftFilterPath, '\'', ", rightFilterPath='");
        Q89.LIZIZ(LIZ, this.rightFilterPath, '\'', ", position=");
        LIZ.append(this.position);
        LIZ.append(", intensity=");
        LIZ.append(this.intensity);
        LIZ.append(", rightIntensity=");
        LIZ.append(this.rightIntensity);
        LIZ.append(", useFilterResIntensity=");
        LIZ.append(this.useFilterResIntensity);
        LIZ.append(", useFilterV3=");
        LIZ.append(this.useFilterV3);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEColorFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.leftFilterPath = parcel.readString();
        this.rightFilterPath = parcel.readString();
        this.position = parcel.readFloat();
        this.intensity = parcel.readFloat();
        this.rightIntensity = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useFilterResIntensity = z;
        this.useFilterV3 = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.leftFilterPath);
        parcel.writeString(this.rightFilterPath);
        parcel.writeFloat(this.position);
        parcel.writeFloat(this.intensity);
        parcel.writeFloat(this.rightIntensity);
        parcel.writeByte(this.useFilterResIntensity ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useFilterV3 ? (byte) 1 : (byte) 0);
    }
}
