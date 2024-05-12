package com.bytedance.android.livesdk.model.message.ext;

import X.CR6;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes13.dex */
public class PopProduct extends CR6 {

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("platform")
    public int platform;

    @InterfaceC65349Pkn("price")
    public String price;

    @InterfaceC65349Pkn("product_id")
    public long productId;

    @InterfaceC65349Pkn("product_status")
    public int productStatus;

    @InterfaceC65349Pkn("product_type")
    public String productType;

    @InterfaceC65349Pkn("promotion_view")
    public PromotionView promotionView;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("source_from")
    public int sourceFrom;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopProduct{title='");
        Q89.LIZIZ(LIZ, this.title, '\'', ", price='");
        Q89.LIZIZ(LIZ, this.price, '\'', ", imageUrl='");
        Q89.LIZIZ(LIZ, this.imageUrl, '\'', ", openUrl='");
        Q89.LIZIZ(LIZ, this.openUrl, '\'', ", productType='");
        Q89.LIZIZ(LIZ, this.productType, '\'', ", productId=");
        LIZ.append(this.productId);
        LIZ.append(", source='");
        Q89.LIZIZ(LIZ, this.source, '\'', ", sourceFrom=");
        LIZ.append(this.sourceFrom);
        LIZ.append(", schema='");
        Q89.LIZIZ(LIZ, this.schema, '\'', ", platform=");
        LIZ.append(this.platform);
        LIZ.append(", productStatus=");
        return b0.LIZJ(LIZ, this.productStatus, '}', LIZ);
    }
}
