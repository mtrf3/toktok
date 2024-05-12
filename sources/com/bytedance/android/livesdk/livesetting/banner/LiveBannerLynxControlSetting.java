package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_lynx_control")
/* loaded from: classes6.dex */
public final class LiveBannerLynxControlSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBannerLynxControlSetting INSTANCE = new LiveBannerLynxControlSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerLynxControlSetting.class);
    }
}
