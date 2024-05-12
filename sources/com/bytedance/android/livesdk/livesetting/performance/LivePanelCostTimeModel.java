package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LivePanelCostTimeModel {

    @InterfaceC65349Pkn("live_sdk_panel_open_cost_times_limit_duration")
    public int mLimitDuration;

    @InterfaceC65349Pkn("live_sdk_panel_open_cost_times_switch")
    public boolean mSwitch;

    /* JADX WARN: Multi-variable type inference failed */
    public LivePanelCostTimeModel() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public LivePanelCostTimeModel(boolean z, int i) {
        this.mSwitch = z;
        this.mLimitDuration = i;
    }

    public /* synthetic */ LivePanelCostTimeModel(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 3 : i);
    }
}
