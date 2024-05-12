package com.bytedance.apm.util;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new IDCreatorS56S0000000_14(1);
    public String mKey;
    public Object mValue;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SpPair(Parcel parcel) {
        this.mKey = parcel.readString();
        this.mValue = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeValue(this.mValue);
    }
}
