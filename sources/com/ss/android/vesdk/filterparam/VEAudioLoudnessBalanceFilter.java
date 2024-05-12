package com.ss.android.vesdk.filterparam;

import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEAudioLoudnessBalanceFilter extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioLoudnessBalanceFilter> CREATOR = new IDCreatorS56S0000000_14(34);
    public double avgLoudness;
    public boolean enable;
    public boolean isBGM;
    public boolean isOnLine;
    public double peakLoudness;
    public double targetLoudness;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioLoudnessBalanceFilter() {
        this.isOnLine = true;
        this.filterName = "loudness balance";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioLoudnessBalanceFilter{avgLoudness: ");
        LIZ.append(this.avgLoudness);
        LIZ.append(", peakLoudness: ");
        LIZ.append(this.peakLoudness);
        LIZ.append(", targetLoudness: '");
        LIZ.append(this.targetLoudness);
        LIZ.append(", filterName: '");
        LIZ.append(this.filterName);
        LIZ.append(", filterType: '");
        LIZ.append(this.filterType);
        LIZ.append(", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEAudioLoudnessBalanceFilter(Parcel parcel) {
        super(parcel);
        this.isOnLine = true;
        this.avgLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.targetLoudness = parcel.readDouble();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.avgLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.targetLoudness);
    }
}
