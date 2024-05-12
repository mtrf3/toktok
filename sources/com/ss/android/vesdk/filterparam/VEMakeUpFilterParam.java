package com.ss.android.vesdk.filterparam;

import X.C48339Iy7;
import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEMakeUpFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEMakeUpFilterParam> CREATOR = new IDCreatorS56S0000000_14(56);
    public float blusherIntensity;
    public float lipIntensity;
    public boolean maleMakeupState;
    public String resPath;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEMakeUpFilterParam() {
        this.filterName = "makeup filter";
        this.filterType = 26;
        this.filterDurationType = 1;
        this.resPath = "";
        this.lipIntensity = -1.0f;
        this.blusherIntensity = -1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEMakeUpFilterParam{resPath='");
        Q89.LIZIZ(LIZ, this.resPath, '\'', ", lipIntensity=");
        LIZ.append(this.lipIntensity);
        LIZ.append(", blusherIntensity=");
        LIZ.append(this.blusherIntensity);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", maleMakeupState=");
        return C48339Iy7.LIZJ(LIZ, this.maleMakeupState, '}', LIZ);
    }

    public VEMakeUpFilterParam(Parcel parcel) {
        super(parcel);
        this.resPath = parcel.readString();
        this.lipIntensity = parcel.readFloat();
        this.blusherIntensity = parcel.readFloat();
        this.maleMakeupState = 1 == parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeFloat(this.lipIntensity);
        parcel.writeFloat(this.blusherIntensity);
        parcel.writeInt(this.maleMakeupState ? 1 : 0);
    }
}
