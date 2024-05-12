package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEAudioEffectBean;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEAudioEffectFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioEffectFilterParam> CREATOR = new IDCreatorS56S0000000_14(32);
    public VEAudioEffectBean audioEffectBean;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioEffectFilterParam() {
        this.filterName = "audio effect";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioEffectFilterParam{audioEffectBean=");
        LIZ.append(this.audioEffectBean);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEAudioEffectFilterParam(Parcel parcel) {
        this.audioEffectBean = (VEAudioEffectBean) parcel.readParcelable(VEAudioEffectBean.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audioEffectBean, i);
    }
}
