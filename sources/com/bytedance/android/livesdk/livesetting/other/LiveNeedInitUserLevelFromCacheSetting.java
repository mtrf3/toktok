package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_need_init_user_level_from_cache")
/* loaded from: classes6.dex */
public final class LiveNeedInitUserLevelFromCacheSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveNeedInitUserLevelFromCacheSetting INSTANCE = new LiveNeedInitUserLevelFromCacheSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNeedInitUserLevelFromCacheSetting.class);
    }
}
