package com.ss.android.ugc.aweme.ecommercelive.business.audience.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class EcWidgetLoadPriorityConfig extends F9E {

    @InterfaceC65349Pkn("load_pin_card_as_p0")
    public final boolean loadPinCardAsP0;

    @InterfaceC65349Pkn("load_shop_cart_icon_as_p0")
    public final boolean loadShopCartIconAsP0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcWidgetLoadPriorityConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.config.EcWidgetLoadPriorityConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.loadPinCardAsP0), Boolean.valueOf(this.loadShopCartIconAsP0)};
    }

    public EcWidgetLoadPriorityConfig(boolean z, boolean z2) {
        this.loadPinCardAsP0 = z;
        this.loadShopCartIconAsP0 = z2;
    }

    public /* synthetic */ EcWidgetLoadPriorityConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
