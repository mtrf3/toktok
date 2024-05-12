package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_toolbar")
/* loaded from: classes6.dex */
public final class LiveBroadcastToolbarCollapseSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastToolbarCollapseSetting INSTANCE = new LiveBroadcastToolbarCollapseSetting();

    public final boolean collapseInteract() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastToolbarCollapseSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean collapseShare() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastToolbarCollapseSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
