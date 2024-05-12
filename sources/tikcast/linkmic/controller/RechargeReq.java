package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* loaded from: classes14.dex */
public final class RechargeReq {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("myself")
    public Player myself;

    @InterfaceC65349Pkn("target")
    public Player target;

    @InterfaceC65349Pkn("type")
    public int type;
}