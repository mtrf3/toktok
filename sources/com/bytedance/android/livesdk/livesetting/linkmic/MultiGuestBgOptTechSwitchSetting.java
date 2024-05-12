package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58568Myi;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_bg_opt_tech_switch")
/* loaded from: classes11.dex */
public final class MultiGuestBgOptTechSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestBgOptTechSwitchSetting INSTANCE = new MultiGuestBgOptTechSwitchSetting();
    public static final C5H3 isEnable$delegate = C221108m2.LIZIZ(C58568Myi.LJLIL);

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestBgOptTechSwitchSetting.class);
    }

    public final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }
}
