package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class CheckBattleInfoConfig {

    @InterfaceC65349Pkn("avg_settling_cost")
    public boolean avg_settling_cost;

    @InterfaceC65349Pkn("avg_settling_message_cost")
    public float avg_settling_message_cost;

    @InterfaceC65349Pkn("retry_count_when_enter")
    public int retry_count_when_enter;

    @InterfaceC65349Pkn("retry_count_when_finish")
    public int retry_count_when_finish;

    @InterfaceC65349Pkn("retry_duration_when_enter")
    public int retry_duration_when_enter;

    @InterfaceC65349Pkn("retry_duration_when_finish")
    public int retry_duration_when_finish;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBattleInfoConfig() {
        this(false, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    public CheckBattleInfoConfig(boolean z, float f, int i, int i2, int i3, int i4) {
        this.avg_settling_cost = z;
        this.avg_settling_message_cost = f;
        this.retry_count_when_enter = i;
        this.retry_count_when_finish = i2;
        this.retry_duration_when_enter = i3;
        this.retry_duration_when_finish = i4;
    }

    public /* synthetic */ CheckBattleInfoConfig(boolean z, float f, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 1.5f : f, (i5 & 4) != 0 ? 1 : i, (i5 & 8) != 0 ? 2 : i2, (i5 & 16) != 0 ? 2 : i3, (i5 & 32) != 0 ? 2 : i4);
    }
}
