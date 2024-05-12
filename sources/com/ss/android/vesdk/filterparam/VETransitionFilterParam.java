package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.V0N;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VETransitionFilterParam> CREATOR = new IDCreatorS56S0000000_14(61);
    public int tranDuration;
    public int tranType;
    public String transName;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = TransitionType.TransitionType_DEFAULT.ordinal();
        this.tranDuration = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VETransitionFilterParam{transName='");
        Q89.LIZIZ(LIZ, this.transName, '\'', ", tranType=");
        LIZ.append(this.tranType);
        LIZ.append(", tranDuration=");
        LIZ.append(this.tranDuration);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    /* loaded from: classes5.dex */
    public enum TransitionType {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME,
        TransitionType_SINGLE;

        public static TransitionType valueOf(String str) {
            return (TransitionType) V0N.LJJJ(TransitionType.class, str);
        }
    }

    public VETransitionFilterParam(Parcel parcel) {
        super(parcel);
        this.transName = parcel.readString();
        this.tranType = parcel.readInt();
        this.tranDuration = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.transName);
        parcel.writeInt(this.tranType);
        parcel.writeInt(this.tranDuration);
    }
}
