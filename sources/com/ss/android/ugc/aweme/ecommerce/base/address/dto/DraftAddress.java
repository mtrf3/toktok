package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27257Amr;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DraftAddress extends F9E implements Parcelable {
    public static final Parcelable.Creator<DraftAddress> CREATOR = new C27257Amr();

    @InterfaceC65349Pkn("address")
    public final Address address;

    @InterfaceC65349Pkn("timestamp")
    public final long timestamp;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.address, Long.valueOf(this.timestamp), this.uid};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.address.writeToParcel(out, i);
        out.writeLong(this.timestamp);
        out.writeString(this.uid);
    }

    public DraftAddress(Address address, long j, String uid) {
        o.LJIIIZ(address, "address");
        o.LJIIIZ(uid, "uid");
        this.address = address;
        this.timestamp = j;
        this.uid = uid;
    }
}
