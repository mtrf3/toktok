package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_obs_help_page")
/* loaded from: classes6.dex */
public final class LiveObsHelpPageSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://inapp.tiktokv.com/falcon/webcast_mt/page/obs_intro/index.html";
    public static final LiveObsHelpPageSetting INSTANCE = new LiveObsHelpPageSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveObsHelpPageSetting.class);
    }
}
