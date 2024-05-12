package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_user_time_fix")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestV3UseTimeFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestV3UseTimeFixSetting INSTANCE = new LinkMicMultiGuestV3UseTimeFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3UseTimeFixSetting.class);
    }
}
