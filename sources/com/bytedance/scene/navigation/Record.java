package com.bytedance.scene.navigation;

import X.WM7;
import X.WMU;
import X.WN2;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class Record implements Parcelable {
    public static final Parcelable.Creator<Record> CREATOR = new IDCreatorS56S0000000_14(4);
    public WM7 LJLIL;
    public boolean LJLILLLLZI;
    public ActivityStatusRecord LJLJI;
    public WMU LJLJJI;
    public Object LJLJJL;
    public boolean LJLJJLL;
    public WN2 LJLJL;
    public String LJLJLJ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Record() {
    }

    public Record(Parcel parcel) {
        boolean z;
        this.LJLJI = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        this.LJLJLJ = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LJLJI, i);
        parcel.writeByte(this.LJLILLLLZI ? (byte) 1 : (byte) 0);
        parcel.writeString(this.LJLJLJ);
    }
}
