package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_match_egg")
/* loaded from: classes11.dex */
public final class EnableBattleEggSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableBattleEggSetting INSTANCE = new EnableBattleEggSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableBattleEggSetting.class);
    }
}
