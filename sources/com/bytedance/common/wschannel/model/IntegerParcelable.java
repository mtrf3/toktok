package com.bytedance.common.wschannel.model;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new IDCreatorS54S0000000_11(2);
    public final int mData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IntegerParcelable(Parcel parcel) {
        this.mData = parcel.readInt();
    }

    public IntegerParcelable(int i) {
        this.mData = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mData);
    }
}
