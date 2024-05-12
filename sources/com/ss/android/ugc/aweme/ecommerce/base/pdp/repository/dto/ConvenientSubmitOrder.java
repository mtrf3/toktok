package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27772AvA;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ConvenientSubmitOrder implements Parcelable {
    public static final Parcelable.Creator<ConvenientSubmitOrder> CREATOR = new C27772AvA();

    @InterfaceC65349Pkn("schema")
    public final String schema;

    /* JADX WARN: Multi-variable type inference failed */
    public ConvenientSubmitOrder() {
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
        return (obj instanceof ConvenientSubmitOrder) && o.LJ(this.schema, ((ConvenientSubmitOrder) obj).schema);
    }

    public final int hashCode() {
        String str = this.schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.schema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConvenientSubmitOrder(schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public ConvenientSubmitOrder(String str) {
        this.schema = str;
    }

    public final boolean LIZ(Boolean bool) {
        if (C78685UuP.LJJJZ(this.schema) && o.LJ(bool, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ConvenientSubmitOrder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
