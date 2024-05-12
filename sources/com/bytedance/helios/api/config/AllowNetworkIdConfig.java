package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AllowNetworkIdConfig extends F9E {

    @InterfaceC65349Pkn("api_ids")
    public final Set<Integer> apiIds;

    @InterfaceC65349Pkn("invoke_type")
    public final String invokeType;

    public AllowNetworkIdConfig() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.apiIds, this.invokeType};
    }

    public AllowNetworkIdConfig(Set<Integer> apiIds, String invokeType) {
        o.LJIIIZ(apiIds, "apiIds");
        o.LJIIIZ(invokeType, "invokeType");
        this.apiIds = apiIds;
        this.invokeType = invokeType;
    }

    public AllowNetworkIdConfig(Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? "around" : str);
    }
}
