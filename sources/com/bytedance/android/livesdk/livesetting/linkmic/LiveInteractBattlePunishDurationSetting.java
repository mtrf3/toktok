package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_battle_punish_duration")
/* loaded from: classes14.dex */
public final class LiveInteractBattlePunishDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 181;
    public static final LiveInteractBattlePunishDurationSetting INSTANCE = new LiveInteractBattlePunishDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattlePunishDurationSetting.class);
    }
}
