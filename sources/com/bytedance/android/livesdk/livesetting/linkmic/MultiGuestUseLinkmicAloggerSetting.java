package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_use_linkmic_alogger_opt")
/* loaded from: classes6.dex */
public final class MultiGuestUseLinkmicAloggerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestUseLinkmicAloggerSetting INSTANCE = new MultiGuestUseLinkmicAloggerSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestUseLinkmicAloggerSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
