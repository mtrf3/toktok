package com.bytedance.android.livesdk.livesetting.message;

import X.C00F;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessageDispatchConfig {

    @InterfaceC65349Pkn("by_pass_dispatch_allow_method_list")
    public List<String> byPassDispatchAllowList;

    @InterfaceC65349Pkn("direct_dispatch_allow_method_list")
    public List<String> directDispatchAllowList;

    @InterfaceC65349Pkn("direct_dispatch_p2p_block_method_list")
    public List<String> directDispatchP2pBlockList;

    @InterfaceC65349Pkn("direct_dispatch_p2p_msg")
    public boolean directDispatchP2pMsg;

    @InterfaceC65349Pkn("dispatch_dynamic_duration")
    public int dispatchDynamicDuration;

    @InterfaceC65349Pkn("dispatch_limit_duration")
    public int dispatchLimitDuration;

    @InterfaceC65349Pkn("dispatch_message_timeout")
    public long dispatchMessageTimeout;

    @InterfaceC65349Pkn("dispatch_strategy")
    public int dispatchStrategy;

    @InterfaceC65349Pkn("enable_async_dispatch")
    public boolean enableAsyncDispatch;

    @InterfaceC65349Pkn("enable_dispatch_list_optimize")
    public boolean enableDispatchListOptimize;

    @InterfaceC65349Pkn("enable_inactive_opt")
    public boolean enableInactiveOpt;

    @InterfaceC65349Pkn("fixfreq_strategy_dispatch_interval")
    public long fixfreqDispatchInterval;

    @InterfaceC65349Pkn("fixfreq_strategy_dispatch_size")
    public int fixfreqDispatchSize;

    @InterfaceC65349Pkn("fixfreq_strategy_max_queue_size")
    public int fixfreqMaxQueueSize;

    @InterfaceC65349Pkn("optwindow_strategy_min_dispatch_size")
    public int optwindowMinDispatchSize;

    @InterfaceC65349Pkn("optwindow_strategy_window_time")
    public long optwindowWindowTime;

    @InterfaceC65349Pkn("smooth_dispatch_optimize")
    public boolean smoothDispatchOptimize;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessageDispatchConfig() {
        /*
            r23 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r21 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r23
            r2 = r1
            r4 = r3
            r5 = r3
            r8 = r1
            r9 = r6
            r11 = r1
            r12 = r6
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r22 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchConfig.<init>():void");
    }

    public LiveMessageDispatchConfig(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3, long j, int i, long j2, int i2, long j3, int i3, int i4, int i5, int i6, boolean z3, boolean z4, boolean z5) {
        C00F.LJ(list, "directDispatchAllowList", list2, "byPassDispatchAllowList", list3, "directDispatchP2pBlockList");
        this.directDispatchP2pMsg = z;
        this.smoothDispatchOptimize = z2;
        this.directDispatchAllowList = list;
        this.byPassDispatchAllowList = list2;
        this.directDispatchP2pBlockList = list3;
        this.dispatchMessageTimeout = j;
        this.dispatchStrategy = i;
        this.optwindowWindowTime = j2;
        this.optwindowMinDispatchSize = i2;
        this.fixfreqDispatchInterval = j3;
        this.fixfreqDispatchSize = i3;
        this.fixfreqMaxQueueSize = i4;
        this.dispatchLimitDuration = i5;
        this.dispatchDynamicDuration = i6;
        this.enableDispatchListOptimize = z3;
        this.enableAsyncDispatch = z4;
        this.enableInactiveOpt = z5;
    }

    public /* synthetic */ LiveMessageDispatchConfig(boolean z, boolean z2, List list, List list2, List list3, long j, int i, long j2, int i2, long j3, int i3, int i4, int i5, int i6, boolean z3, boolean z4, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? false : z2, (i7 & 4) != 0 ? new ArrayList() : list, (i7 & 8) != 0 ? new ArrayList() : list2, (i7 & 16) != 0 ? new ArrayList() : list3, (i7 & 32) != 0 ? 10L : j, (i7 & 64) != 0 ? 0 : i, (i7 & 128) != 0 ? 50L : j2, (i7 & 256) != 0 ? 3 : i2, (i7 & 512) == 0 ? j3 : 50L, (i7 & 1024) != 0 ? 8 : i3, (i7 & 2048) != 0 ? -1 : i4, (i7 & 4096) == 0 ? i5 : -1, (i7 & FileUtils.BUFFER_SIZE) == 0 ? i6 : 8, (i7 & 16384) != 0 ? false : z3, (32768 & i7) != 0 ? false : z4, (i7 & 65536) != 0 ? false : z5);
    }
}
