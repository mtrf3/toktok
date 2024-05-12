package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("first_screen_debounce_click_interval")
/* loaded from: classes6.dex */
public final class FirstScreenDebounceClickIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final FirstScreenDebounceClickIntervalSetting INSTANCE = new FirstScreenDebounceClickIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FirstScreenDebounceClickIntervalSetting.class);
    }
}
