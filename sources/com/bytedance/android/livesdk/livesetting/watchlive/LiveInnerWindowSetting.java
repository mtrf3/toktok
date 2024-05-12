package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_inner_window")
/* loaded from: classes6.dex */
public final class LiveInnerWindowSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveInnerWindowSetting INSTANCE = new LiveInnerWindowSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveInnerWindowSetting.class);
    }
}
