package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class LinkInRoomReplyResponse {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("from_room_id")
    public long fromRoomId;

    @InterfaceC65349Pkn("from_uid")
    public long fromUid;

    @InterfaceC65349Pkn("link_mic_id")
    public long linkMicId;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkMicIdStr;

    @InterfaceC65349Pkn("rival_linkmic_id")
    public String rivalLinkMicId;

    @InterfaceC65349Pkn("rival_linkmic_id_str")
    public String rivalLinkMicIdStr;

    @InterfaceC65349Pkn("rtc_app_id")
    public String rtcAppId;

    @InterfaceC65349Pkn("rtc_app_sign")
    public String rtcAppSign;

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    @InterfaceC65349Pkn("to_room_id")
    public long toRoomId;

    @InterfaceC65349Pkn("to_uid")
    public long toUid;

    @InterfaceC65349Pkn("mic_idx_to_user_id_map")
    public HashMap<Long, Long> micIndexToUidMap = new HashMap<>();

    @InterfaceC65349Pkn("anchor_use_multi_live_new_layout")
    public boolean userMultiLiveLayout = false;

    @InterfaceC65349Pkn("anchor_new_layout")
    public int anchorNewLayout = 0;

    @InterfaceC65349Pkn("anchor_new_fix_mic_num")
    public int fixSwitchOn = 0;

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission = 0;

    @InterfaceC65349Pkn("reply_im_msg_id")
    public long replyId = 0;
}
