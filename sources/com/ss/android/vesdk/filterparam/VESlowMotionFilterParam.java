package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VESlowMotionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VESlowMotionFilterParam> CREATOR = new IDCreatorS56S0000000_14(60);
    public int seqIn;
    public int seqOut;
    public int slowMotionDuration;
    public float slowMotionSpeed;
    public int timeMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VESlowMotionFilterParam() {
        this.filterName = "new slow effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
        this.slowMotionSpeed = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VESlowMotionFilterParam{seqIn=");
        LIZ.append(this.seqIn);
        LIZ.append(", seqOut=");
        LIZ.append(this.seqOut);
        LIZ.append(", slowMotionDuration=");
        LIZ.append(this.slowMotionDuration);
        LIZ.append(", slowMotionSpeed=");
        LIZ.append(this.slowMotionSpeed);
        LIZ.append(", timeMode=");
        LIZ.append(this.timeMode);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VESlowMotionFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.slowMotionDuration = parcel.readInt();
        this.slowMotionSpeed = parcel.readFloat();
        this.timeMode = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.slowMotionDuration);
        parcel.writeFloat(this.slowMotionSpeed);
        parcel.writeInt(this.timeMode);
    }
}
