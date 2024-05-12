package com.ss.android.ugc.aweme.video.preload.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class BufferPreloadStrategyConfig {

    @InterfaceC65349Pkn("buffer_threshold_list")
    public final BufferThreshold[] bufferThresholdList;

    @InterfaceC65349Pkn("progress_callback_cnt_limit")
    public final int progressCallbackCntLimit;

    @InterfaceC65349Pkn("strategy")
    public final int strategy;

    public BufferPreloadStrategyConfig(int i, BufferThreshold[] bufferThresholdArr, int i2) {
        this.strategy = i;
        this.bufferThresholdList = bufferThresholdArr;
        this.progressCallbackCntLimit = i2;
    }

    public /* synthetic */ BufferPreloadStrategyConfig(int i, BufferThreshold[] bufferThresholdArr, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, bufferThresholdArr, (i3 & 4) != 0 ? 1 : i2);
    }
}
