package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class RivalsListsData {

    @InterfaceC65349Pkn("auto_match_banner")
    public AutoMatchBanner autoMatchBanner;

    @InterfaceC65349Pkn("auto_match_info")
    public BannerText bannerText;

    @InterfaceC65349Pkn("best_teammate_list")
    public List<Room> bestTeammateList;

    @InterfaceC65349Pkn("followed_list")
    public List<Room> followedList;

    @InterfaceC65349Pkn("guide_popup_banner")
    public GuidePopupBanner guidePopupBanner;

    @InterfaceC65349Pkn("may_know_list")
    public List<Room> mayKnowList;

    @InterfaceC65349Pkn("mixed_list")
    public List<Room> mixedList;

    @InterfaceC65349Pkn("recent_list")
    public List<Room> recentList;

    @InterfaceC65349Pkn("recommend_list")
    public List<Room> recommendList;

    @InterfaceC65349Pkn("reserved_list")
    public List<Room> reservedList;

    @InterfaceC65349Pkn("rival_extra_infos")
    public Map<Long, RivalExtraInfo> rivalExtraInfos;

    @InterfaceC65349Pkn("room_top_host_info")
    public Map<Long, TopHostInfo> roomTopHostInfo;

    @InterfaceC65349Pkn("search_bar")
    public SearchBar searchBar;

    @InterfaceC65349Pkn("tips")
    public String tips;

    @InterfaceC65349Pkn("topic_banner")
    public CohostTopic topicBanner;

    @InterfaceC65349Pkn("topic_extra_info")
    public TopicExtraInfo topicExtraInfo;

    /* loaded from: classes14.dex */
    public static class BannerText {

        @InterfaceC65349Pkn("banner_style")
        public int bannerStyle;

        @InterfaceC65349Pkn("button")
        public String buttonText;

        @InterfaceC65349Pkn("in_ui_exp")
        public boolean isInUiExp;

        @InterfaceC65349Pkn("match_valid")
        public boolean isMatchValid;

        @InterfaceC65349Pkn("subtitle")
        public String subTitle;

        @InterfaceC65349Pkn("title")
        public String title;
    }

    /* loaded from: classes14.dex */
    public static class TopHostInfo {
        public static final TopHostInfo LIZ = new TopHostInfo();

        @InterfaceC65349Pkn("rank_type")
        public String rankType = "";

        @InterfaceC65349Pkn("top_index")
        public long topIndex;
    }

    public static boolean LIZ(BannerText bannerText) {
        if (bannerText == null || TextUtils.isEmpty(bannerText.title) || TextUtils.isEmpty(bannerText.subTitle) || TextUtils.isEmpty(bannerText.buttonText)) {
            return false;
        }
        return true;
    }
}
