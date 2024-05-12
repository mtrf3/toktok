package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LiveAnchorContactConfig;

@SettingsKey("live_anchor_contact_share")
/* loaded from: classes6.dex */
public final class LiveAnchorContactShareSetting {
    public static final LiveAnchorContactShareSetting INSTANCE = new LiveAnchorContactShareSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveAnchorContactConfig DEFAULT = LiveAnchorContactConfig.LIZ();

    public final LiveAnchorContactConfig getValue() {
        LiveAnchorContactConfig liveAnchorContactConfig = (LiveAnchorContactConfig) SettingsManager.INSTANCE.getValueSafely(LiveAnchorContactShareSetting.class);
        if (liveAnchorContactConfig == null) {
            return DEFAULT;
        }
        return liveAnchorContactConfig;
    }
}
