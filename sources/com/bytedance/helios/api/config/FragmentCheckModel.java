package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FragmentCheckModel extends F9E {

    @InterfaceC65349Pkn("fragments")
    public final List<String> fragments;

    @InterfaceC65349Pkn("resource_ids")
    public final List<String> resource_ids;

    public FragmentCheckModel() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.resource_ids, this.fragments};
    }

    public FragmentCheckModel(List<String> resource_ids, List<String> fragments) {
        o.LJIIIZ(resource_ids, "resource_ids");
        o.LJIIIZ(fragments, "fragments");
        this.resource_ids = resource_ids;
        this.fragments = fragments;
    }

    public FragmentCheckModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
