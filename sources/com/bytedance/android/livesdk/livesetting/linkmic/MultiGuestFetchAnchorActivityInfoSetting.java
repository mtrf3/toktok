package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fetch_anchor_activity_info")
/* loaded from: classes11.dex */
public final class MultiGuestFetchAnchorActivityInfoSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestFetchAnchorActivityInfoSetting INSTANCE = new MultiGuestFetchAnchorActivityInfoSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFetchAnchorActivityInfoSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
