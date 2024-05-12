package com.bytedance.hybrid.spark.security.web_js.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JSInjectGlobalConfig extends F9E {

    @InterfaceC65349Pkn("blockList")
    public final Set<String> blockList;

    @InterfaceC65349Pkn("finishInjectors")
    public final Set<String> finishInjectors;

    @InterfaceC65349Pkn("inlineInjectors")
    public final Set<String> inlineInjectors;

    @InterfaceC65349Pkn("manualInjectors")
    public final Set<String> manualInjectors;

    @InterfaceC65349Pkn("startInjectors")
    public final Set<String> startInjectors;

    public JSInjectGlobalConfig() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.startInjectors, this.finishInjectors, this.inlineInjectors, this.manualInjectors, this.blockList};
    }

    public JSInjectGlobalConfig(Set<String> startInjectors, Set<String> finishInjectors, Set<String> inlineInjectors, Set<String> manualInjectors, Set<String> blockList) {
        o.LJIIJ(startInjectors, "startInjectors");
        o.LJIIJ(finishInjectors, "finishInjectors");
        o.LJIIJ(inlineInjectors, "inlineInjectors");
        o.LJIIJ(manualInjectors, "manualInjectors");
        o.LJIIJ(blockList, "blockList");
        this.startInjectors = startInjectors;
        this.finishInjectors = finishInjectors;
        this.inlineInjectors = inlineInjectors;
        this.manualInjectors = manualInjectors;
        this.blockList = blockList;
    }

    public JSInjectGlobalConfig(Set set, Set set2, Set set3, Set set4, Set set5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? OQY.INSTANCE : set3, (i & 8) != 0 ? OQY.INSTANCE : set4, (i & 16) != 0 ? OQY.INSTANCE : set5);
    }
}
