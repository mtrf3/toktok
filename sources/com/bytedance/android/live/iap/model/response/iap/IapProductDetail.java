package com.bytedance.android.live.iap.model.response.iap;

import X.C35371a9;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes.dex */
public final class IapProductDetail {

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("oneTimePurchaseProduct")
    public C35371a9 oneTimePurchaseProduct;

    @InterfaceC65349Pkn("productId")
    public String productId = "";

    @InterfaceC65349Pkn("productType")
    public String productType;

    @InterfaceC65349Pkn("subscriptionOffer")
    public List<IapSubscriptionProduct> subscriptionOffer;

    @InterfaceC65349Pkn("title")
    public String title;
}
