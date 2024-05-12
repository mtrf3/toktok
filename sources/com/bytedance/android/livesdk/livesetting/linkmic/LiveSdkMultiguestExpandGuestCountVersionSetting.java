package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_expand_guest_count_version")
/* loaded from: classes6.dex */
public final class LiveSdkMultiguestExpandGuestCountVersionSetting {

    @Group(isDefault = true, value = "1VN with low linkmic area")
    public static final int DEFAULT = 2;
    public static final LiveSdkMultiguestExpandGuestCountVersionSetting INSTANCE = new LiveSdkMultiguestExpandGuestCountVersionSetting();

    @Group("1VN with high linkmic area")
    public static final int ONE_V_N_EXP_HIGHT_HEIGHT = 1;

    @Group("1VN with 9 mic count")
    public static final int ONE_V_N_NINE_MIC_COUNT = 4;

    @Group("old MultiLive(not 1VN now is offline")
    public static final int ONE_V_N_OFF = 0;

    @Group("1V3 with high linkmic area")
    public static final int ONE_V_T_EXP_LOW_HEIGHT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiguestExpandGuestCountVersionSetting.class);
    }
}
