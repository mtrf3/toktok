package com.bytedance.hybrid.spark.security.web_js.setting;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JSInjectConfig extends F9E {

    @InterfaceC65349Pkn("allowList")
    public final List<String> allowList;

    @InterfaceC65349Pkn("blockList")
    public final List<String> blockList;

    @InterfaceC65349Pkn("businessLine")
    public final String businessLine;

    @InterfaceC65349Pkn("geckoUrl")
    public final String geckoUrl;

    @InterfaceC65349Pkn("injectTime")
    public final String injectTime;

    @InterfaceC65349Pkn("isUseHardCode")
    public final boolean isUseHardCode;

    @InterfaceC65349Pkn("name")
    public final String name;

    public JSInjectConfig() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.injectTime, this.businessLine, this.allowList, this.blockList, this.geckoUrl, Boolean.valueOf(this.isUseHardCode)};
    }

    public JSInjectConfig(String name, String injectTime, String businessLine, List<String> allowList, List<String> blockList, String geckoUrl, boolean z) {
        o.LJIIJ(name, "name");
        o.LJIIJ(injectTime, "injectTime");
        o.LJIIJ(businessLine, "businessLine");
        o.LJIIJ(allowList, "allowList");
        o.LJIIJ(blockList, "blockList");
        o.LJIIJ(geckoUrl, "geckoUrl");
        this.name = name;
        this.injectTime = injectTime;
        this.businessLine = businessLine;
        this.allowList = allowList;
        this.blockList = blockList;
        this.geckoUrl = geckoUrl;
        this.isUseHardCode = z;
    }

    public JSInjectConfig(String str, String str2, String str3, List list, List list2, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? false : z);
    }
}
