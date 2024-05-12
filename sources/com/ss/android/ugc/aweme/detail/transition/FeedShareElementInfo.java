package com.ss.android.ugc.aweme.detail.transition;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes12.dex */
public class FeedShareElementInfo<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<FeedShareElementInfo> CREATOR = new IDCreatorS54S0000000_11(60);
    public boolean mIsEnter;
    public Parcelable mSnapshot;
    public transient View mView;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FeedShareElementInfo(Parcel parcel) {
        boolean z;
        this.mSnapshot = parcel.readParcelable(Parcelable.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsEnter = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSnapshot, i);
        parcel.writeByte(this.mIsEnter ? (byte) 1 : (byte) 0);
    }
}
