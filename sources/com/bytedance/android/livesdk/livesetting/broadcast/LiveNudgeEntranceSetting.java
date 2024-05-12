package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_nudge_entrance")
/* loaded from: classes6.dex */
public final class LiveNudgeEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNudgeEntranceSetting INSTANCE = new LiveNudgeEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNudgeEntranceSetting.class);
    }
}
