package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_sei_format_err_end_layout")
/* loaded from: classes6.dex */
public final class MultiGuestSeiFormatErrEndLayoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestSeiFormatErrEndLayoutSetting INSTANCE = new MultiGuestSeiFormatErrEndLayoutSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestSeiFormatErrEndLayoutSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
