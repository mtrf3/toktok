package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_sdk_multiguest_first_frame_applog")
/* loaded from: classes6.dex */
public final class LiveSdkMultiguestFirstFrameApplogSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiguestFirstFrameApplogSetting INSTANCE = new LiveSdkMultiguestFirstFrameApplogSetting();

    @Group("is log")
    public static final int LOG = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiguestFirstFrameApplogSetting.class);
    }

    public final boolean isLog() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
