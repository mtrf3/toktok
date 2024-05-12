package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("show_live_replay_clip_entrance")
/* loaded from: classes6.dex */
public final class LiveReplayVideoShowClipEntranceSetting {

    @Group(isDefault = true, value = "Default")
    public static final int DEFAULT = 0;
    public static final LiveReplayVideoShowClipEntranceSetting INSTANCE = new LiveReplayVideoShowClipEntranceSetting();

    @Group("v1")
    public static final int SHOW = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveReplayVideoShowClipEntranceSetting.class);
    }

    public static final boolean showClipEntrance() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }
}
