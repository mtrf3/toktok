package com.bytedance.pumbaa.base.settings;

import X.C00F;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class GuardRange extends F9E {

    @InterfaceC65349Pkn("api_ids")
    public final List<Integer> apiIds;

    @InterfaceC65349Pkn("data_types")
    public final List<String> dataTypes;

    @InterfaceC65349Pkn("exclude_api_ids")
    public final List<Integer> excludeApiIds;

    public GuardRange() {
        this(null, null, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.apiIds, this.excludeApiIds, this.dataTypes};
    }

    public GuardRange(List<Integer> list, List<Integer> list2, List<String> list3) {
        C00F.LJ(list, "apiIds", list2, "excludeApiIds", list3, "dataTypes");
        this.apiIds = list;
        this.excludeApiIds = list2;
        this.dataTypes = list3;
    }

    public GuardRange(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
