package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class ProductAnchor {

    @InterfaceC65349Pkn("addition_id")
    public final String additionId;

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("type")
    public final int type;

    public ProductAnchor(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "keyword", str2, "productId", str3, "additionId");
        this.keyword = str;
        this.productId = str2;
        this.additionId = str3;
        this.type = i;
    }
}
