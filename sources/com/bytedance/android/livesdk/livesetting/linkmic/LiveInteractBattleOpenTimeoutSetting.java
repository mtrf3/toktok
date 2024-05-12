package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_battle_open_timeout")
/* loaded from: classes6.dex */
public final class LiveInteractBattleOpenTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 30;
    public static final LiveInteractBattleOpenTimeoutSetting INSTANCE = new LiveInteractBattleOpenTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattleOpenTimeoutSetting.class);
    }
}
