package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BroadcastSmoothGoLiveConfig {

    @InterfaceC65349Pkn("enable_dirty_len")
    public boolean enableDirtyLenDetect;

    @InterfaceC65349Pkn("stream_info_time_out_threshold")
    public long streamInfoTimeOutThreshold;

    public BroadcastSmoothGoLiveConfig() {
        this(false, 0L, 3, null);
    }

    public BroadcastSmoothGoLiveConfig(boolean z, long j) {
        this.enableDirtyLenDetect = z;
        this.streamInfoTimeOutThreshold = j;
    }

    public /* synthetic */ BroadcastSmoothGoLiveConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1000L : j);
    }
}
