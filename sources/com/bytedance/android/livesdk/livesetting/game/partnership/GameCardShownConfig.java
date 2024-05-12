package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GameCardShownConfig {

    @InterfaceC65349Pkn("delay_time")
    public long delayTime;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    public GameCardShownConfig() {
        this(false, 0L, 3, null);
    }

    public GameCardShownConfig(boolean z, long j) {
        this.enable = z;
        this.delayTime = j;
    }

    public /* synthetic */ GameCardShownConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
