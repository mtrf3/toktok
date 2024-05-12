package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_use_effect_check_cache")
/* loaded from: classes6.dex */
public final class LiveEnableUseEffectCheckCacheSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableUseEffectCheckCacheSetting INSTANCE = new LiveEnableUseEffectCheckCacheSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableUseEffectCheckCacheSetting.class);
    }
}
