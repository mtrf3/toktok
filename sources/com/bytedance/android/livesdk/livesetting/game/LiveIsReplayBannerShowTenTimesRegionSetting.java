package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_is_replay_banner_show_ten_times_region")
/* loaded from: classes6.dex */
public final class LiveIsReplayBannerShowTenTimesRegionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveIsReplayBannerShowTenTimesRegionSetting INSTANCE = new LiveIsReplayBannerShowTenTimesRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveIsReplayBannerShowTenTimesRegionSetting.class);
    }
}
