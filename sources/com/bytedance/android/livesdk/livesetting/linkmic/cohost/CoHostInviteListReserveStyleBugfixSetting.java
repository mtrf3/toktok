package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_invite_list_reserve_style_bugfix_setting")
/* loaded from: classes6.dex */
public final class CoHostInviteListReserveStyleBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final CoHostInviteListReserveStyleBugfixSetting INSTANCE = new CoHostInviteListReserveStyleBugfixSetting();

    public static final boolean isEnable() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(CoHostInviteListReserveStyleBugfixSetting.class);
    }
}
