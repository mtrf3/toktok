package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_fast_open_disable")
/* loaded from: classes6.dex */
public final class LiveSdkFastOpenDisableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkFastOpenDisableSetting INSTANCE = new LiveSdkFastOpenDisableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkFastOpenDisableSetting.class);
    }
}
