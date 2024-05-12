package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_applying_leave_alert")
/* loaded from: classes6.dex */
public final class MultiGuestApplyingLeaveAlertSetting {

    @Group(isDefault = true, value = "leave without confirm")
    public static final int DEFAULT = 0;
    public static final MultiGuestApplyingLeaveAlertSetting INSTANCE = new MultiGuestApplyingLeaveAlertSetting();

    @Group("leave with confirm except slide")
    public static final int LEAVE_CONFIRM = 2;

    @Group("left slide leave with confirm")
    public static final int LEFT_LEAVE_CONFIRM = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestApplyingLeaveAlertSetting.class);
    }

    public final boolean needSecondConfirm() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
