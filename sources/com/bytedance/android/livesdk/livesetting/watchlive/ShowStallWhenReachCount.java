package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_show_stall_when_reach_stall_count")
/* loaded from: classes6.dex */
public final class ShowStallWhenReachCount {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final ShowStallWhenReachCount INSTANCE = new ShowStallWhenReachCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ShowStallWhenReachCount.class);
    }
}
