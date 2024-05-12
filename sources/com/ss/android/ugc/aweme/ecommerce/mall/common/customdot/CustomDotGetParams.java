package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class CustomDotGetParams extends F9E {

    @InterfaceC65349Pkn("is_cold_start")
    public final int isColdStart;

    @InterfaceC65349Pkn("is_shop_tab")
    public final int isShopTab;

    @InterfaceC65349Pkn("shop_tab_position")
    public final int shopTabPosition;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isShopTab), Integer.valueOf(this.isColdStart), Integer.valueOf(this.shopTabPosition)};
    }

    public CustomDotGetParams(int i, int i2, int i3) {
        this.isShopTab = i;
        this.isColdStart = i2;
        this.shopTabPosition = i3;
    }
}
