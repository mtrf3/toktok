package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_2v2_change_poc_identify_opt")
/* loaded from: classes6.dex */
public final class LiveMatchAudience2v2IdentifyOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchAudience2v2IdentifyOptSetting INSTANCE = new LiveMatchAudience2v2IdentifyOptSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchAudience2v2IdentifyOptSetting.class);
    }
}
