package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_preview_count_down_time")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPreviewCountDownTimeSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 5;
    public static final LinkMicMultiGuestPreviewCountDownTimeSetting INSTANCE = new LinkMicMultiGuestPreviewCountDownTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicMultiGuestPreviewCountDownTimeSetting.class);
    }
}