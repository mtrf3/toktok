package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_forbbiden_detail_page")
/* loaded from: classes6.dex */
public final class LiveForbbidenDetailPageSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveForbbidenDetailPageSetting INSTANCE = new LiveForbbidenDetailPageSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveForbbidenDetailPageSetting.class);
    }
}
