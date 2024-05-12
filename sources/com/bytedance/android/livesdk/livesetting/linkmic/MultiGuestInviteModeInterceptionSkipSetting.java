package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58498Mxa;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_invite_mode_interception_skip")
/* loaded from: classes11.dex */
public final class MultiGuestInviteModeInterceptionSkipSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestInviteModeInterceptionSkipSetting INSTANCE = new MultiGuestInviteModeInterceptionSkipSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58498Mxa.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestInviteModeInterceptionSkipSetting.class);
    }

    public final boolean isOpt() {
        if (getSettingValue() == 1) {
            return true;
        }
        return false;
    }
}
