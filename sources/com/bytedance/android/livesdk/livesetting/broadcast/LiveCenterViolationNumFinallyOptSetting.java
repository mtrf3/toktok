package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_violation_num_finally_opt_setting")
/* loaded from: classes6.dex */
public final class LiveCenterViolationNumFinallyOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveCenterViolationNumFinallyOptSetting INSTANCE = new LiveCenterViolationNumFinallyOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCenterViolationNumFinallyOptSetting.class);
    }
}
