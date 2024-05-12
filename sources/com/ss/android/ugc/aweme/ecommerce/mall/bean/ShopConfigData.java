package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopConfigData extends F9E {

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public final Default f23default;

    public static /* synthetic */ ShopConfigData copy$default(ShopConfigData shopConfigData, Default r2, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = shopConfigData.f23default;
        }
        return shopConfigData.copy(r2);
    }

    public final ShopConfigData copy(Default r2) {
        o.LJIIIZ(r2, "default");
        return new ShopConfigData(r2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.f23default};
    }

    public final Default getDefault() {
        return this.f23default;
    }

    public ShopConfigData(Default r2) {
        o.LJIIIZ(r2, "default");
        this.f23default = r2;
    }
}
