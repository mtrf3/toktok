package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_banner_render_strategy_anchor")
/* loaded from: classes6.dex */
public final class LiveBannerRenderStrategyAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBannerRenderStrategyAnchorSetting INSTANCE = new LiveBannerRenderStrategyAnchorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBannerRenderStrategyAnchorSetting.class);
    }
}
