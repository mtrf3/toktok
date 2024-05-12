package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_in_live_take_page_schema")
/* loaded from: classes6.dex */
public final class OptLiveCenterInLiveTakePageSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx%2Ffundamental%2Fpages%2Flive-center%2Fmain%2Ftemplate.js&enter_from=live_take_page&live_center_show_type=70&height=484";
    public static final OptLiveCenterInLiveTakePageSchema INSTANCE = new OptLiveCenterInLiveTakePageSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(OptLiveCenterInLiveTakePageSchema.class);
    }
}
