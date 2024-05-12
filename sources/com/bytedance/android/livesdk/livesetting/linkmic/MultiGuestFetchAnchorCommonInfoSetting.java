package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("host_administration_panel_banner")
/* loaded from: classes11.dex */
public final class MultiGuestFetchAnchorCommonInfoSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestFetchAnchorCommonInfoSetting INSTANCE = new MultiGuestFetchAnchorCommonInfoSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFetchAnchorCommonInfoSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
