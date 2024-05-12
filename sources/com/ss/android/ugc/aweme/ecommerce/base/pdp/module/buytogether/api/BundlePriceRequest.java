package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BundlePriceRequest extends F9E {

    @InterfaceC65349Pkn("sku_info")
    public final Map<String, SelectedSkuInfo> product2Sku;

    @InterfaceC65349Pkn("traffic_source")
    public final int trafficSource;

    @InterfaceC65349Pkn("traffic_source_list")
    public final List<Integer> trafficSourceList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.product2Sku, Integer.valueOf(this.trafficSource), this.trafficSourceList};
    }

    public BundlePriceRequest(Map<String, SelectedSkuInfo> product2Sku, int i, List<Integer> trafficSourceList) {
        o.LJIIIZ(product2Sku, "product2Sku");
        o.LJIIIZ(trafficSourceList, "trafficSourceList");
        this.product2Sku = product2Sku;
        this.trafficSource = i;
        this.trafficSourceList = trafficSourceList;
    }
}
