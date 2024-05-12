package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_layout_query_opt")
/* loaded from: classes11.dex */
public final class MultiGuestV3LayoutQueryOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3LayoutQueryOptSetting INSTANCE = new MultiGuestV3LayoutQueryOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3LayoutQueryOptSetting.class);
    }
}
