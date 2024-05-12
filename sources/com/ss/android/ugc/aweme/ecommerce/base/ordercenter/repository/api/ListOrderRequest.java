package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ListOrderRequest extends F9E {

    @InterfaceC65349Pkn("req")
    public final List<ListOrderComponentReq> req;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.req};
    }

    public ListOrderRequest(List<ListOrderComponentReq> req) {
        o.LJIIIZ(req, "req");
        this.req = req;
    }
}
