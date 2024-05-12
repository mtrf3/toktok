package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ignore_message_check_for_bytest")
/* loaded from: classes6.dex */
public final class LiveIgnoreMessageCheckForBytestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveIgnoreMessageCheckForBytestSetting INSTANCE = new LiveIgnoreMessageCheckForBytestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveIgnoreMessageCheckForBytestSetting.class);
    }
}
