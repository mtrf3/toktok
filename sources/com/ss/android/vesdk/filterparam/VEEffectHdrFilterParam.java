package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEEffectHdrFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEEffectHdrFilterParam> CREATOR = new IDCreatorS56S0000000_14(48);
    public String filterPath;
    public int hdrType;
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEEffectHdrFilterParam() {
        this.filterName = "effect hdr filter";
        this.filterType = 16;
        this.filterPath = "";
        this.hdrType = 1;
        this.intensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEEffectHdrFilterParam{filterPath='");
        Q89.LIZIZ(LIZ, this.filterPath, '\'', ", hdrType=");
        LIZ.append(this.hdrType);
        LIZ.append(", intensity=");
        LIZ.append(this.intensity);
        LIZ.append(", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEEffectHdrFilterParam(Parcel parcel) {
        super(parcel);
        this.filterPath = parcel.readString();
        this.hdrType = parcel.readInt();
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.filterPath);
        parcel.writeInt(this.hdrType);
        parcel.writeFloat(this.intensity);
    }
}
