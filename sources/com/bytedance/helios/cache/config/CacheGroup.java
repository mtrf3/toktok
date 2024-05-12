package com.bytedance.helios.cache.config;

import X.C113554cx;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CacheGroup extends F9E {

    @InterfaceC65349Pkn("api_ids")
    public final List<Integer> apiIds;

    @InterfaceC65349Pkn("filter")
    public final String filter;

    @InterfaceC65349Pkn("params")
    public final Map<String, String> params;

    @InterfaceC65349Pkn("store")
    public final String store;

    @InterfaceC65349Pkn("strategy")
    public final String strategy;

    public CacheGroup() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.store, this.strategy, this.apiIds, this.params, this.filter};
    }

    public CacheGroup(String store, String strategy, List<Integer> apiIds, Map<String, String> params, String filter) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(apiIds, "apiIds");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(filter, "filter");
        this.store = store;
        this.strategy = strategy;
        this.apiIds = apiIds;
        this.params = params;
        this.filter = filter;
    }

    public CacheGroup(String str, String str2, List list, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "map" : str, (i & 2) != 0 ? "persist" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C113554cx.LJJJLIIL() : map, (i & 16) != 0 ? "" : str3);
    }
}
