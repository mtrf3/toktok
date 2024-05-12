package com.ttnet.org.chromium.base;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new IDCreatorS56S0000000_14(70);
    public final long mHigh;
    public final long mLow;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        long j = this.mLow;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.mHigh;
        return (i * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public long getHighForSerialization() {
        return this.mHigh;
    }

    public long getLowForSerialization() {
        return this.mLow;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnguessableToken unguessableToken = (UnguessableToken) obj;
        if (unguessableToken.mHigh != this.mHigh || unguessableToken.mLow != this.mLow) {
            return false;
        }
        return true;
    }

    public UnguessableToken(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    public static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }
}
