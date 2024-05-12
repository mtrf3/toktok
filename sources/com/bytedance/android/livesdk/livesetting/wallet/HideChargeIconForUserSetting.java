package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("hide_charge_icon_for_user")
/* loaded from: classes6.dex */
public final class HideChargeIconForUserSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final HideChargeIconForUserSetting INSTANCE = new HideChargeIconForUserSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HideChargeIconForUserSetting.class);
    }
}
