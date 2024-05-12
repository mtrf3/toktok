package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_event_list_url")
/* loaded from: classes6.dex */
public final class LiveGuideEventListUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveGuideEventListUrlSetting INSTANCE = new LiveGuideEventListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGuideEventListUrlSetting.class);
    }
}
