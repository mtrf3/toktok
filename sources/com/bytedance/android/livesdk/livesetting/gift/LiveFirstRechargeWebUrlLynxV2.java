package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_recharge_web_url_lynx_v2")
/* loaded from: classes6.dex */
public final class LiveFirstRechargeWebUrlLynxV2 {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?show_mask=0&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_strategy%2Fpages%2Fcharge%2Ffirst_charge%2Ftemplate.js&height=1148rpx&container_bg_color=ffffff";
    public static final LiveFirstRechargeWebUrlLynxV2 INSTANCE = new LiveFirstRechargeWebUrlLynxV2();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFirstRechargeWebUrlLynxV2.class);
    }
}
