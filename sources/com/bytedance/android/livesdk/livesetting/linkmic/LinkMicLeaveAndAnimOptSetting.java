package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_leave_and_anim_opt")
/* loaded from: classes6.dex */
public final class LinkMicLeaveAndAnimOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkMicLeaveAndAnimOptSetting INSTANCE = new LinkMicLeaveAndAnimOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicLeaveAndAnimOptSetting.class);
    }
}
