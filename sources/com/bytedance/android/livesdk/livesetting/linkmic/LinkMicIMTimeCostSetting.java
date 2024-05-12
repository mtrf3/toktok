package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_enable_message_cost_report")
/* loaded from: classes6.dex */
public final class LinkMicIMTimeCostSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicIMTimeCostSetting INSTANCE = new LinkMicIMTimeCostSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicIMTimeCostSetting.class);
    }
}
