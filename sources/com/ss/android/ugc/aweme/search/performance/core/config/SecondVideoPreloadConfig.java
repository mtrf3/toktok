package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SecondVideoPreloadConfig extends F9E {

    @InterfaceC65349Pkn("enable_search_second_video_preload")
    public final boolean enableSearchSecondVideoPreload;

    @InterfaceC65349Pkn("enable_search_second_video_preload_in_chunk")
    public final boolean enableSearchSecondVideoPreloadInChunk;

    @InterfaceC65349Pkn("enable_search_second_video_prepare")
    public final boolean enableSearchSecondVideoPrepare;

    @InterfaceC65349Pkn("enable_search_second_video_prepare_in_main_thread")
    public final boolean enableSearchSecondVideoPrepareInMainThread;

    @InterfaceC65349Pkn("preload_delay_time")
    public final long preloadDelayTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SecondVideoPreloadConfig() {
        /*
            r9 = this;
            r1 = 0
            r5 = 0
            r7 = 31
            r8 = 0
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SecondVideoPreloadConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableSearchSecondVideoPreload), Boolean.valueOf(this.enableSearchSecondVideoPrepare), Boolean.valueOf(this.enableSearchSecondVideoPreloadInChunk), Boolean.valueOf(this.enableSearchSecondVideoPrepareInMainThread), Long.valueOf(this.preloadDelayTime)};
    }

    public SecondVideoPreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.enableSearchSecondVideoPreload = z;
        this.enableSearchSecondVideoPrepare = z2;
        this.enableSearchSecondVideoPreloadInChunk = z3;
        this.enableSearchSecondVideoPrepareInMainThread = z4;
        this.preloadDelayTime = j;
    }

    public /* synthetic */ SecondVideoPreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? 0L : j);
    }
}
