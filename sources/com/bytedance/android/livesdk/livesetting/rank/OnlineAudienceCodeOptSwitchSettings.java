package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_online_audience_code_opt_switch")
/* loaded from: classes6.dex */
public final class OnlineAudienceCodeOptSwitchSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final OnlineAudienceCodeOptSwitchSettings INSTANCE = new OnlineAudienceCodeOptSwitchSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OnlineAudienceCodeOptSwitchSettings.class);
    }
}
