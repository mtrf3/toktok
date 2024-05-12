package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_allow_show_invited_dialog_outside_enabled")
/* loaded from: classes6.dex */
public final class LinkMicAllowShowInivtedDialogOutsideSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LinkMicAllowShowInivtedDialogOutsideSetting INSTANCE = new LinkMicAllowShowInivtedDialogOutsideSetting();

    public static final boolean isEnable() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicAllowShowInivtedDialogOutsideSetting.class);
    }
}
