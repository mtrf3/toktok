package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_creator_hub_url")
/* loaded from: classes6.dex */
public final class LiveCreatorHubUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveCreatorHubUrlSetting INSTANCE = new LiveCreatorHubUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCreatorHubUrlSetting.class);
    }
}
