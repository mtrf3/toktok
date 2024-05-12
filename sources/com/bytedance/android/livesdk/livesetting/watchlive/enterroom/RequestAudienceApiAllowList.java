package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("request_audience_api_allowlist")
/* loaded from: classes6.dex */
public final class RequestAudienceApiAllowList {
    public static final RequestAudienceApiAllowList INSTANCE = new RequestAudienceApiAllowList();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"/webcast/room/collect_unread/", "/webcast/room/recommend_live/", "/webcast/room/live_room_id", "/webcast/room/enter/", "/webcast/room/leave/", "/webcast/room/ping/audience/", "/webcast/room/get_channel_event", "/webcast/room/next_event_show", "/webcast/room/official/info", "/webcast/room/survey/list/", "/webcast/room/survey/submit/", "/webcast/room/gated/check_ticket/", "/webcast/room/gated/event_info/", "/webcast/room/hashtag/list/", "/webcast/room/hashtag/set/"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(RequestAudienceApiAllowList.class);
    }
}
