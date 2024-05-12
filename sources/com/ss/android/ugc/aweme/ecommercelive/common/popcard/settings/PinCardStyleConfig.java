package com.ss.android.ugc.aweme.ecommercelive.common.popcard.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class PinCardStyleConfig extends F9E {

    @InterfaceC65349Pkn("real_time_refresh")
    public boolean realTimeRefresh;

    @InterfaceC65349Pkn("show_time")
    public long showTime;

    public PinCardStyleConfig() {
        this(0L, false, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.showTime), Boolean.valueOf(this.realTimeRefresh)};
    }

    public PinCardStyleConfig(long j, boolean z) {
        this.showTime = j;
        this.realTimeRefresh = z;
    }

    public /* synthetic */ PinCardStyleConfig(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 30000L : j, (i & 2) != 0 ? false : z);
    }
}
