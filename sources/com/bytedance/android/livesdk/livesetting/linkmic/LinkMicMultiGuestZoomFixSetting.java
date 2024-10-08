package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguest_zoom_fix")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestZoomFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiGuestZoomFixSetting INSTANCE = new LinkMicMultiGuestZoomFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestZoomFixSetting.class);
    }
}
