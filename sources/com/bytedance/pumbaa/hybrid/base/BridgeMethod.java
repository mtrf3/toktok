package com.bytedance.pumbaa.hybrid.base;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BridgeMethod extends F9E {

    @InterfaceC65349Pkn("method")
    public final List<String> method;

    @InterfaceC65349Pkn("namespace")
    public final String namespace;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.namespace, this.method};
    }

    public BridgeMethod(String namespace, List<String> method) {
        o.LJIIIZ(namespace, "namespace");
        o.LJIIIZ(method, "method");
        this.namespace = namespace;
        this.method = method;
    }
}
