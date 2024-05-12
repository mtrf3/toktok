package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_anchor_faq_for_non_gb")
/* loaded from: classes6.dex */
public final class LiveSubscribeAnchorFaqNonGBSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveSubscribeAnchorFaqNonGBSetting INSTANCE = new LiveSubscribeAnchorFaqNonGBSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeAnchorFaqNonGBSetting.class);
    }
}
