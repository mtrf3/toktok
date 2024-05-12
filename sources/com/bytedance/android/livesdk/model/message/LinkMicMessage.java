package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class LinkMicMessage extends CR6 {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("anchor_linkmic_id")
    public int anchorLinkMicId;

    @InterfaceC65349Pkn("anchor_linkmic_id_str")
    public String anchorLinkMicIdStr;

    @InterfaceC65349Pkn("app_id")
    public String appId;

    @InterfaceC65349Pkn("app_sign")
    public String appSign;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("confluence_type")
    public int confluenceType;

    @InterfaceC65349Pkn("dimension")
    public int dimension;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("fan_ticket")
    public long fanTicket;

    @InterfaceC65349Pkn("fan_ticket_icon_type")
    public int fanTicketType;

    @InterfaceC65349Pkn("from_room_id")
    public long fromRoomId;

    @InterfaceC65349Pkn("invite_type")
    public int inviteType;

    @InterfaceC65349Pkn("invite_uid")
    public long inviteUid;

    @InterfaceC65349Pkn("layout")
    public int layout;

    @InterfaceC65349Pkn("message_type")
    public int mType;

    @InterfaceC65349Pkn("match_type")
    public int matchType;

    @InterfaceC65349Pkn("prompts")
    public String prompts;

    @InterfaceC65349Pkn("answer")
    public int reply;

    @InterfaceC65349Pkn("rival_anchor_id")
    public long rivalAnchorId;

    @InterfaceC65349Pkn("rival_linkmic_id")
    public int rivalLinkmicId;

    @InterfaceC65349Pkn("rival_linkmic_id_str")
    public String rivalLinkmicIdStr;

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    @InterfaceC65349Pkn("rtc_join_channel")
    public boolean rtcJoinChannel;

    @InterfaceC65349Pkn("show_popup")
    public boolean shouldShowPopup;

    @InterfaceC65349Pkn("start_time_ms")
    public long startTimeMs;

    @InterfaceC65349Pkn("sub_type")
    public long subType;

    @InterfaceC65349Pkn("theme")
    public String theme;

    @InterfaceC65349Pkn("tips")
    public String tips;

    @InterfaceC65349Pkn("to_user_id")
    public long toUserId;

    @InterfaceC65349Pkn("total_linkmic_fan_ticket")
    public long totalFanTicket;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("vendor")
    public int vendor;

    @InterfaceC65349Pkn("win")
    public boolean win;

    public LinkMicMessage() {
        this.type = EnumC31509CYf.LINK_MIC;
    }
}
