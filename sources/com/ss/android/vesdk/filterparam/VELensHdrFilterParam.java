package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VELensHdrFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VELensHdrFilterParam> CREATOR = new IDCreatorS56S0000000_14(54);
    public String filterPath;
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VELensHdrFilterParam() {
        this.filterName = "lens hdr filter";
        this.filterType = 33;
        this.filterPath = "";
        this.intensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VELensHdrFilterParam{filterPath='");
        Q89.LIZIZ(LIZ, this.filterPath, '\'', ", intensity=");
        LIZ.append(this.intensity);
        LIZ.append(", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VELensHdrFilterParam(Parcel parcel) {
        super(parcel);
        this.filterPath = parcel.readString();
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.filterPath);
        parcel.writeFloat(this.intensity);
    }
}
