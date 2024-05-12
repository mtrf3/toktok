package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CartEntry {

    @InterfaceC65349Pkn("item_count")
    public final Integer itemCount;

    @InterfaceC65349Pkn("link")
    public final String link;

    /* JADX WARN: Multi-variable type inference failed */
    public CartEntry() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        return o.LJ(this.link, cartEntry.link) && o.LJ(this.itemCount, cartEntry.itemCount);
    }

    public final int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CartEntry(link=");
        LIZ.append(this.link);
        LIZ.append(", itemCount=");
        return s0.LIZJ(LIZ, this.itemCount, ')', LIZ);
    }

    public CartEntry(String str, Integer num) {
        this.link = str;
        this.itemCount = num;
    }

    public /* synthetic */ CartEntry(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
