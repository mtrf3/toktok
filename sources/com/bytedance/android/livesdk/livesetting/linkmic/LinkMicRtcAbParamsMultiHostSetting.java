package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_rtc_ab_params_multi_host")
/* loaded from: classes6.dex */
public final class LinkMicRtcAbParamsMultiHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiHostSetting INSTANCE = new LinkMicRtcAbParamsMultiHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicRtcAbParamsMultiHostSetting.class);
    }
}
