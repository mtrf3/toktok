package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StrictModeConfig extends F9E {

    @InterfaceC65349Pkn("fuse_api_ids")
    public final List<Integer> fuseApiIds;

    @InterfaceC65349Pkn("report_api_ids")
    public final List<Integer> reportApiIds;

    public StrictModeConfig() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.fuseApiIds, this.reportApiIds};
    }

    public StrictModeConfig(List<Integer> fuseApiIds, List<Integer> reportApiIds) {
        o.LJIIIZ(fuseApiIds, "fuseApiIds");
        o.LJIIIZ(reportApiIds, "reportApiIds");
        this.fuseApiIds = fuseApiIds;
        this.reportApiIds = reportApiIds;
    }

    public StrictModeConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
