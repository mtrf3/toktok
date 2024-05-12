package com.bytedance.android.livesdk.livesetting.game;

import X.CEY;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class DefaultHighLightCutConfig {
    public static final CEY Companion = new CEY();
    public static final int DEFAULT_CUT_INTERVAL = 300;

    @InterfaceC65349Pkn("min_cut_interval")
    public int minCutInterval = 300;

    public final int getMinCutInterval() {
        return this.minCutInterval;
    }

    public final void setMinCutInterval(int i) {
        this.minCutInterval = i;
    }
}
