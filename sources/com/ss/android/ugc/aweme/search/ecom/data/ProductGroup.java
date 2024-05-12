package com.ss.android.ugc.aweme.search.ecom.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ProductGroup {

    @InterfaceC65349Pkn("author_type")
    public final Integer authorType;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("product_list")
    public final List<Product> productList;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("shop_id")
    public final String shopId;

    @InterfaceC65349Pkn("shop_type")
    public final Integer shopType;

    @InterfaceC65349Pkn("show_entrance")
    public final Boolean showEntrance;

    @InterfaceC65349Pkn("total")
    public final Integer total;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductGroup() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductGroup)) {
            return false;
        }
        ProductGroup productGroup = (ProductGroup) obj;
        return o.LJ(this.hasMore, productGroup.hasMore) && o.LJ(this.productList, productGroup.productList) && o.LJ(this.total, productGroup.total) && o.LJ(this.showEntrance, productGroup.showEntrance) && o.LJ(this.shopType, productGroup.shopType) && o.LJ(this.schema, productGroup.schema) && o.LJ(this.shopId, productGroup.shopId) && o.LJ(this.authorType, productGroup.authorType);
    }

    public final int hashCode() {
        Boolean bool = this.hasMore;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<Product> list = this.productList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.total;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.showEntrance;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.shopType;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.schema;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shopId;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.authorType;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductGroup(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", productList=");
        LIZ.append(this.productList);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", showEntrance=");
        LIZ.append(this.showEntrance);
        LIZ.append(", shopType=");
        LIZ.append(this.shopType);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", shopId=");
        LIZ.append(this.shopId);
        LIZ.append(", authorType=");
        return s0.LIZJ(LIZ, this.authorType, ')', LIZ);
    }

    public ProductGroup(Boolean bool, List<Product> list, Integer num, Boolean bool2, Integer num2, String str, String str2, Integer num3) {
        this.hasMore = bool;
        this.productList = list;
        this.total = num;
        this.showEntrance = bool2;
        this.shopType = num2;
        this.schema = str;
        this.shopId = str2;
        this.authorType = num3;
    }

    public /* synthetic */ ProductGroup(Boolean bool, List list, Integer num, Boolean bool2, Integer num2, String str, String str2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? num3 : null);
    }
}
