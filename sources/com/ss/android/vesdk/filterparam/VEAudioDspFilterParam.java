package com.ss.android.vesdk.filterparam;

import X.C77800Ug8;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEAudioDspFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioDspFilterParam> CREATOR = new IDCreatorS56S0000000_14(31);
    public String jsonDir;

    public VEAudioDspFilterParam() {
        this.filterName = "audio dsp filter";
        this.jsonDir = "audio dsp use inbuilt json";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioDspFilterParam{jsonPath='");
        return C77800Ug8.LIZJ(LIZ, this.jsonDir, '\'', '}', LIZ);
    }

    public VEAudioDspFilterParam(Parcel parcel) {
        super(parcel);
        this.jsonDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.jsonDir);
    }
}
