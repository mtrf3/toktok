package com.ss.android.ugc.aweme.search.service.ecom.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class LynxPrefetchConfig extends F9E {

    @InterfaceC65349Pkn("delay_time")
    public final long delayTime;

    @InterfaceC65349Pkn("enable_single_thread")
    public final boolean enableSingleThread;

    @InterfaceC65349Pkn("enable_pre_load")
    public final boolean enable_pre_load;

    @InterfaceC65349Pkn("pre_create_bullet")
    public final boolean preCreateBullet;

    @InterfaceC65349Pkn("pre_offset")
    public final int preOffset;

    @InterfaceC65349Pkn("prefetch_after_first_load")
    public final boolean prefetchAfterFirst;

    @InterfaceC65349Pkn("prefetch_in_scroll")
    public final boolean prefetchInScroll;

    /* JADX WARN: Multi-variable type inference failed */
    public LynxPrefetchConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable_pre_load), Boolean.valueOf(this.prefetchAfterFirst), Boolean.valueOf(this.prefetchInScroll), Long.valueOf(this.delayTime), Boolean.valueOf(this.preCreateBullet), Integer.valueOf(this.preOffset), Boolean.valueOf(this.enableSingleThread)};
    }

    public LynxPrefetchConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, int i, boolean z5) {
        this.enable_pre_load = z;
        this.prefetchAfterFirst = z2;
        this.prefetchInScroll = z3;
        this.delayTime = j;
        this.preCreateBullet = z4;
        this.preOffset = i;
        this.enableSingleThread = z5;
    }

    public /* synthetic */ LynxPrefetchConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, int i, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? 8 : i, (i2 & 64) == 0 ? z5 : false);
    }
}
