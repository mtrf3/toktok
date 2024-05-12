package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_broadcast_interaction_improvememnt")
/* loaded from: classes6.dex */
public final class BroadcastInteractionLibraSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group1")
    public static final int GROUP_ONE = 1;

    @Group("experiment_group2")
    public static final int GROUP_TWO = 2;
    public static final BroadcastInteractionLibraSetting INSTANCE = new BroadcastInteractionLibraSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(BroadcastInteractionLibraSetting.class);
    }
}
