package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_background_fix")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestV3BackgroundFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestV3BackgroundFixSetting INSTANCE = new LinkMicMultiGuestV3BackgroundFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3BackgroundFixSetting.class);
    }
}
