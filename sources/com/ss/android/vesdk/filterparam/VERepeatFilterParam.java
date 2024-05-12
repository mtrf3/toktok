package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VERepeatFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VERepeatFilterParam> CREATOR = new IDCreatorS56S0000000_14(57);
    public int repeatDuration;
    public int repeatTime;
    public int seqIn;
    public int seqOut;
    public int timeMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VERepeatFilterParam() {
        this.filterName = "new repeat effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VERepeatFilterParam{seqIn=");
        LIZ.append(this.seqIn);
        LIZ.append(", seqOut=");
        LIZ.append(this.seqOut);
        LIZ.append(", repeatTime=");
        LIZ.append(this.repeatTime);
        LIZ.append(", repeatDuration=");
        LIZ.append(this.repeatDuration);
        LIZ.append(", timeMode=");
        LIZ.append(this.timeMode);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VERepeatFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.repeatTime = parcel.readInt();
        this.repeatDuration = parcel.readInt();
        this.timeMode = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.repeatTime);
        parcel.writeInt(this.repeatDuration);
        parcel.writeInt(this.timeMode);
    }
}
