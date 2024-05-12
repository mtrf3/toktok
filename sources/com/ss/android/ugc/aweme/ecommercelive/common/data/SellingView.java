package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SellingView {

    @InterfaceC65349Pkn("selling_items")
    public final List<SellingItem> sellingItems;

    /* JADX WARN: Multi-variable type inference failed */
    public SellingView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SellingView) && o.LJ(this.sellingItems, ((SellingView) obj).sellingItems);
    }

    public final int hashCode() {
        List<SellingItem> list = this.sellingItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellingView(sellingItems=");
        return C1NE.LIZIZ(LIZ, this.sellingItems, ')', LIZ);
    }

    public SellingView(List<SellingItem> list) {
        this.sellingItems = list;
    }

    public /* synthetic */ SellingView(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
