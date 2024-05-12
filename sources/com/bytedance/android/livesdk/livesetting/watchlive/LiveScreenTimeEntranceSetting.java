package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_screen_time_entrance_setting")
/* loaded from: classes6.dex */
public final class LiveScreenTimeEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveScreenTimeEntranceSetting INSTANCE = new LiveScreenTimeEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveScreenTimeEntranceSetting.class);
    }
}