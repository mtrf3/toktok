package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchLiveCommdityStruct implements Serializable {

    @InterfaceC65349Pkn("cover")
    public String cover;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("price")
    public String price = "";

    @InterfaceC65349Pkn("product_id")
    public String productId;

    @InterfaceC65349Pkn("promotion_id")
    public String promotionId;

    @InterfaceC65349Pkn("scheme")
    public String scheme;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String getCover() {
        return this.cover;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setPrice(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.price = str;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
