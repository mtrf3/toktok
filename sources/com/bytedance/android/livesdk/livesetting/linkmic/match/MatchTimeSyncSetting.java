package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_server_time_sync_enable")
/* loaded from: classes6.dex */
public final class MatchTimeSyncSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MatchTimeSyncSetting INSTANCE = new MatchTimeSyncSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MatchTimeSyncSetting.class);
    }
}
