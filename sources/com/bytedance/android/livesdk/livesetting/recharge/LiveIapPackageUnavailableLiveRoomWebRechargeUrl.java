package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("iap_package_unavail_live_room_web_recharge_url")
/* loaded from: classes6.dex */
public final class LiveIapPackageUnavailableLiveRoomWebRechargeUrl {
    public static final LiveIapPackageUnavailableLiveRoomWebRechargeUrl INSTANCE = new LiveIapPackageUnavailableLiveRoomWebRechargeUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Fcoin%2Fdb7RmBs%3Finapp%3Dtrue%26large%3Dtrue&type=popup&gravity=bottom&web_bg_color=FFFFFF&container_bg_color=FFFFFF&loading_bg_color=FFFFFF&hide_loading=1&radius=8&hide_nav_bar=1";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveIapPackageUnavailableLiveRoomWebRechargeUrl.class);
    }
}
