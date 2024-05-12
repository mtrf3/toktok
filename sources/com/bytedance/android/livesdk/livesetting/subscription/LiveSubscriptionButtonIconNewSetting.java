package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscript_button_icon_new")
/* loaded from: classes6.dex */
public final class LiveSubscriptionButtonIconNewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSubscriptionButtonIconNewSetting INSTANCE = new LiveSubscriptionButtonIconNewSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubscriptionButtonIconNewSetting.class);
    }
}
