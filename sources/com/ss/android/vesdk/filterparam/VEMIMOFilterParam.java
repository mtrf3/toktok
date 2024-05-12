package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEMIMOFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEMIMOFilterParam> CREATOR = new IDCreatorS56S0000000_14(55);
    public int camOutHeight;
    public int camOutWidth;
    public int layoutHeight;
    public int layoutWidth;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEMIMOFilterParam() {
        this.filterName = "ve_mimo";
        this.filterType = 37;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEMIMOFilterParam{layoutWidth=");
        LIZ.append(this.layoutWidth);
        LIZ.append(", layoutHeight=");
        LIZ.append(this.layoutHeight);
        LIZ.append(", camOutWidth=");
        LIZ.append(this.camOutWidth);
        LIZ.append(", camOutHeight=");
        LIZ.append(this.camOutHeight);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEMIMOFilterParam(Parcel parcel) {
        super(parcel);
        this.layoutWidth = parcel.readInt();
        this.layoutHeight = parcel.readInt();
        this.camOutWidth = parcel.readInt();
        this.camOutHeight = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.layoutWidth);
        parcel.writeInt(this.layoutHeight);
        parcel.writeInt(this.camOutWidth);
        parcel.writeInt(this.camOutHeight);
    }
}
