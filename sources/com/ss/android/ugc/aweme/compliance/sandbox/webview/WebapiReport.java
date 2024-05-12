package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebapiReport extends F9E {

    @InterfaceC65349Pkn("denyList")
    public final List<String> denyList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public WebapiReport() {
        this(false, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.denyList};
    }

    public WebapiReport(boolean z, List<String> denyList) {
        o.LJIIIZ(denyList, "denyList");
        this.enable = z;
        this.denyList = denyList;
    }

    public WebapiReport(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}