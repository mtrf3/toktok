package com.bytedance.scene.group;

import X.C78932UyO;
import X.WM7;
import Y.IDCreatorS56S0000000_14;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class GroupRecord implements Parcelable {
    public static final Parcelable.Creator<GroupRecord> CREATOR = new IDCreatorS56S0000000_14(3);
    public int LJLIL;
    public WM7 LJLILLLLZI;
    public String LJLJI;
    public final boolean LJLJJI;
    public String LJLJJL;
    public Bundle LJLJJLL;
    public boolean isHidden;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GroupRecord() {
        this.LJLIL = -1;
    }

    public GroupRecord(Parcel parcel) {
        boolean z;
        this.LJLIL = -1;
        this.LJLIL = parcel.readInt();
        String readString = parcel.readString();
        C78932UyO.LJI(readString, "tag not found in Parcel");
        this.LJLJI = readString;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isHidden = z;
        this.LJLJJI = parcel.readByte() != 0;
        String readString2 = parcel.readString();
        C78932UyO.LJI(readString2, "class name not found in Parcel");
        this.LJLJJL = readString2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LJLIL);
        parcel.writeString(this.LJLJI);
        parcel.writeByte(this.isHidden ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.LJLJJI ? (byte) 1 : (byte) 0);
        parcel.writeString(this.LJLJJL);
    }
}
