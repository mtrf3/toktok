package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_using_legacy_theme")
/* loaded from: classes6.dex */
public final class LiveUsingLegacyThemeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUsingLegacyThemeSetting INSTANCE = new LiveUsingLegacyThemeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUsingLegacyThemeSetting.class);
    }
}