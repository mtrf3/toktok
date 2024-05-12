package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "mt_live_lynx_banner_preview_enable")
/* loaded from: classes6.dex */
public final class LiveLynxBannerPreviewEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLynxBannerPreviewEnableSetting INSTANCE = new LiveLynxBannerPreviewEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLynxBannerPreviewEnableSetting.class);
    }
}