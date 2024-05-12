package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_welcome_pack_shortcut_max_click_times")
/* loaded from: classes6.dex */
public final class LiveWelcomePackShortcutMaxClickTimes {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveWelcomePackShortcutMaxClickTimes INSTANCE = new LiveWelcomePackShortcutMaxClickTimes();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveWelcomePackShortcutMaxClickTimes.class);
    }
}
