package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AllowNetworkApmConfig extends F9E {

    @InterfaceC65349Pkn("content_sub_types")
    public final Set<String> contentSubTypes;

    @InterfaceC65349Pkn("content_types")
    public final Set<String> contentTypes;

    @InterfaceC65349Pkn("invoke_type")
    public final String invokeType;

    public AllowNetworkApmConfig() {
        this(null, null, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.contentTypes, this.contentSubTypes, this.invokeType};
    }

    public AllowNetworkApmConfig(Set<String> contentTypes, Set<String> contentSubTypes, String invokeType) {
        o.LJIIIZ(contentTypes, "contentTypes");
        o.LJIIIZ(contentSubTypes, "contentSubTypes");
        o.LJIIIZ(invokeType, "invokeType");
        this.contentTypes = contentTypes;
        this.contentSubTypes = contentSubTypes;
        this.invokeType = invokeType;
    }

    public AllowNetworkApmConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
