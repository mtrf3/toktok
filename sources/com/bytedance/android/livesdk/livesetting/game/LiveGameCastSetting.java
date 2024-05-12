package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_game_cast_setting")
/* loaded from: classes6.dex */
public final class LiveGameCastSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group_wired")
    public static final int ENABLE_V1 = 1;

    @Group("experiment_group_wireless")
    public static final int ENABLE_V2 = 2;

    @Group("experiment_group_all")
    public static final int ENABLE_V3 = 3;
    public static final LiveGameCastSetting INSTANCE = new LiveGameCastSetting();

    private final boolean allCast() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGameCastSetting.class) == 3) {
            return true;
        }
        return false;
    }

    public final boolean disAble() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGameCastSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean wiredCast() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGameCastSetting.class) == 1 || allCast()) {
            return true;
        }
        return false;
    }

    public final boolean wirelessCast() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGameCastSetting.class) == 2 || allCast()) {
            return true;
        }
        return false;
    }
}
