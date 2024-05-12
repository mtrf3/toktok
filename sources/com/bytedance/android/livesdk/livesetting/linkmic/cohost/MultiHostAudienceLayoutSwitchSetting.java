package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multi_host_audience_layout_switch_enable")
/* loaded from: classes6.dex */
public final class MultiHostAudienceLayoutSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiHostAudienceLayoutSwitchSetting INSTANCE = new MultiHostAudienceLayoutSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostAudienceLayoutSwitchSetting.class);
    }
}
