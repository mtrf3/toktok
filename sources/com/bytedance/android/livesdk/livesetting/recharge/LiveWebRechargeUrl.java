package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_custom_recharge_card_url")
/* loaded from: classes6.dex */
public final class LiveWebRechargeUrl {
    public static final LiveWebRechargeUrl INSTANCE = new LiveWebRechargeUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Frecharge&show_title_bar=true&type=popup&gravity=bottom&title=TikTok.com&show_title_close=true&show_title_share=true&inapp=true&large=true";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWebRechargeUrl.class);
    }
}
