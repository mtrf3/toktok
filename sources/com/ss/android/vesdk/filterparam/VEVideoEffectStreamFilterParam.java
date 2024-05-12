package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

/* loaded from: classes15.dex */
public class VEVideoEffectStreamFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoEffectStreamFilterParam> CREATOR = new IDCreatorS56S0000000_14(65);
    public String extraString;
    public int streamFlags;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVideoEffectStreamFilterParam() {
        this.filterName = "effect stream";
        this.filterType = 29;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoEffectStreamFilterParam{filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", streamFlags=");
        LIZ.append(this.streamFlags);
        LIZ.append(", extraString=");
        return q.LIZIZ(LIZ, this.extraString, '}', LIZ);
    }

    public VEVideoEffectStreamFilterParam(Parcel parcel) {
        super(parcel);
        this.streamFlags = parcel.readInt();
        this.extraString = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.streamFlags);
        parcel.writeString(this.extraString);
    }
}
