package com.bytedance.android.livesdk.broadcast.voicechat.setting;

import X.C221108m2;
import X.C30486Bxq;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_sdk_voice_chat_voice_effect_switch")
/* loaded from: classes6.dex */
public final class LiveVoiceChatVoiceEffectSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveVoiceChatVoiceEffectSwitchSetting INSTANCE = new LiveVoiceChatVoiceEffectSwitchSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30486Bxq.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean isOpen() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }
}
