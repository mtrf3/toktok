package com.bytedance.android.livesdk.livesetting.banner;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_lynx_enable_config")
/* loaded from: classes6.dex */
public final class TiktokLiveBannerLynxEnableConfigSetting {
    public static final TiktokLiveBannerLynxEnableConfigSetting INSTANCE = new TiktokLiveBannerLynxEnableConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Boolean> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, Boolean> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(TiktokLiveBannerLynxEnableConfigSetting.class);
    }

    public final Map<String, Boolean> getDEFAULT() {
        return DEFAULT;
    }
}
