package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_rtc_ab_params_multi_guest_guest")
/* loaded from: classes6.dex */
public final class LinkMicRtcAbParamsMultiGuestGuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiGuestGuestSetting INSTANCE = new LinkMicRtcAbParamsMultiGuestGuestSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicRtcAbParamsMultiGuestGuestSetting.class);
    }
}
