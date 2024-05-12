package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_sub_only_long_duration_preview_dolphin_setting")
/* loaded from: classes6.dex */
public final class LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = false;
    public static final LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting INSTANCE = new LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting();

    public static final boolean getEnableLongPreview() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.class);
    }
}
