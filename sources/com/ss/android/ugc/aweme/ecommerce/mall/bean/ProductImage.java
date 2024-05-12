package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProductImage {

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductImage copy$default(ProductImage productImage, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = productImage.height;
        }
        if ((i & 2) != 0) {
            num2 = productImage.width;
        }
        if ((i & 4) != 0) {
            list = productImage.urlList;
        }
        return productImage.copy(num, num2, list);
    }

    public final ProductImage copy(Integer num, Integer num2, List<String> list) {
        return new ProductImage(num, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductImage)) {
            return false;
        }
        ProductImage productImage = (ProductImage) obj;
        return o.LJ(this.height, productImage.height) && o.LJ(this.width, productImage.width) && o.LJ(this.urlList, productImage.urlList);
    }

    public int hashCode() {
        Integer num = this.height;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.width;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.urlList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductImage(height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public ProductImage(Integer num, Integer num2, List<String> list) {
        this.height = num;
        this.width = num2;
        this.urlList = list;
    }
}
