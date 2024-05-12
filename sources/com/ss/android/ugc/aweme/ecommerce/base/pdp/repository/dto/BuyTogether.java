package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69681RWj;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BuyTogether implements Parcelable {
    public static final Parcelable.Creator<BuyTogether> CREATOR = new C69681RWj();

    @InterfaceC65349Pkn("position")
    public final Integer position;

    @InterfaceC65349Pkn("show")
    public final boolean show;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyTogether)) {
            return false;
        }
        BuyTogether buyTogether = (BuyTogether) obj;
        return this.show == buyTogether.show && o.LJ(this.position, buyTogether.position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.position;
        return i + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeInt(this.show ? 1 : 0);
        Integer num = this.position;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyTogether(show=");
        LIZ.append(this.show);
        LIZ.append(", position=");
        return s0.LIZJ(LIZ, this.position, ')', LIZ);
    }

    public BuyTogether(boolean z, Integer num) {
        this.show = z;
        this.position = num;
    }

    public /* synthetic */ BuyTogether(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, num);
    }
}
