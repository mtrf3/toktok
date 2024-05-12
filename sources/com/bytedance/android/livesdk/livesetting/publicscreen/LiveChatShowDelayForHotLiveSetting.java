package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_chat_show_delay_for_hot_live")
/* loaded from: classes6.dex */
public final class LiveChatShowDelayForHotLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 400;
    public static final LiveChatShowDelayForHotLiveSetting INSTANCE = new LiveChatShowDelayForHotLiveSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveChatShowDelayForHotLiveSetting.class);
    }
}
