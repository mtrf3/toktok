package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.ProductCategory;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationProduct {

    @InterfaceC65349Pkn("category_level")
    public final Integer category_level;

    @InterfaceC65349Pkn("related_categories")
    public final List<ProductCategory> relatedCategories;

    @InterfaceC65349Pkn("related_products")
    public final List<RelationProductData> relatedProducts;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationProduct)) {
            return false;
        }
        RelationProduct relationProduct = (RelationProduct) obj;
        return o.LJ(this.relatedProducts, relationProduct.relatedProducts) && o.LJ(this.relatedCategories, relationProduct.relatedCategories) && o.LJ(this.category_level, relationProduct.category_level);
    }

    public final int hashCode() {
        List<RelationProductData> list = this.relatedProducts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ProductCategory> list2 = this.relatedCategories;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.category_level;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationProduct(relatedProducts=");
        LIZ.append(this.relatedProducts);
        LIZ.append(", relatedCategories=");
        LIZ.append(this.relatedCategories);
        LIZ.append(", category_level=");
        return s0.LIZJ(LIZ, this.category_level, ')', LIZ);
    }

    public RelationProduct(List<RelationProductData> list, List<ProductCategory> list2, Integer num) {
        this.relatedProducts = list;
        this.relatedCategories = list2;
        this.category_level = num;
    }
}
