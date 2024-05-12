package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_audience_timeout_leave")
/* loaded from: classes6.dex */
public final class MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 180;
    public static final MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime INSTANCE = new MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime.class);
    }

    public final int getMiniutes() {
        return getValue() / 60;
    }
}
