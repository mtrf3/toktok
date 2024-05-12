package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.StateReqCommon;

/* loaded from: classes14.dex */
public final class ChangeStateReq {

    @InterfaceC65349Pkn("audio_muted")
    public int audioMuted;

    @InterfaceC65349Pkn("background_sticker_id")
    public String backgroundStickerId = "";

    @InterfaceC65349Pkn("client_time")
    public long clientTime;

    @InterfaceC65349Pkn("common")
    public StateReqCommon common;

    @InterfaceC65349Pkn("layout_state")
    public LayoutState layoutState;

    @InterfaceC65349Pkn("network_state")
    public int networkState;

    @InterfaceC65349Pkn("online_user_state")
    public int onlineUserState;

    @InterfaceC65349Pkn("state_type")
    public int stateType;

    @InterfaceC65349Pkn("video_muted")
    public int videoMuted;
}
