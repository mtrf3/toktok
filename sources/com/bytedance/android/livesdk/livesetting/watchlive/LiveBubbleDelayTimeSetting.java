package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58499Mxb;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_bubble_delay_time")
/* loaded from: classes11.dex */
public final class LiveBubbleDelayTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final LiveBubbleDelayTimeSetting INSTANCE = new LiveBubbleDelayTimeSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C58499Mxb.LJLIL);

    private final long getSetting() {
        return ((Number) setting$delegate.getValue()).longValue();
    }

    public final long delayTimeMill() {
        return getSetting();
    }
}
