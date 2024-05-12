package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multi_guest_watermarks_bugfix_enabled")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestWatermarkBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestWatermarkBugfixSetting INSTANCE = new LinkMicMultiGuestWatermarkBugfixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestWatermarkBugfixSetting.class);
    }
}
