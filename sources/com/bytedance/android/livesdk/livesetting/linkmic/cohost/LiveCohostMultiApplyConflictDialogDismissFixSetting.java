package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_multi_apply_conflict_dialog_dismiss_setting")
/* loaded from: classes6.dex */
public final class LiveCohostMultiApplyConflictDialogDismissFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCohostMultiApplyConflictDialogDismissFixSetting INSTANCE = new LiveCohostMultiApplyConflictDialogDismissFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostMultiApplyConflictDialogDismissFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
