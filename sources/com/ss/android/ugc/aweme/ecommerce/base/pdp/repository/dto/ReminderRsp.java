package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.ESL;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ReminderRsp implements Parcelable {
    public static final Parcelable.Creator<ReminderRsp> CREATOR = new ESL();

    @InterfaceC65349Pkn("pdp_h5_schema")
    public final String pdpH5Schema;

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderRsp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReminderRsp) && o.LJ(this.pdpH5Schema, ((ReminderRsp) obj).pdpH5Schema);
    }

    public final int hashCode() {
        String str = this.pdpH5Schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pdpH5Schema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReminderRsp(pdpH5Schema=");
        return q.LIZIZ(LIZ, this.pdpH5Schema, ')', LIZ);
    }

    public ReminderRsp(String str) {
        this.pdpH5Schema = str;
    }

    public /* synthetic */ ReminderRsp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
