package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_banner_panel_cache_disable")
/* loaded from: classes6.dex */
public final class LiveBannerPanelCacheDisableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBannerPanelCacheDisableSetting INSTANCE = new LiveBannerPanelCacheDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerPanelCacheDisableSetting.class);
    }
}
