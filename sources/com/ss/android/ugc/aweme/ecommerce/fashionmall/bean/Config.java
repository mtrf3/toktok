package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Config {

    @InterfaceC65349Pkn("component_list")
    public final List<CommonBlock> componentList;

    @InterfaceC65349Pkn("layout")
    public final String layout;

    @InterfaceC65349Pkn("layout_type")
    public final String layoutType;

    /* JADX WARN: Multi-variable type inference failed */
    public Config() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return o.LJ(this.componentList, config.componentList) && o.LJ(this.layout, config.layout) && o.LJ(this.layoutType, config.layoutType);
    }

    public final int hashCode() {
        List<CommonBlock> list = this.componentList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.layout;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.layoutType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(componentList=");
        LIZ.append(this.componentList);
        LIZ.append(", layout=");
        LIZ.append(this.layout);
        LIZ.append(", layoutType=");
        return q.LIZIZ(LIZ, this.layoutType, ')', LIZ);
    }

    public Config(List<CommonBlock> list, String str, String str2) {
        this.componentList = list;
        this.layout = str;
        this.layoutType = str2;
    }

    public /* synthetic */ Config(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
