package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_banner_use_new_arch_anchor")
/* loaded from: classes6.dex */
public final class LiveBannerUseNewArchAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBannerUseNewArchAnchorSetting INSTANCE = new LiveBannerUseNewArchAnchorSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBannerUseNewArchAnchorSetting.class);
    }
}
