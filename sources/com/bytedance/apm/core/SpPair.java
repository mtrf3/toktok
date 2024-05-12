package com.bytedance.apm.core;

import Y.IDCreatorS50S0000000_6;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new IDCreatorS50S0000000_6(0);
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

    public SpPair(String str, Object obj) {
        this.mKey = str;
        this.mValue = obj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeValue(this.mValue);
    }
}
