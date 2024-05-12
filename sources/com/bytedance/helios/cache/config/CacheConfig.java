package com.bytedance.helios.cache.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CacheConfig extends F9E {

    @InterfaceC65349Pkn("cache_groups")
    public final List<CacheGroup> cacheGroups;

    public CacheConfig() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.cacheGroups};
    }

    public CacheConfig(List<CacheGroup> cacheGroups) {
        o.LJIIIZ(cacheGroups, "cacheGroups");
        this.cacheGroups = cacheGroups;
    }

    public CacheConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
