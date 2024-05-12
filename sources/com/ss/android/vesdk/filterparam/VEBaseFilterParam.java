package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X0V;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEBaseFilterParam implements Parcelable {
    public static final Parcelable.Creator<VEBaseFilterParam> CREATOR = new IDCreatorS56S0000000_14(40);
    public X0V callback;
    public int filterDurationType;
    public String filterName;
    public int filterType;
    public int renderType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEBaseFilterParam{filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", filterEngineType = ");
        return b0.LIZJ(LIZ, this.renderType, '}', LIZ);
    }

    public VEBaseFilterParam() {
    }

    public VEBaseFilterParam(Parcel parcel) {
        this.filterType = parcel.readInt();
        this.filterName = parcel.readString();
        this.filterDurationType = parcel.readInt();
        this.renderType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.filterType);
        parcel.writeString(this.filterName);
        parcel.writeInt(this.filterDurationType);
        parcel.writeInt(this.renderType);
    }
}
