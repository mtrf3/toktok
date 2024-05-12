package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_extended_public_screen_max_msg_config")
/* loaded from: classes6.dex */
public final class LiveExtendedPublicScreenMaxMessageConfig {
    public static final LiveExtendedPublicScreenMaxMessageConfig INSTANCE = new LiveExtendedPublicScreenMaxMessageConfig();

    @Group(isDefault = true, value = "default group")
    public static final BufferConfig DEFAULT = new BufferConfig();

    /* loaded from: classes6.dex */
    public static final class BufferConfig {

        @InterfaceC65349Pkn("max_message_count")
        public int maxMessageCount = 200;
    }

    public static final BufferConfig getValue() {
        BufferConfig bufferConfig = (BufferConfig) SettingsManager.INSTANCE.getValueSafely(LiveExtendedPublicScreenMaxMessageConfig.class);
        if (bufferConfig == null) {
            return DEFAULT;
        }
        return bufferConfig;
    }
}
