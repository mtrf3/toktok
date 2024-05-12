package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_tt_education_schema")
/* loaded from: classes6.dex */
public final class LiveSafetyEducationSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Ftiktok_livesafety%2Fpages%2Fcpp_live_edu_v2%2Findex.html&hide_nav_bar=1&show_loading=1";
    public static final LiveSafetyEducationSchema INSTANCE = new LiveSafetyEducationSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSafetyEducationSchema.class);
    }
}
