package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_sdk_mock_message_remove_badge")
/* loaded from: classes6.dex */
public final class LiveSdkMockMessageRemoveBadgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkMockMessageRemoveBadgeSetting INSTANCE = new LiveSdkMockMessageRemoveBadgeSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMockMessageRemoveBadgeSetting.class);
    }
}
