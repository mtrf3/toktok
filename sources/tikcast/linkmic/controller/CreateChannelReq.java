package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* loaded from: classes14.dex */
public final class CreateChannelReq {

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("config")
    public InitConfig config;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId = "";

    @InterfaceC65349Pkn("live_room_mode")
    public long liveRoomMode;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizCreateChannelParams multiGuestReqExtra;

    @InterfaceC65349Pkn("myself")
    public Player myself;
}
