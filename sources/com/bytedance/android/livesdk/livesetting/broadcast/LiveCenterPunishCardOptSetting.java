package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_punish_card_opt_setting")
/* loaded from: classes6.dex */
public final class LiveCenterPunishCardOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCenterPunishCardOptSetting INSTANCE = new LiveCenterPunishCardOptSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCenterPunishCardOptSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
