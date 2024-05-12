package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomDotResponse {

    @InterfaceC65349Pkn("count_cfg")
    public final CountCfg countConfig;

    @InterfaceC65349Pkn("icon_cfg")
    public final IconCfg iconConfig;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;
    public Map<String, ? extends Object> logExtraMap;

    @InterfaceC65349Pkn("reach_cfg_list")
    public final List<ReachCfg> reachConfigList;

    @InterfaceC65349Pkn("reddot_list")
    public final List<CommonRedDot> redDotList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomDotResponse copy$default(CustomDotResponse customDotResponse, List list, CountCfg countCfg, IconCfg iconCfg, List list2, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customDotResponse.redDotList;
        }
        if ((i & 2) != 0) {
            countCfg = customDotResponse.countConfig;
        }
        if ((i & 4) != 0) {
            iconCfg = customDotResponse.iconConfig;
        }
        if ((i & 8) != 0) {
            list2 = customDotResponse.reachConfigList;
        }
        if ((i & 16) != 0) {
            str = customDotResponse.logExtra;
        }
        if ((i & 32) != 0) {
            map = customDotResponse.logExtraMap;
        }
        return customDotResponse.copy(list, countCfg, iconCfg, list2, str, map);
    }

    public final CustomDotResponse copy(List<CommonRedDot> list, CountCfg countCfg, IconCfg iconCfg, List<ReachCfg> list2, String str, Map<String, ? extends Object> map) {
        return new CustomDotResponse(list, countCfg, iconCfg, list2, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomDotResponse)) {
            return false;
        }
        CustomDotResponse customDotResponse = (CustomDotResponse) obj;
        return o.LJ(this.redDotList, customDotResponse.redDotList) && o.LJ(this.countConfig, customDotResponse.countConfig) && o.LJ(this.iconConfig, customDotResponse.iconConfig) && o.LJ(this.reachConfigList, customDotResponse.reachConfigList) && o.LJ(this.logExtra, customDotResponse.logExtra) && o.LJ(this.logExtraMap, customDotResponse.logExtraMap);
    }

    public int hashCode() {
        List<CommonRedDot> list = this.redDotList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CountCfg countCfg = this.countConfig;
        int hashCode2 = (hashCode + (countCfg == null ? 0 : countCfg.hashCode())) * 31;
        IconCfg iconCfg = this.iconConfig;
        int hashCode3 = (hashCode2 + (iconCfg == null ? 0 : iconCfg.hashCode())) * 31;
        List<ReachCfg> list2 = this.reachConfigList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.logExtra;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, ? extends Object> map = this.logExtraMap;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomDotResponse(redDotList=");
        LIZ.append(this.redDotList);
        LIZ.append(", countConfig=");
        LIZ.append(this.countConfig);
        LIZ.append(", iconConfig=");
        LIZ.append(this.iconConfig);
        LIZ.append(", reachConfigList=");
        LIZ.append(this.reachConfigList);
        LIZ.append(", logExtra=");
        LIZ.append(this.logExtra);
        LIZ.append(", logExtraMap=");
        return C15890jp.LIZ(LIZ, this.logExtraMap, ')', LIZ);
    }

    public final CountCfg getCountConfig() {
        return this.countConfig;
    }

    public final IconCfg getIconConfig() {
        return this.iconConfig;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final Map<String, Object> getLogExtraMap() {
        return this.logExtraMap;
    }

    public final List<ReachCfg> getReachConfigList() {
        return this.reachConfigList;
    }

    public final List<CommonRedDot> getRedDotList() {
        return this.redDotList;
    }

    public final void setLogExtraMap(Map<String, ? extends Object> map) {
        this.logExtraMap = map;
    }

    public CustomDotResponse(List<CommonRedDot> list, CountCfg countCfg, IconCfg iconCfg, List<ReachCfg> list2, String str, Map<String, ? extends Object> map) {
        this.redDotList = list;
        this.countConfig = countCfg;
        this.iconConfig = iconCfg;
        this.reachConfigList = list2;
        this.logExtra = str;
        this.logExtraMap = map;
    }
}
