package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_expand_guest_count_version_v2")
/* loaded from: classes11.dex */
public final class LiveSdkMultiguestExpandGuestCountVersionV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiguestExpandGuestCountVersionV2Setting INSTANCE = new LiveSdkMultiguestExpandGuestCountVersionV2Setting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiguestExpandGuestCountVersionV2Setting.class);
    }
}
