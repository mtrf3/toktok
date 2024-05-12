package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import tikcast.linkmic.common.PositionConfig;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* loaded from: classes14.dex */
public final class ChangeLayoutReq {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId = "";

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizChangeLayoutParams multiGuestReqExtra;

    @InterfaceC65349Pkn("myself")
    public Player myself;

    @InterfaceC65349Pkn("pos_config")
    public PositionConfig posConfig;

    @InterfaceC65349Pkn("scene_version")
    public int sceneVersion;
}
