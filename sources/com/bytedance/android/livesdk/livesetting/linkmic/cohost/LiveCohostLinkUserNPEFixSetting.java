package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_link_user_npe_fix_setting")
/* loaded from: classes6.dex */
public final class LiveCohostLinkUserNPEFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCohostLinkUserNPEFixSetting INSTANCE = new LiveCohostLinkUserNPEFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostLinkUserNPEFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
