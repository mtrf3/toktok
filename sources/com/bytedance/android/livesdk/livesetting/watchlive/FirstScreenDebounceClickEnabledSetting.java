package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("first_screen_debounce_click_enabled")
/* loaded from: classes6.dex */
public final class FirstScreenDebounceClickEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FirstScreenDebounceClickEnabledSetting INSTANCE = new FirstScreenDebounceClickEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FirstScreenDebounceClickEnabledSetting.class);
    }
}
