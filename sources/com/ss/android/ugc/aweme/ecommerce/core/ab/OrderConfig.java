package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderConfig extends F9E {

    @InterfaceC65349Pkn("add_to_cart_entrance_info_keys")
    public List<String> addToCardEntranceInfoKeys;

    @InterfaceC65349Pkn("order_entrance_info_keys")
    public List<String> orderEntranceInfoKeys;

    @InterfaceC65349Pkn("single_sku_order_enable")
    public boolean singleSkuOrderEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderConfig() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.orderEntranceInfoKeys, this.addToCardEntranceInfoKeys, Boolean.valueOf(this.singleSkuOrderEnable)};
    }

    public OrderConfig(List<String> orderEntranceInfoKeys, List<String> addToCardEntranceInfoKeys, boolean z) {
        o.LJIIIZ(orderEntranceInfoKeys, "orderEntranceInfoKeys");
        o.LJIIIZ(addToCardEntranceInfoKeys, "addToCardEntranceInfoKeys");
        this.orderEntranceInfoKeys = orderEntranceInfoKeys;
        this.addToCardEntranceInfoKeys = addToCardEntranceInfoKeys;
        this.singleSkuOrderEnable = z;
    }

    public /* synthetic */ OrderConfig(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? true : z);
    }
}
