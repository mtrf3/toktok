package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_gift_tips_url")
/* loaded from: classes6.dex */
public final class LiveGiftFirstGiftTipsURlSettings {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview_popup?gravity=bottom&show_mask=1&url=https%3A%2F%2Fsf16-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Ftiktok_live_revenue_new_gifter_faq.html&web_bg_color=FFFFFF&height=60%25&mask_bg_color=000000b3";
    public static final LiveGiftFirstGiftTipsURlSettings INSTANCE = new LiveGiftFirstGiftTipsURlSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGiftFirstGiftTipsURlSettings.class);
    }
}
