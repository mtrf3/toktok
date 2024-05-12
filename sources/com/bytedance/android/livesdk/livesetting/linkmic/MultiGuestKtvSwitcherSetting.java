package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_ktv_switcher")
/* loaded from: classes6.dex */
public final class MultiGuestKtvSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestKtvSwitcherSetting INSTANCE = new MultiGuestKtvSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestKtvSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
