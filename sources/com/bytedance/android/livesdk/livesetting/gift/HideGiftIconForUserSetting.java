package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("hide_gift_icon_for_user")
/* loaded from: classes6.dex */
public final class HideGiftIconForUserSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final HideGiftIconForUserSetting INSTANCE = new HideGiftIconForUserSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HideGiftIconForUserSetting.class);
    }
}
