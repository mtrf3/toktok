package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_share_bg_rtl_opt")
/* loaded from: classes6.dex */
public final class MultiGuestShareBgRtlOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestShareBgRtlOptSetting INSTANCE = new MultiGuestShareBgRtlOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestShareBgRtlOptSetting.class);
    }
}
