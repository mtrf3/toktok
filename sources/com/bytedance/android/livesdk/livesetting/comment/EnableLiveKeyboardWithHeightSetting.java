package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_live_keyboard_with_height")
/* loaded from: classes6.dex */
public final class EnableLiveKeyboardWithHeightSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveKeyboardWithHeightSetting INSTANCE = new EnableLiveKeyboardWithHeightSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLiveKeyboardWithHeightSetting.class);
    }
}
