package com.bytedance.helios.api.config;

import X.C113554cx;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ModifyConf extends F9E {

    @InterfaceC65349Pkn("domain")
    public final Map<String, String> domain;

    @InterfaceC65349Pkn("path")
    public final Map<String, String> path;

    @InterfaceC65349Pkn("scheme")
    public final Map<String, String> scheme;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifyConf() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.scheme, this.domain, this.path};
    }

    public ModifyConf(Map<String, String> scheme, Map<String, String> domain, Map<String, String> path) {
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(domain, "domain");
        o.LJIIIZ(path, "path");
        this.scheme = scheme;
        this.domain = domain;
        this.path = path;
    }

    public /* synthetic */ ModifyConf(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C113554cx.LJJJLIIL() : map, (i & 2) != 0 ? C113554cx.LJJJLIIL() : map2, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map3);
    }
}
