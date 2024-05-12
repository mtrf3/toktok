package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multiguest_debug2_beauty_setting")
/* loaded from: classes6.dex */
public final class MultiGuestBeautyDebug2Setting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final MultiGuestBeautyDebug2Setting INSTANCE = new MultiGuestBeautyDebug2Setting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestBeautyDebug2Setting.class);
    }
}
