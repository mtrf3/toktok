package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_agency_center_scheme")
/* loaded from: classes6.dex */
public final class CreatorToolsAgencyCenterUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final CreatorToolsAgencyCenterUrl INSTANCE = new CreatorToolsAgencyCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(CreatorToolsAgencyCenterUrl.class);
    }
}
