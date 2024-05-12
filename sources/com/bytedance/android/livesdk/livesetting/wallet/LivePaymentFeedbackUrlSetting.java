package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_feedback_page")
/* loaded from: classes6.dex */
public final class LivePaymentFeedbackUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?__live_platform__=webcast&container_bg_color=00000000&gravity=bottom&height=100%25&loading_bg_color=00000000&mask_bg_color=00000080&show_mask=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Frecharge%2Fcancel_recharge.js&use_spark=1&width=100%25";
    public static final LivePaymentFeedbackUrlSetting INSTANCE = new LivePaymentFeedbackUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePaymentFeedbackUrlSetting.class);
    }
}
