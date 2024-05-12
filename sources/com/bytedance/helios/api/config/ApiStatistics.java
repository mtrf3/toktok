package com.bytedance.helios.api.config;

import X.C47261Igj;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiStatistics extends F9E {

    @InterfaceC65349Pkn("apis")
    public final List<Integer> apis;

    @InterfaceC65349Pkn("cached")
    public final boolean cached;

    @InterfaceC65349Pkn("fact_parameters")
    public final List<String> factParameters;

    @InterfaceC65349Pkn("fact_queue_size")
    public final int factQueueSize;

    @InterfaceC65349Pkn("fact_timeout")
    public final long factTimeOut;

    @InterfaceC65349Pkn("is_block_list")
    public final boolean isBlockList;

    @InterfaceC65349Pkn("items")
    public final List<String> items;

    @InterfaceC65349Pkn("session_interval_time")
    public final long sessionIntervalTime;

    @InterfaceC65349Pkn("type")
    public final String type;

    public ApiStatistics() {
        this(null, false, null, null, 0, null, 0L, 0L, false, 511, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.type, Boolean.valueOf(this.isBlockList), this.apis, this.items, Integer.valueOf(this.factQueueSize), this.factParameters, Long.valueOf(this.factTimeOut), Long.valueOf(this.sessionIntervalTime), Boolean.valueOf(this.cached)};
    }

    public ApiStatistics(String type, boolean z, List<Integer> apis, List<String> items, int i, List<String> factParameters, long j, long j2, boolean z2) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(apis, "apis");
        o.LJIIIZ(items, "items");
        o.LJIIIZ(factParameters, "factParameters");
        this.type = type;
        this.isBlockList = z;
        this.apis = apis;
        this.items = items;
        this.factQueueSize = i;
        this.factParameters = factParameters;
        this.factTimeOut = j;
        this.sessionIntervalTime = j2;
        this.cached = z2;
    }

    public ApiStatistics(String str, boolean z, List list, List list2, int i, List list3, long j, long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "api" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C61878OQg.INSTANCE : list, (i2 & 8) != 0 ? C61878OQg.INSTANCE : list2, (i2 & 16) != 0 ? 100 : i, (i2 & 32) != 0 ? C47261Igj.LJJIJIIJI("is_not_consent", "is_guest_mode", "is_kids_mode") : list3, (i2 & 64) != 0 ? 30000L : j, (i2 & 128) != 0 ? 60000L : j2, (i2 & 256) == 0 ? z2 : false);
    }
}
