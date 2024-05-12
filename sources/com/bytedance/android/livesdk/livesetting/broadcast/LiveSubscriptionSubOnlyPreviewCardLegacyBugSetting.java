package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("preview_card_legacy_bug_android_switch")
/* loaded from: classes6.dex */
public final class LiveSubscriptionSubOnlyPreviewCardLegacyBugSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = true;
    public static final LiveSubscriptionSubOnlyPreviewCardLegacyBugSetting INSTANCE = new LiveSubscriptionSubOnlyPreviewCardLegacyBugSetting();

    public static final boolean enableBugFixSwitch() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubscriptionSubOnlyPreviewCardLegacyBugSetting.class);
    }
}
