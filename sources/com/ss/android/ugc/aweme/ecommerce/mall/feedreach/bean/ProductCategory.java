package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProductCategory {

    @InterfaceC65349Pkn("category_id")
    public final String categoryId;

    @InterfaceC65349Pkn("category_name")
    public final String categoryName;

    @InterfaceC65349Pkn("level")
    public final int level;

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategory)) {
            return false;
        }
        ProductCategory productCategory = (ProductCategory) obj;
        return o.LJ(this.text, productCategory.text) && o.LJ(this.categoryId, productCategory.categoryId) && o.LJ(this.categoryName, productCategory.categoryName) && this.level == productCategory.level;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryName;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.level;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductCategory(text=");
        LIZ.append(this.text);
        LIZ.append(", categoryId=");
        LIZ.append(this.categoryId);
        LIZ.append(", categoryName=");
        LIZ.append(this.categoryName);
        LIZ.append(", level=");
        return b0.LIZJ(LIZ, this.level, ')', LIZ);
    }

    public ProductCategory(String str, String str2, String str3, int i) {
        this.text = str;
        this.categoryId = str2;
        this.categoryName = str3;
        this.level = i;
    }
}
