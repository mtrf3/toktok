package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEAudioFadeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioFadeFilterParam> CREATOR = new IDCreatorS56S0000000_14(33);
    public int fadeInLength;
    public int fadeOutLength;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioFadeFilterParam() {
        this.filterName = "audio fading";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioFadeFilterParam{fadeInLength=");
        LIZ.append(this.fadeInLength);
        LIZ.append(", fadeOutLength=");
        LIZ.append(this.fadeOutLength);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEAudioFadeFilterParam(Parcel parcel) {
        super(parcel);
        this.fadeInLength = parcel.readInt();
        this.fadeOutLength = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.fadeInLength);
        parcel.writeInt(this.fadeOutLength);
    }
}
