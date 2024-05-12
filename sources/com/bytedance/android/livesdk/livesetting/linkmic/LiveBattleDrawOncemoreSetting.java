package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_draw_oncemore_enable")
/* loaded from: classes11.dex */
public final class LiveBattleDrawOncemoreSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBattleDrawOncemoreSetting INSTANCE = new LiveBattleDrawOncemoreSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBattleDrawOncemoreSetting.class);
    }
}
