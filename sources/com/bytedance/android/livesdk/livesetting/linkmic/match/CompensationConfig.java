package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CompensationConfig {

    @InterfaceC65349Pkn("enable")
    public boolean compensateEnable;

    @InterfaceC65349Pkn("time_interval")
    public long compensateTimeSec;

    public CompensationConfig() {
        this(false, 0L, 3, null);
    }

    public CompensationConfig(boolean z, long j) {
        this.compensateEnable = z;
        this.compensateTimeSec = j;
    }

    public /* synthetic */ CompensationConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 5L : j);
    }
}
