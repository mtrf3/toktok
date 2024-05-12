package com.ss.android.ugc.aweme.ecommerce.base.ordercenter;

import X.AbstractC73672Svk;
import X.C38827FLr;
import X.C64797Pbt;
import X.C74742wY;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class OrderListPreLoad implements X8M<OrderCenterApi, AbstractC73672Svk<C64797Pbt<TypedInput>>> {
    public static final C74742wY Companion = new Object() { // from class: X.2wY
    };

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
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
        return create.invoke(OrderCenterApi.class).getOrderList(0, num, 10, true, "", true, false, 1);
    }
}
