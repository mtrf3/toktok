package com.ss.android.ugc.aweme.ecommerce.base.ordercenter;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C38827FLr;
import X.C47261Igj;
import X.C64797Pbt;
import X.C74732wX;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X8M;
import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderComponentFilter;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderComponentReq;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderPromptReq;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.ListOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GlobalOrderListPreLoad implements X8M<OrderCenterApi, AbstractC73672Svk<C64797Pbt<TypedInput>>> {
    public static final C74732wX Companion = new Object() { // from class: X.2wX
    };

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final ListOrderRequest genListOrderComponentReq(Integer num) {
        return new ListOrderRequest(C47261Igj.LJJIJIL(new ListOrderComponentReq(4, C113554cx.LJJJZ(new OSZ("tab", num), new OSZ("filter", C47261Igj.LJJIJIL(new ListOrderComponentFilter(0))), new OSZ("cursor", 0), new OSZ("size", 10), new OSZ("index", ""), new OSZ("is_new_payment", Boolean.TRUE)), null, 4, null), new ListOrderComponentReq(3, null, new ListOrderPromptReq(num), 2, null), new ListOrderComponentReq(5, null, null, 6, null)));
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, "https://oec-api.tiktokv.com/", true, 1);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIJ(exception, "exception");
        throw exception;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<C64797Pbt<TypedInput>> preload(Bundle bundle, InterfaceC88472Yns<? super Class<OrderCenterApi>, ? extends OrderCenterApi> create) {
        Integer num;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("tab"));
        } else {
            num = null;
        }
        return create.invoke(OrderCenterApi.class).getGlobalOrderList(genListOrderComponentReq(num));
    }
}
