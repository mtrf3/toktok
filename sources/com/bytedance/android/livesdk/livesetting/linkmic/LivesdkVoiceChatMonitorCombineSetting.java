package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_voice_chat_monitor_combine")
/* loaded from: classes6.dex */
public final class LivesdkVoiceChatMonitorCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivesdkVoiceChatMonitorCombineSetting INSTANCE = new LivesdkVoiceChatMonitorCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkVoiceChatMonitorCombineSetting.class);
    }
}
