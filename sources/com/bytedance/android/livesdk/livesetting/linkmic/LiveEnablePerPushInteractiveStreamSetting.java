package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_per_push_interactive_stream")
/* loaded from: classes6.dex */
public final class LiveEnablePerPushInteractiveStreamSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnablePerPushInteractiveStreamSetting INSTANCE = new LiveEnablePerPushInteractiveStreamSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnablePerPushInteractiveStreamSetting.class);
    }
}
