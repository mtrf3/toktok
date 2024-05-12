package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_web_recharge_url")
/* loaded from: classes6.dex */
public final class LiveGuideWebRechargeUrl {
    public static final LiveGuideWebRechargeUrl INSTANCE = new LiveGuideWebRechargeUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview_popup?url=https%3A%2F%2Fwww.tiktok.com%2Fcoin%2Fplace-order%2F9Fm3MSz%3Finapp%3Dtrue%26fullsheet%3Dtrue%26large%3Dtrue%26guided_to_web_type%3Dapp_package_guide&gravity=bottom&web_bg_color=FFFFFF&container_bg_color=FFFFFF&loading_bg_color=FFFFFF&hide_loading=1&radius=8&height=85%25&keyboard_adjust=1&keyboard_compat=1";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGuideWebRechargeUrl.class);
    }

    public final String getGuideWebRechargeUrl() {
        return getValue();
    }
}
