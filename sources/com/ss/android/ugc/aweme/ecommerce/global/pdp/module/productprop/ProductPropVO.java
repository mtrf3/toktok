package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productprop;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPropertyItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductPropVO {
    public final String LIZ;

    @InterfaceC65349Pkn("items")
    public final List<ProductPropertyItem> propItems;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPropVO)) {
            return false;
        }
        ProductPropVO productPropVO = (ProductPropVO) obj;
        return o.LJ(this.title, productPropVO.title) && o.LJ(this.LIZ, productPropVO.LIZ) && o.LJ(this.propItems, productPropVO.propItems);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProductPropertyItem> list = this.propItems;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPropVO(title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.LIZ);
        LIZ.append(", propItems=");
        return C1NE.LIZIZ(LIZ, this.propItems, ')', LIZ);
    }

    public ProductPropVO(String str, String str2, List<ProductPropertyItem> list) {
        this.title = str;
        this.LIZ = str2;
        this.propItems = list;
    }
}
