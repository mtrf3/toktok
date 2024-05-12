package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AdNativeProduct implements Serializable {

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("product_id")
    public String productId;

    /* JADX WARN: Multi-variable type inference failed */
    public AdNativeProduct() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setImageUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setProductId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.productId = str;
    }

    public AdNativeProduct(String imageUrl, String productId) {
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(productId, "productId");
        this.imageUrl = imageUrl;
        this.productId = productId;
    }

    public /* synthetic */ AdNativeProduct(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
