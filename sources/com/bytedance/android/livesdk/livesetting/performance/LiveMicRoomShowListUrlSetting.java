package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mic_room_show_list_url")
/* loaded from: classes6.dex */
public final class LiveMicRoomShowListUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview_popup?type=popup&radius=8&url=https%3A%2F%2Fttlive.tiktok.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Flive_house%2Fshow_list%2Findex.html%3Fenter_from%3Dlive_detail_page_icon";
    public static final LiveMicRoomShowListUrlSetting INSTANCE = new LiveMicRoomShowListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMicRoomShowListUrlSetting.class);
    }
}
