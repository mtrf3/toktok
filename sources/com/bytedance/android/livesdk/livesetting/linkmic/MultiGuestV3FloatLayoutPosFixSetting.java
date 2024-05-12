package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multiguest_guest_float_layout_pos_bug")
/* loaded from: classes6.dex */
public final class MultiGuestV3FloatLayoutPosFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3FloatLayoutPosFixSetting INSTANCE = new MultiGuestV3FloatLayoutPosFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3FloatLayoutPosFixSetting.class);
    }
}
