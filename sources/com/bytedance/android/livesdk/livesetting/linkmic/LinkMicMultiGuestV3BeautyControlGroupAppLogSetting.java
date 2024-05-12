package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_beauty_control_group_applog")
/* loaded from: classes14.dex */
public final class LinkMicMultiGuestV3BeautyControlGroupAppLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestV3BeautyControlGroupAppLogSetting INSTANCE = new LinkMicMultiGuestV3BeautyControlGroupAppLogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.class);
    }
}
