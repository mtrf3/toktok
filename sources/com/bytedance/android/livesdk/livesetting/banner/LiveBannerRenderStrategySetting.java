package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_banner_render_strategy")
/* loaded from: classes6.dex */
public final class LiveBannerRenderStrategySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBannerRenderStrategySetting INSTANCE = new LiveBannerRenderStrategySetting();

    public final int get() {
        return SettingsManager.INSTANCE.getIntValue(LiveBannerRenderStrategySetting.class);
    }
}
