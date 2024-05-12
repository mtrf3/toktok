package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_out_cap_fps_setting")
/* loaded from: classes6.dex */
public final class MultiGuestBeautyDebug3Setting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 15;
    public static final MultiGuestBeautyDebug3Setting INSTANCE = new MultiGuestBeautyDebug3Setting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestBeautyDebug3Setting.class);
    }
}
