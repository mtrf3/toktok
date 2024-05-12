package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UrlRules extends F9E {

    @InterfaceC65349Pkn("excludes")
    public final List<String> excludes;

    @InterfaceC65349Pkn("forcePlanB")
    public final boolean forcePlanB;

    @InterfaceC65349Pkn("includes")
    public final List<String> includes;

    @InterfaceC65349Pkn("planb")
    public final PlanBRule planb;

    public UrlRules() {
        this(null, null, false, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.includes, this.excludes, Boolean.valueOf(this.forcePlanB), this.planb};
    }

    public UrlRules(List<String> includes, List<String> excludes, boolean z, PlanBRule planb) {
        o.LJIIIZ(includes, "includes");
        o.LJIIIZ(excludes, "excludes");
        o.LJIIIZ(planb, "planb");
        this.includes = includes;
        this.excludes = excludes;
        this.forcePlanB = z;
        this.planb = planb;
    }

    public UrlRules(List list, List list2, boolean z, PlanBRule planBRule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new PlanBRule(null, 1, null) : planBRule);
    }
}
