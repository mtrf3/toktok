package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_draw_oncemore_duration")
/* loaded from: classes6.dex */
public final class LiveBattleDrawOncemoreDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3;
    public static final LiveBattleDrawOncemoreDurationSetting INSTANCE = new LiveBattleDrawOncemoreDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBattleDrawOncemoreDurationSetting.class);
    }
}
