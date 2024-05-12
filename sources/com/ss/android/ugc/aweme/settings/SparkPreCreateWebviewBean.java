package com.ss.android.ugc.aweme.settings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SparkPreCreateWebviewBean extends F9E {

    @InterfaceC65349Pkn("autoResizeCache")
    public final boolean autoResizeCache;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("namespace")
    public final List<String> namespace;

    @InterfaceC65349Pkn("poolsize")
    public final long poolsize;

    @InterfaceC65349Pkn("preCallSetJSBridgeEnable")
    public final boolean preCallSetJSBridgeEnable;

    @InterfaceC65349Pkn("preCallWebXCreateContainerEnable")
    public final boolean preCallWebXCreateContainerEnable;

    public SparkPreCreateWebviewBean() {
        this(false, false, false, null, 0L, false, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.preCallWebXCreateContainerEnable), Boolean.valueOf(this.preCallSetJSBridgeEnable), Boolean.valueOf(this.enable), this.namespace, Long.valueOf(this.poolsize), Boolean.valueOf(this.autoResizeCache)};
    }

    public SparkPreCreateWebviewBean(boolean z, boolean z2, boolean z3, List<String> namespace, long j, boolean z4) {
        o.LJIIIZ(namespace, "namespace");
        this.preCallWebXCreateContainerEnable = z;
        this.preCallSetJSBridgeEnable = z2;
        this.enable = z3;
        this.namespace = namespace;
        this.poolsize = j;
        this.autoResizeCache = z4;
    }

    public SparkPreCreateWebviewBean(boolean z, boolean z2, boolean z3, List list, long j, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? false : z4);
    }
}
