package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.AnonymousClass391;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomDotUpdateParams {

    @InterfaceC65349Pkn("basic_info_list")
    public final List<BasicInfo> basicInfoList;

    @InterfaceC65349Pkn("is_shop_tab")
    public final int isShopTab;

    @InterfaceC65349Pkn("need_merge")
    public final int needMerge;

    @InterfaceC65349Pkn("reach_cfg_list")
    public final List<ReachCfg> reachCfgList;

    @InterfaceC65349Pkn("shop_tab_position")
    public final int shopTabPosition;

    @InterfaceC65349Pkn("update_props")
    public final int updateProps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomDotUpdateParams copy$default(CustomDotUpdateParams customDotUpdateParams, int i, List list, int i2, int i3, int i4, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = customDotUpdateParams.updateProps;
        }
        if ((i5 & 2) != 0) {
            list = customDotUpdateParams.basicInfoList;
        }
        if ((i5 & 4) != 0) {
            i2 = customDotUpdateParams.needMerge;
        }
        if ((i5 & 8) != 0) {
            i3 = customDotUpdateParams.isShopTab;
        }
        if ((i5 & 16) != 0) {
            i4 = customDotUpdateParams.shopTabPosition;
        }
        if ((i5 & 32) != 0) {
            list2 = customDotUpdateParams.reachCfgList;
        }
        return customDotUpdateParams.copy(i, list, i2, i3, i4, list2);
    }

    public final CustomDotUpdateParams copy(int i, List<BasicInfo> basicInfoList, int i2, int i3, int i4, List<ReachCfg> list) {
        o.LJIIIZ(basicInfoList, "basicInfoList");
        return new CustomDotUpdateParams(i, basicInfoList, i2, i3, i4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomDotUpdateParams)) {
            return false;
        }
        CustomDotUpdateParams customDotUpdateParams = (CustomDotUpdateParams) obj;
        return this.updateProps == customDotUpdateParams.updateProps && o.LJ(this.basicInfoList, customDotUpdateParams.basicInfoList) && this.needMerge == customDotUpdateParams.needMerge && this.isShopTab == customDotUpdateParams.isShopTab && this.shopTabPosition == customDotUpdateParams.shopTabPosition && o.LJ(this.reachCfgList, customDotUpdateParams.reachCfgList);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = (((((AnonymousClass391.LIZIZ(this.basicInfoList, this.updateProps * 31, 31) + this.needMerge) * 31) + this.isShopTab) * 31) + this.shopTabPosition) * 31;
        List<ReachCfg> list = this.reachCfgList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomDotUpdateParams(updateProps=");
        LIZ.append(this.updateProps);
        LIZ.append(", basicInfoList=");
        LIZ.append(this.basicInfoList);
        LIZ.append(", needMerge=");
        LIZ.append(this.needMerge);
        LIZ.append(", isShopTab=");
        LIZ.append(this.isShopTab);
        LIZ.append(", shopTabPosition=");
        LIZ.append(this.shopTabPosition);
        LIZ.append(", reachCfgList=");
        return C1NE.LIZIZ(LIZ, this.reachCfgList, ')', LIZ);
    }

    public final List<BasicInfo> getBasicInfoList() {
        return this.basicInfoList;
    }

    public final int getNeedMerge() {
        return this.needMerge;
    }

    public final List<ReachCfg> getReachCfgList() {
        return this.reachCfgList;
    }

    public final int getShopTabPosition() {
        return this.shopTabPosition;
    }

    public final int getUpdateProps() {
        return this.updateProps;
    }

    public final int isShopTab() {
        return this.isShopTab;
    }

    public CustomDotUpdateParams(int i, List<BasicInfo> basicInfoList, int i2, int i3, int i4, List<ReachCfg> list) {
        o.LJIIIZ(basicInfoList, "basicInfoList");
        this.updateProps = i;
        this.basicInfoList = basicInfoList;
        this.needMerge = i2;
        this.isShopTab = i3;
        this.shopTabPosition = i4;
        this.reachCfgList = list;
    }
}
