package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* loaded from: classes14.dex */
public class LinkInviteResult {

    @InterfaceC65349Pkn("action_id")
    public Long actionId;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("channel_id_str")
    public String channelIdStr;

    @InterfaceC65349Pkn("extra")
    public InviteExtra extra;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkMicIdStr;

    @InterfaceC65349Pkn("perception_message")
    public PerceptionMessage perceptionMessage;

    @InterfaceC65349Pkn("perception_status")
    public int perceptionStatus;

    @InterfaceC65349Pkn("rivals_linkmic_id_str")
    public String rivalsLinkMicIdStr;

    @InterfaceC65349Pkn("rtc_ext_info")
    public String rtcExtInfo;

    @InterfaceC65349Pkn("rtc_join_channel")
    public boolean rtcJoinChannel;

    @InterfaceC65349Pkn("rtc_push_stream")
    public boolean rtcPushStream;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Long scene;

    @InterfaceC65349Pkn("vendor")
    public int vendor;
}
