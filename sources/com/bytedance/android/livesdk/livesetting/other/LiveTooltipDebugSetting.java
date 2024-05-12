package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveTooltipDebugConfig;

@SettingsKey("live_tooltip_debug")
/* loaded from: classes6.dex */
public final class LiveTooltipDebugSetting {
    public static final LiveTooltipDebugSetting INSTANCE = new LiveTooltipDebugSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveTooltipDebugConfig DEFAULT = new LiveTooltipDebugConfig(false, false, 0, 0, false, 31, null);

    public final LiveTooltipDebugConfig getValue() {
        LiveTooltipDebugConfig liveTooltipDebugConfig = (LiveTooltipDebugConfig) SettingsManager.INSTANCE.getValueSafely(LiveTooltipDebugSetting.class);
        if (liveTooltipDebugConfig == null) {
            return DEFAULT;
        }
        return liveTooltipDebugConfig;
    }
}
