package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_anchor_faq_for_gb")
/* loaded from: classes6.dex */
public final class LiveSubscribeAnchorFaqGBSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveSubscribeAnchorFaqGBSetting INSTANCE = new LiveSubscribeAnchorFaqGBSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeAnchorFaqGBSetting.class);
    }
}
