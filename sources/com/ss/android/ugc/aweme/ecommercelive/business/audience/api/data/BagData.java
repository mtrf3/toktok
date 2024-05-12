package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BagData {

    @InterfaceC65349Pkn("products")
    public final List<Product> products;

    @InterfaceC65349Pkn("total")
    public final int total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BagData)) {
            return false;
        }
        BagData bagData = (BagData) obj;
        return o.LJ(this.products, bagData.products) && this.total == bagData.total;
    }

    public final int hashCode() {
        List<Product> list = this.products;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.total;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BagData(products=");
        LIZ.append(this.products);
        LIZ.append(", total=");
        return b0.LIZJ(LIZ, this.total, ')', LIZ);
    }

    public BagData(List<Product> list, int i) {
        this.products = list;
        this.total = i;
    }
}
