package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_custom_recharge_dialog_url")
/* loaded from: classes6.dex */
public final class LiveWebRechargeDialog {
    public static final LiveWebRechargeDialog INSTANCE = new LiveWebRechargeDialog();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fguide%2Flarge_sum_entrance.js&height=390&width_percent=80&hide_nav_bar=1&mask_alpha=0.8&show_dim=1&radius=8&web_bg_color=FFFFFF";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWebRechargeDialog.class);
    }
}
