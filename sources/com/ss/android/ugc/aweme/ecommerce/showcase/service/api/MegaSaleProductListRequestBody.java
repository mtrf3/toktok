package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MegaSaleProductListRequestBody {

    @InterfaceC65349Pkn("page_size")
    public final int pageSize;

    @InterfaceC65349Pkn("scroll_param")
    public final String scrollParam;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    public MegaSaleProductListRequestBody(String sellerId, int i, String scrollParam) {
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(scrollParam, "scrollParam");
        this.sellerId = sellerId;
        this.pageSize = i;
        this.scrollParam = scrollParam;
    }
}
