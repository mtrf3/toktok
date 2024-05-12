package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "mt_live_lynx_banner_audience_enable")
/* loaded from: classes6.dex */
public final class LiveLynxBannerAudienceEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLynxBannerAudienceEnableSetting INSTANCE = new LiveLynxBannerAudienceEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLynxBannerAudienceEnableSetting.class);
    }
}
