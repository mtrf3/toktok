package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IconCfg {

    @InterfaceC65349Pkn("basic_info_list")
    public final List<BasicInfo> basicInfoList;
    public final Long duration;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IconCfg copy$default(IconCfg iconCfg, String str, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iconCfg.iconUrl;
        }
        if ((i & 2) != 0) {
            l = iconCfg.duration;
        }
        if ((i & 4) != 0) {
            list = iconCfg.basicInfoList;
        }
        return iconCfg.copy(str, l, list);
    }

    public final IconCfg copy(String str, Long l, List<BasicInfo> list) {
        return new IconCfg(str, l, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconCfg)) {
            return false;
        }
        IconCfg iconCfg = (IconCfg) obj;
        return o.LJ(this.iconUrl, iconCfg.iconUrl) && o.LJ(this.duration, iconCfg.duration) && o.LJ(this.basicInfoList, iconCfg.basicInfoList);
    }

    public int hashCode() {
        String str = this.iconUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.duration;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<BasicInfo> list = this.basicInfoList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IconCfg(iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", basicInfoList=");
        return C1NE.LIZIZ(LIZ, this.basicInfoList, ')', LIZ);
    }

    public final List<BasicInfo> getBasicInfoList() {
        return this.basicInfoList;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public IconCfg(String str, Long l, List<BasicInfo> list) {
        this.iconUrl = str;
        this.duration = l;
        this.basicInfoList = list;
    }
}
