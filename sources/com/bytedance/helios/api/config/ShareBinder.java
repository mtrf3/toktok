package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShareBinder extends F9E {

    @InterfaceC65349Pkn("interface")
    public final String interfaceName;

    @InterfaceC65349Pkn("methods")
    public final List<String> methods;

    @InterfaceC65349Pkn("pre_analysis")
    public final boolean needPreAnalysis;

    public ShareBinder() {
        this(null, null, false, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.interfaceName, this.methods, Boolean.valueOf(this.needPreAnalysis)};
    }

    public ShareBinder(String interfaceName, List<String> methods, boolean z) {
        o.LJIIIZ(interfaceName, "interfaceName");
        o.LJIIIZ(methods, "methods");
        this.interfaceName = interfaceName;
        this.methods = methods;
        this.needPreAnalysis = z;
    }

    public ShareBinder(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? false : z);
    }
}
