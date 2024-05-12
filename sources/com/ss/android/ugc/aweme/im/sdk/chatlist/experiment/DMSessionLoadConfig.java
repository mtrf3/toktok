package com.ss.android.ugc.aweme.im.sdk.chatlist.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DMSessionLoadConfig extends F9E {

    @InterfaceC65349Pkn("batch_convert_size")
    public final int batchConvertSize;

    @InterfaceC65349Pkn("cache_strategy")
    public final int cacheStrategy;

    @InterfaceC65349Pkn("dm_view_holder_cache_size")
    public final int dmViewHolderCacheSize;

    @InterfaceC65349Pkn("inbox_debounce_time_ms")
    public final long inboxMediatorDebounceTimeMs;

    @InterfaceC65349Pkn("init_new_page_with_memory_session")
    public final boolean initNewPageWithMemorySession;

    @InterfaceC65349Pkn("min_size_to_display")
    public final int minSizeToDisplay;

    @InterfaceC65349Pkn("min_size_to_stop_load")
    public final int minSizeToStopLoad;

    @InterfaceC65349Pkn("preload_secondary")
    public final boolean preloadSecondary;

    @InterfaceC65349Pkn("refactor_data_flow_debug_log")
    public final boolean refactorDataFlowDebugLog;

    @InterfaceC65349Pkn("refactor_data_flow_perf_log")
    public final boolean refactorDataFlowPerfLog;

    @InterfaceC65349Pkn("session_data_mediator_debounce_time_ms")
    public final long sessionDataMediatorDebounceTimeMs;

    @InterfaceC65349Pkn("large_page_size_for_load_more")
    public final boolean useLargerPageSize;

    @InterfaceC65349Pkn("use_old_activity_status_logic")
    public final boolean useOldActivityStatusLogic;

    @InterfaceC65349Pkn("use_recycler_view_pool")
    public final boolean useRecyclerViewPool;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMSessionLoadConfig() {
        /*
            r19 = this;
            r1 = 0
            r8 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r18 = 0
            r0 = r19
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r8
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.experiment.DMSessionLoadConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.preloadSecondary), Integer.valueOf(this.minSizeToDisplay), Integer.valueOf(this.minSizeToStopLoad), Boolean.valueOf(this.initNewPageWithMemorySession), Integer.valueOf(this.cacheStrategy), Boolean.valueOf(this.useLargerPageSize), Integer.valueOf(this.batchConvertSize), Long.valueOf(this.inboxMediatorDebounceTimeMs), Long.valueOf(this.sessionDataMediatorDebounceTimeMs), Boolean.valueOf(this.refactorDataFlowPerfLog), Boolean.valueOf(this.refactorDataFlowDebugLog), Boolean.valueOf(this.useOldActivityStatusLogic), Boolean.valueOf(this.useRecyclerViewPool), Integer.valueOf(this.dmViewHolderCacheSize)};
    }

    public DMSessionLoadConfig(boolean z, int i, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.preloadSecondary = z;
        this.minSizeToDisplay = i;
        this.minSizeToStopLoad = i2;
        this.initNewPageWithMemorySession = z2;
        this.cacheStrategy = i3;
        this.useLargerPageSize = z3;
        this.batchConvertSize = i4;
        this.inboxMediatorDebounceTimeMs = j;
        this.sessionDataMediatorDebounceTimeMs = j2;
        this.refactorDataFlowPerfLog = z4;
        this.refactorDataFlowDebugLog = z5;
        this.useOldActivityStatusLogic = z6;
        this.useRecyclerViewPool = z7;
        this.dmViewHolderCacheSize = i5;
    }

    public /* synthetic */ DMSessionLoadConfig(boolean z, int i, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 1 : i, (i6 & 4) != 0 ? 20 : i2, (i6 & 8) != 0 ? true : z2, (i6 & 16) != 0 ? 2 : i3, (i6 & 32) != 0 ? true : z3, (i6 & 64) != 0 ? 100 : i4, (i6 & 128) != 0 ? 500L : j, (i6 & 256) == 0 ? j2 : 500L, (i6 & 512) != 0 ? false : z4, (i6 & 1024) != 0 ? false : z5, (i6 & 2048) != 0 ? true : z6, (i6 & 4096) != 0 ? true : z7, (i6 & FileUtils.BUFFER_SIZE) != 0 ? 20 : i5);
    }
}
