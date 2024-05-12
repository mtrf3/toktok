package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_upgrade_bgm")
/* loaded from: classes6.dex */
public final class LiveBGMSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveBGMSetting INSTANCE = new LiveBGMSetting();

    public final boolean inLiveBGMUpgrade() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBGMSetting.class) != 1) {
            return true;
        }
        return false;
    }

    public final boolean inLiveBGMUpgradeV1() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBGMSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean inLiveBGMUpgradeV2() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBGMSetting.class) == 4) {
            return true;
        }
        return false;
    }

    public final boolean inLiveBGMUpgradeV3() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBGMSetting.class) == 3) {
            return true;
        }
        return false;
    }
}
