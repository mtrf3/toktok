package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PlanBRule extends F9E {

    @InterfaceC65349Pkn("htmlIncludes")
    public final List<String> htmlIncludes;

    public PlanBRule() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.htmlIncludes};
    }

    public PlanBRule(List<String> htmlIncludes) {
        o.LJIIIZ(htmlIncludes, "htmlIncludes");
        this.htmlIncludes = htmlIncludes;
    }

    public PlanBRule(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
