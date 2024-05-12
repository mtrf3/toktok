package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomDotUpdateParams extends F9E {

    @InterfaceC65349Pkn("basic_info_list")
    public final List<BasicInfo> basicInfoList;

    @InterfaceC65349Pkn("is_shop_tab")
    public final int isShopTab;

    @InterfaceC65349Pkn("need_merge")
    public final int needMerge;

    @InterfaceC65349Pkn("shop_tab_position")
    public final int shopTabPosition;

    @InterfaceC65349Pkn("update_props")
    public final int updateProps;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.updateProps), this.basicInfoList, Integer.valueOf(this.needMerge), Integer.valueOf(this.isShopTab), Integer.valueOf(this.shopTabPosition)};
    }

    public CustomDotUpdateParams(int i, List<BasicInfo> basicInfoList, int i2, int i3, int i4) {
        o.LJIIIZ(basicInfoList, "basicInfoList");
        this.updateProps = i;
        this.basicInfoList = basicInfoList;
        this.needMerge = i2;
        this.isShopTab = i3;
        this.shopTabPosition = i4;
    }
}
