package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_landscape_chat_display_memory")
/* loaded from: classes6.dex */
public final class LandscapeWatchLiveResetMessagePanelState {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LandscapeWatchLiveResetMessagePanelState INSTANCE = new LandscapeWatchLiveResetMessagePanelState();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LandscapeWatchLiveResetMessagePanelState.class);
    }

    public final boolean isBlockMessageIconChangedToV2InLandscapeMode() {
        if (getValue() > 1) {
            return true;
        }
        return false;
    }

    public final boolean isResetMessagePanelInLandscapeMode() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
