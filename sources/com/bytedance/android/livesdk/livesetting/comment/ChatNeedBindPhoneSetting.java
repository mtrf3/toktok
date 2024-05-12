package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("chat_need_bind_phone")
/* loaded from: classes6.dex */
public final class ChatNeedBindPhoneSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final ChatNeedBindPhoneSetting INSTANCE = new ChatNeedBindPhoneSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ChatNeedBindPhoneSetting.class);
    }
}
