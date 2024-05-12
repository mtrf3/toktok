package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_debug_network_tip")
/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestDebugNetworkTipSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestDebugNetworkTipSetting INSTANCE = new LiveSdkMultiGuestDebugNetworkTipSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestDebugNetworkTipSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
