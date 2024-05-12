package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27555Arf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SellerDetailPopup implements Parcelable {
    public static final Parcelable.Creator<SellerDetailPopup> CREATOR = new C27555Arf();

    @InterfaceC65349Pkn("content")
    public final String content;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SellerDetailPopup) && o.LJ(this.content, ((SellerDetailPopup) obj).content);
    }

    public final int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.content);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerDetailPopup(content=");
        return q.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public SellerDetailPopup(String str) {
        this.content = str;
    }
}
