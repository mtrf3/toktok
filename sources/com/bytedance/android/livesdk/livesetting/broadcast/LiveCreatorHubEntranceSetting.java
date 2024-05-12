package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_creator_hub_entrance")
/* loaded from: classes6.dex */
public final class LiveCreatorHubEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCreatorHubEntranceSetting INSTANCE = new LiveCreatorHubEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCreatorHubEntranceSetting.class);
    }
}
