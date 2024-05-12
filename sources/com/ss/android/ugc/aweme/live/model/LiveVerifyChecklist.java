package com.ss.android.ugc.aweme.live.model;

import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class LiveVerifyChecklist implements Parcelable {
    public static final Parcelable.Creator<LiveVerifyChecklist> CREATOR = new IDCreatorS57S0000000_15(7);
    public boolean is_phone_binded;
    public boolean live_agreement;
    public boolean live_answer = true;
    public int realname_verify;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LiveVerifyChecklist() {
    }

    public LiveVerifyChecklist(Parcel parcel) {
        boolean z;
        this.realname_verify = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_phone_binded = z;
        this.live_agreement = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.realname_verify);
        parcel.writeByte(this.is_phone_binded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.live_agreement ? (byte) 1 : (byte) 0);
    }
}
