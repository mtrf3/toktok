package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes17.dex */
public final class StarCommentGetQueueRequest {

    @InterfaceC65349Pkn("client_cur_msg_start_time_ms")
    public long clientCurMsgStartTimeMs;

    @InterfaceC65349Pkn("current_version")
    public int currentVersion;

    @InterfaceC65349Pkn("role")
    public int role;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    @InterfaceC65349Pkn("sec_anchor_id")
    public String secAnchorId = "";

    @InterfaceC65349Pkn("client_reserve")
    public String clientReserve = "";
}
