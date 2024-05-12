package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_violence_url")
/* loaded from: classes6.dex */
public final class LiveMatureViolenceUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMatureViolenceUrlSetting INSTANCE = new LiveMatureViolenceUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMatureViolenceUrlSetting.class);
    }
}
