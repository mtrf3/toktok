package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_voice_chat_layout_config_v2")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicVoiceChatLayoutConfigV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "3001";
    public static final LivesdkLinkmicVoiceChatLayoutConfigV2Setting INSTANCE = new LivesdkLinkmicVoiceChatLayoutConfigV2Setting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivesdkLinkmicVoiceChatLayoutConfigV2Setting.class);
    }
}
