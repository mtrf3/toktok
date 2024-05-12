package com.ss.android.ugc.aweme.feed.model.search;

import X.C1NE;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ProductAnchor {
    public final UrlModel iconUrlModel;
    public final List<Product> productList;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductAnchor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductAnchor copy$default(ProductAnchor productAnchor, UrlModel urlModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = productAnchor.iconUrlModel;
        }
        if ((i & 2) != 0) {
            list = productAnchor.productList;
        }
        return productAnchor.copy(urlModel, list);
    }

    public final ProductAnchor copy(UrlModel urlModel, List<Product> list) {
        return new ProductAnchor(urlModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAnchor)) {
            return false;
        }
        ProductAnchor productAnchor = (ProductAnchor) obj;
        return o.LJ(this.iconUrlModel, productAnchor.iconUrlModel) && o.LJ(this.productList, productAnchor.productList);
    }

    public int hashCode() {
        UrlModel urlModel = this.iconUrlModel;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        List<Product> list = this.productList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductAnchor(iconUrlModel=");
        LIZ.append(this.iconUrlModel);
        LIZ.append(", productList=");
        return C1NE.LIZIZ(LIZ, this.productList, ')', LIZ);
    }

    public ProductAnchor(UrlModel urlModel, List<Product> list) {
        this.iconUrlModel = urlModel;
        this.productList = list;
    }

    public /* synthetic */ ProductAnchor(UrlModel urlModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : list);
    }
}
