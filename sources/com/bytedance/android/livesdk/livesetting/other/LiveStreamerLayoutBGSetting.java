package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_top_left_profile_decoration")
/* loaded from: classes6.dex */
public final class LiveStreamerLayoutBGSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveStreamerLayoutBGSetting INSTANCE = new LiveStreamerLayoutBGSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamerLayoutBGSetting.class);
    }
}
