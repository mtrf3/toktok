package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_zoom_layout_bugfix_enabled")
/* loaded from: classes11.dex */
public final class MultiGuestZoomLayoutBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestZoomLayoutBugfixSetting INSTANCE = new MultiGuestZoomLayoutBugfixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestZoomLayoutBugfixSetting.class);
    }
}
