package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_tt_age_verify_schema")
/* loaded from: classes6.dex */
public final class LiveAgeVerifySchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fage-verification%2Fdob.html&object_type=69&hide_nav_bar=1&show_loading=1";
    public static final LiveAgeVerifySchema INSTANCE = new LiveAgeVerifySchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveAgeVerifySchema.class);
    }
}
