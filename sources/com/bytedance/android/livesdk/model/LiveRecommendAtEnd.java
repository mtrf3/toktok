package com.bytedance.android.livesdk.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class LiveRecommendAtEnd {

    @InterfaceC65349Pkn("delay_hide_guide")
    public boolean delayHideGuide;

    @InterfaceC65349Pkn("enable_show_recommend")
    public int enableShowRecommend;

    @InterfaceC65349Pkn("is_limit_player_width")
    public boolean isLimitPlayerWidth;

    @InterfaceC65349Pkn("live_to_recommend_fail_style_is_new")
    public boolean styleIsNew;

    @InterfaceC65349Pkn("recommend_button_show_time")
    public long recommendButtonShowTime = 10;

    @InterfaceC65349Pkn("following_entrances")
    public List<String> followingEntrances = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("live_to_recommend_distance")
    public float recommendDistance = 0.5f;
}
