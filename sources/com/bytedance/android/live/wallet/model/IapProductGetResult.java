package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class IapProductGetResult extends BaseIapProductResult {

    @InterfaceC65349Pkn("data")
    public final HashMap<String, Item> data = new HashMap<>();

    /* loaded from: classes14.dex */
    public static final class Item {

        @InterfaceC65349Pkn("price_amount_micros")
        public long priceAmountMicros;

        @InterfaceC65349Pkn("product_id")
        public String productId = "";

        @InterfaceC65349Pkn("sku_name")
        public String skuName = "";

        @InterfaceC65349Pkn("currency")
        public String currency = "";

        @InterfaceC65349Pkn("price")
        public String price = "";
    }
}
