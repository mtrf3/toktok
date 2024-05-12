package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.commerce.LiveGoodsBanner;

@SettingsKey("live_commerce_banner")
/* loaded from: classes6.dex */
public final class LiveCommerceBannerSetting {
    public static final LiveCommerceBannerSetting INSTANCE = new LiveCommerceBannerSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveGoodsBanner DEFAULT = new LiveGoodsBanner();

    public final LiveGoodsBanner getValue() {
        LiveGoodsBanner liveGoodsBanner = (LiveGoodsBanner) SettingsManager.INSTANCE.getValueSafely(LiveCommerceBannerSetting.class);
        if (liveGoodsBanner == null) {
            return DEFAULT;
        }
        return liveGoodsBanner;
    }
}
