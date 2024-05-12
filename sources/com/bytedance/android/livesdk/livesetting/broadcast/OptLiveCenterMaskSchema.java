package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_mask_schema")
/* loaded from: classes6.dex */
public final class OptLiveCenterMaskSchema {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx%2Ffundamental%2Fpages%2Flive-center%2Fmask%2Ftemplate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=1";
    public static final OptLiveCenterMaskSchema INSTANCE = new OptLiveCenterMaskSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(OptLiveCenterMaskSchema.class);
    }
}
