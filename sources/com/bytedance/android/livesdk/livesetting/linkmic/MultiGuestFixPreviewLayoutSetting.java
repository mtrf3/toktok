package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fix_preview_layout")
/* loaded from: classes11.dex */
public final class MultiGuestFixPreviewLayoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixPreviewLayoutSetting INSTANCE = new MultiGuestFixPreviewLayoutSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFixPreviewLayoutSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
