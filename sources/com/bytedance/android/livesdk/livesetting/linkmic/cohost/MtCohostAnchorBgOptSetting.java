package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_anchor_bg_opt")
/* loaded from: classes6.dex */
public final class MtCohostAnchorBgOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCohostAnchorBgOptSetting INSTANCE = new MtCohostAnchorBgOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCohostAnchorBgOptSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
