package com.ss.android.ugc.aweme.setting.performance;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ToolsNetworkPriorityConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("lazy_interval")
    public final long lazyInterval;

    @InterfaceC65349Pkn("p0_request")
    public final List<ToolsNetworkRequest> p0;

    @InterfaceC65349Pkn("p1_request")
    public final List<ToolsNetworkRequest> p1;

    @InterfaceC65349Pkn("p2_request")
    public final List<ToolsNetworkRequest> p2;

    @InterfaceC65349Pkn("p3_request")
    public final List<ToolsNetworkRequest> p3;

    public ToolsNetworkPriorityConfig() {
        this(false, 0L, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolsNetworkPriorityConfig copy$default(ToolsNetworkPriorityConfig toolsNetworkPriorityConfig, boolean z, long j, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toolsNetworkPriorityConfig.enable;
        }
        if ((i & 2) != 0) {
            j = toolsNetworkPriorityConfig.lazyInterval;
        }
        if ((i & 4) != 0) {
            list = toolsNetworkPriorityConfig.p0;
        }
        if ((i & 8) != 0) {
            list2 = toolsNetworkPriorityConfig.p1;
        }
        if ((i & 16) != 0) {
            list3 = toolsNetworkPriorityConfig.p2;
        }
        if ((i & 32) != 0) {
            list4 = toolsNetworkPriorityConfig.p3;
        }
        return toolsNetworkPriorityConfig.copy(z, j, list, list2, list3, list4);
    }

    public final ToolsNetworkPriorityConfig copy(boolean z, long j, List<ToolsNetworkRequest> p0, List<ToolsNetworkRequest> p1, List<ToolsNetworkRequest> p2, List<ToolsNetworkRequest> p3) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        return new ToolsNetworkPriorityConfig(z, j, p0, p1, p2, p3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Long.valueOf(this.lazyInterval), this.p0, this.p1, this.p2, this.p3};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getLazyInterval() {
        return this.lazyInterval;
    }

    public final List<ToolsNetworkRequest> getP0() {
        return this.p0;
    }

    public final List<ToolsNetworkRequest> getP1() {
        return this.p1;
    }

    public final List<ToolsNetworkRequest> getP2() {
        return this.p2;
    }

    public final List<ToolsNetworkRequest> getP3() {
        return this.p3;
    }

    public ToolsNetworkPriorityConfig(boolean z, long j, List<ToolsNetworkRequest> p0, List<ToolsNetworkRequest> p1, List<ToolsNetworkRequest> p2, List<ToolsNetworkRequest> p3) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        o.LJIIIZ(p3, "p3");
        this.enable = z;
        this.lazyInterval = j;
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public ToolsNetworkPriorityConfig(boolean z, long j, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2, (i & 16) != 0 ? C61878OQg.INSTANCE : list3, (i & 32) != 0 ? C61878OQg.INSTANCE : list4);
    }
}
