package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_show_stall_time_interval")
/* loaded from: classes6.dex */
public final class ShowStallTimeInterval {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60000;
    public static final ShowStallTimeInterval INSTANCE = new ShowStallTimeInterval();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ShowStallTimeInterval.class);
    }
}
