package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "voice_chat_reconnect_settings")
/* loaded from: classes11.dex */
public final class VoiceChatReconnectSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final VoiceChatReconnectSettings INSTANCE = new VoiceChatReconnectSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(VoiceChatReconnectSettings.class);
    }
}
