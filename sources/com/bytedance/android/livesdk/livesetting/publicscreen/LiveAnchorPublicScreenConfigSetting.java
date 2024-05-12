package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;

@SettingsKey("live_anchor_public_screen_config")
/* loaded from: classes6.dex */
public final class LiveAnchorPublicScreenConfigSetting {
    public static final LiveAnchorPublicScreenConfigSetting INSTANCE = new LiveAnchorPublicScreenConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LivePublicScreenConfig DEFAULT = new LivePublicScreenConfig();

    public static final LivePublicScreenConfig getValue() {
        LivePublicScreenConfig livePublicScreenConfig = (LivePublicScreenConfig) SettingsManager.INSTANCE.getValueSafely(LiveAnchorPublicScreenConfigSetting.class);
        if (livePublicScreenConfig == null) {
            return DEFAULT;
        }
        return livePublicScreenConfig;
    }
}
