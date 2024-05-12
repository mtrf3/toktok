package com.bytedance.android.livesdk.livesetting.level;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

@SettingsKey("live_user_level")
/* loaded from: classes6.dex */
public final class UserLevelSettings {
    public static final UserLevelSettings INSTANCE = new UserLevelSettings();

    @Group(isDefault = true, value = "default group")
    public static final UserLevelConfig DEFAULT = new UserLevelConfig(new ArrayList(), new ArrayList(), new UserLevelDynamicConfig(10, false, 7, 9, 4), new ArrayList(), new ArrayList(), C113554cx.LJJL(new OSZ("user_level_upgrade_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Fupgrade%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&container_bg_color=00000000&height=1280rpx"), new OSZ("user_level_detail_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Fprivilege%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&container_bg_color=00000000&height=1280rpx"), new OSZ("user_level_faq_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Ffaq%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&height=1280rpx")));

    public final UserLevelConfig getUserLevelConfig() {
        UserLevelConfig userLevelConfig = (UserLevelConfig) SettingsManager.INSTANCE.getValueSafely(UserLevelSettings.class);
        if (userLevelConfig == null) {
            return DEFAULT;
        }
        return userLevelConfig;
    }

    public final UserLevelConfig getDEFAULT() {
        return DEFAULT;
    }
}
