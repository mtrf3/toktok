package com.bytedance.android.live.base.model;

import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RoomStatus implements Parcelable {
    public static final Parcelable.Creator<RoomStatus> CREATOR = new IDCreatorS45S0000000(39);
    public long anchorId;
    public int countOfWatchUsers;
    public boolean isFinish;
    public long roomId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RoomStatus() {
    }

    public RoomStatus(Parcel parcel) {
        boolean z;
        this.roomId = parcel.readLong();
        this.anchorId = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFinish = z;
        this.countOfWatchUsers = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.roomId);
        parcel.writeLong(this.anchorId);
        parcel.writeByte(this.isFinish ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.countOfWatchUsers);
    }
}
