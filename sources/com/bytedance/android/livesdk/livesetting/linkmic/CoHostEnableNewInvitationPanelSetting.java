package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_new_cohost_invitation_panel")
/* loaded from: classes11.dex */
public final class CoHostEnableNewInvitationPanelSetting {
    public static final CoHostEnableNewInvitationPanelSetting INSTANCE = new CoHostEnableNewInvitationPanelSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return true;
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostEnableNewInvitationPanelSetting.class);
    }
}
