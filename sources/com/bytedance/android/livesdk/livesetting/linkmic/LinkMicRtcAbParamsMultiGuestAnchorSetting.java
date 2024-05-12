package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_rtc_ab_params_multi_guest_anchor")
/* loaded from: classes6.dex */
public final class LinkMicRtcAbParamsMultiGuestAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicRtcAbParamsMultiGuestAnchorSetting INSTANCE = new LinkMicRtcAbParamsMultiGuestAnchorSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicRtcAbParamsMultiGuestAnchorSetting.class);
    }
}
