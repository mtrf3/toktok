package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LivePitayaTaskSettingsParams {

    @InterfaceC65349Pkn("task_execution_period")
    public long period;

    public LivePitayaTaskSettingsParams() {
        this(0L, 1, null);
    }

    public LivePitayaTaskSettingsParams(long j) {
        this.period = j;
    }

    public /* synthetic */ LivePitayaTaskSettingsParams(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 500L : j);
    }
}
