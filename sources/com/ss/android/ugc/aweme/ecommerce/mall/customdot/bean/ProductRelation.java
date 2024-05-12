package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProductRelation {

    @InterfaceC65349Pkn("product_list")
    public final List<RelationProduct> productList;

    @InterfaceC65349Pkn("relation_type")
    public final int relationType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRelation)) {
            return false;
        }
        ProductRelation productRelation = (ProductRelation) obj;
        return this.relationType == productRelation.relationType && o.LJ(this.productList, productRelation.productList);
    }

    public final int hashCode() {
        int i = this.relationType * 31;
        List<RelationProduct> list = this.productList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductRelation(relationType=");
        LIZ.append(this.relationType);
        LIZ.append(", productList=");
        return C1NE.LIZIZ(LIZ, this.productList, ')', LIZ);
    }

    public ProductRelation(int i, List<RelationProduct> list) {
        this.relationType = i;
        this.productList = list;
    }
}
