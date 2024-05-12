package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.ListReachEnhancementUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public class MultiLiveGuestInfoList {

    @InterfaceC65349Pkn("connecting_users")
    public ArrayList<LinkPlayerInfo> connectingUsers;

    @InterfaceC65349Pkn("fan_ticket_icon_url")
    public String fanTicketIconUrl;

    @InterfaceC65349Pkn("gift_score_applied_users")
    public List<ListByTypeResponse.GiftScoreAppliedUser> giftScoreAppliedUsers;

    @InterfaceC65349Pkn("multi_guest_bonus")
    public ListByTypeResponse.MultiGuestBonus multiGuestBonus;

    @InterfaceC65349Pkn("not_viewer_friends")
    public ArrayList<LinkPlayerInfo> notViewerFriends;

    @InterfaceC65349Pkn("reach_enhancement_users")
    public ArrayList<ListReachEnhancementUser> reachEnhancementUsers;

    @InterfaceC65349Pkn("request_user_gift_score")
    public long requestUserGiftScore;

    @InterfaceC65349Pkn("reserved_users")
    public List<ListByTypeResponse.ReservedUser> reservedUsers;

    @InterfaceC65349Pkn("tag_map")
    public HashMap<String, String> userTagMap;

    @InterfaceC65349Pkn("candidate_and_invited_users")
    public ArrayList<LinkPlayerInfo> viewerUsers;

    @InterfaceC65349Pkn("applied_users")
    public ArrayList<LinkPlayerInfo> waitingUsers;

    @InterfaceC65349Pkn("linked_users")
    public ArrayList<LinkPlayerInfo> onLineUsers = new ArrayList<>();

    @InterfaceC65349Pkn("request_user_status")
    public int requestUserStatus = 0;
}
