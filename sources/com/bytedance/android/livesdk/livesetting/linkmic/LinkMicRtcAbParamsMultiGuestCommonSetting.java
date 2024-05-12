package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_rtc_ab_params_multi_guest_common")
/* loaded from: classes11.dex */
public final class LinkMicRtcAbParamsMultiGuestCommonSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiGuestCommonSetting INSTANCE = new LinkMicRtcAbParamsMultiGuestCommonSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicRtcAbParamsMultiGuestCommonSetting.class);
    }
}
