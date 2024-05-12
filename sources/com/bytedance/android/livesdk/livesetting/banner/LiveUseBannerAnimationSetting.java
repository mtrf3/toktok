package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_use_banner_animation")
/* loaded from: classes6.dex */
public final class LiveUseBannerAnimationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveUseBannerAnimationSetting INSTANCE = new LiveUseBannerAnimationSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseBannerAnimationSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
