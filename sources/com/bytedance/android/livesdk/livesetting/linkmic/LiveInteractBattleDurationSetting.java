package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_battle_duration")
/* loaded from: classes14.dex */
public final class LiveInteractBattleDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 301;
    public static final LiveInteractBattleDurationSetting INSTANCE = new LiveInteractBattleDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattleDurationSetting.class);
    }
}
