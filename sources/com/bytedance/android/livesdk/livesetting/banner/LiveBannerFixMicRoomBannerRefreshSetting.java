package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_banner_fix_microom_banner_refresh")
/* loaded from: classes6.dex */
public final class LiveBannerFixMicRoomBannerRefreshSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBannerFixMicRoomBannerRefreshSetting INSTANCE = new LiveBannerFixMicRoomBannerRefreshSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerFixMicRoomBannerRefreshSetting.class);
    }
}
