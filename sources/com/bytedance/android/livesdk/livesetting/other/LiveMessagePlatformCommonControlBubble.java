package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_platform_common_control_bubble")
/* loaded from: classes6.dex */
public final class LiveMessagePlatformCommonControlBubble {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMessagePlatformCommonControlBubble INSTANCE = new LiveMessagePlatformCommonControlBubble();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessagePlatformCommonControlBubble.class);
    }
}
