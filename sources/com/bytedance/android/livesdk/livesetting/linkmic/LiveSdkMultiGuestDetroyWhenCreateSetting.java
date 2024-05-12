package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_detroy_when_create")
/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestDetroyWhenCreateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestDetroyWhenCreateSetting INSTANCE = new LiveSdkMultiGuestDetroyWhenCreateSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestDetroyWhenCreateSetting.class);
    }

    public final boolean enable() {
        return getValue();
    }
}
