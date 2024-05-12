package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_rtc_ab_params")
/* loaded from: classes11.dex */
public final class LinkMicRtcAbParamsSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsSetting INSTANCE = new LinkMicRtcAbParamsSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicRtcAbParamsSetting.class);
    }
}
