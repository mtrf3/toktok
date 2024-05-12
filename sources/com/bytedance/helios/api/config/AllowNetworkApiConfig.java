package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AllowNetworkApiConfig extends F9E {

    @InterfaceC65349Pkn("end_with_domains")
    public final Set<String> endWithDomains;

    @InterfaceC65349Pkn("invoke_type")
    public final String invokeType;

    @InterfaceC65349Pkn("start_with_paths")
    public final Set<String> startWithPaths;

    public AllowNetworkApiConfig() {
        this(null, null, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.endWithDomains, this.startWithPaths, this.invokeType};
    }

    public AllowNetworkApiConfig(Set<String> endWithDomains, Set<String> startWithPaths, String invokeType) {
        o.LJIIIZ(endWithDomains, "endWithDomains");
        o.LJIIIZ(startWithPaths, "startWithPaths");
        o.LJIIIZ(invokeType, "invokeType");
        this.endWithDomains = endWithDomains;
        this.startWithPaths = startWithPaths;
        this.invokeType = invokeType;
    }

    public AllowNetworkApiConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
