package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("first_screen_opt_switcher")
/* loaded from: classes6.dex */
public final class FirstScreenOptSwitcher {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final FirstScreenOptSwitcher INSTANCE = new FirstScreenOptSwitcher();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FirstScreenOptSwitcher.class);
    }
}
