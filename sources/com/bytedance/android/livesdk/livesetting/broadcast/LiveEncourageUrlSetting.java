package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_encourage_golive_schema")
/* loaded from: classes6.dex */
public final class LiveEncourageUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview?hide_nav_bar=1&hide_status_bar=1&use_spark=1&should_full_screen=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_main%2Fmain%2Fpages%2Fencourage-golive%2Ftemplate.js";
    public static final LiveEncourageUrlSetting INSTANCE = new LiveEncourageUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEncourageUrlSetting.class);
    }
}
