package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class CartRefreshEvent {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("add_count")
    public final Integer addCount;

    @InterfaceC65349Pkn("cart_item")
    public final Map<String, String> cartItem;

    @InterfaceC65349Pkn("count")
    public final Integer count;

    @InterfaceC65349Pkn("extra_info")
    public final Map<String, Object> extraInfo;

    @InterfaceC65349Pkn("refresh")
    public final int refresh;

    @InterfaceC65349Pkn("toast")
    public final String toast;

    public CartRefreshEvent(int i, Integer num, Map<String, String> map, Integer num2, Map<String, ? extends Object> map2, String str) {
        this.refresh = i;
        this.count = num;
        this.cartItem = map;
        this.addCount = num2;
        this.extraInfo = map2;
        this.toast = str;
    }

    public /* synthetic */ CartRefreshEvent(int i, Integer num, Map map, Integer num2, Map map2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : map2, (i2 & 32) == 0 ? str : null);
    }
}
