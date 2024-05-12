package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchAheadPrefetchOptConfig extends F9E {

    @InterfaceC65349Pkn("clear_cache_delay_time")
    public final long clearCacheDelayTime;

    @InterfaceC65349Pkn("enable_ahead_prefetch")
    public final boolean enableAheadPrefetch;

    @InterfaceC65349Pkn("enable_clear_cache")
    public final boolean enableClearCache;

    @InterfaceC65349Pkn("prefetch_delay_time")
    public final long prefetchDelayTime;

    @InterfaceC65349Pkn("real_request_delay_time")
    public final long realRequestDelayTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchAheadPrefetchOptConfig() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r9 = 31
            r10 = 0
            r0 = r11
            r4 = r1
            r5 = r2
            r7 = r2
            r0.<init>(r1, r2, r4, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SearchAheadPrefetchOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableAheadPrefetch), Long.valueOf(this.prefetchDelayTime), Boolean.valueOf(this.enableClearCache), Long.valueOf(this.clearCacheDelayTime), Long.valueOf(this.realRequestDelayTime)};
    }

    public SearchAheadPrefetchOptConfig(boolean z, long j, boolean z2, long j2, long j3) {
        this.enableAheadPrefetch = z;
        this.prefetchDelayTime = j;
        this.enableClearCache = z2;
        this.clearCacheDelayTime = j2;
        this.realRequestDelayTime = j3;
    }

    public /* synthetic */ SearchAheadPrefetchOptConfig(boolean z, long j, boolean z2, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? 13000L : j2, (i & 16) == 0 ? j3 : 0L);
    }
}
