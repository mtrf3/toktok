package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomDotGetParams extends F9E {

    @InterfaceC65349Pkn("is_cold_start")
    public final int isColdStart;

    @InterfaceC65349Pkn("is_shop_tab")
    public final int isShopTab;

    @InterfaceC65349Pkn("mall_version")
    public final String mallVersion;

    @InterfaceC65349Pkn("shop_tab_position")
    public final int shopTabPosition;

    public static /* synthetic */ CustomDotGetParams copy$default(CustomDotGetParams customDotGetParams, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = customDotGetParams.isShopTab;
        }
        if ((i4 & 2) != 0) {
            i2 = customDotGetParams.isColdStart;
        }
        if ((i4 & 4) != 0) {
            i3 = customDotGetParams.shopTabPosition;
        }
        if ((i4 & 8) != 0) {
            str = customDotGetParams.mallVersion;
        }
        return customDotGetParams.copy(i, i2, i3, str);
    }

    public final CustomDotGetParams copy(int i, int i2, int i3, String mallVersion) {
        o.LJIIIZ(mallVersion, "mallVersion");
        return new CustomDotGetParams(i, i2, i3, mallVersion);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isShopTab), Integer.valueOf(this.isColdStart), Integer.valueOf(this.shopTabPosition), this.mallVersion};
    }

    public final String getMallVersion() {
        return this.mallVersion;
    }

    public final int getShopTabPosition() {
        return this.shopTabPosition;
    }

    public final int isColdStart() {
        return this.isColdStart;
    }

    public final int isShopTab() {
        return this.isShopTab;
    }

    public CustomDotGetParams(int i, int i2, int i3, String mallVersion) {
        o.LJIIIZ(mallVersion, "mallVersion");
        this.isShopTab = i;
        this.isColdStart = i2;
        this.shopTabPosition = i3;
        this.mallVersion = mallVersion;
    }
}
