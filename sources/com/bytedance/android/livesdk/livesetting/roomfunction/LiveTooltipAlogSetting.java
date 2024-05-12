package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_tooltip_alog_setting")
/* loaded from: classes6.dex */
public final class LiveTooltipAlogSetting {
    public static final LiveTooltipAlogSetting INSTANCE = new LiveTooltipAlogSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveTooltip DEFAULT = new LiveTooltip();

    public final LiveTooltip getValue() {
        return (LiveTooltip) SettingsManager.INSTANCE.getValueSafely(LiveTooltipAlogSetting.class);
    }

    public final int getToolbarBehaviorDelay() {
        LiveTooltip value = getValue();
        if (value != null) {
            return value.shareToolbarBehaviorDelay;
        }
        return 0;
    }
}
