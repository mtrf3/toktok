package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class CancelJoinGroupReq {

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("group_channel_id")
    public long groupChannelId;

    @InterfaceC65349Pkn("myself")
    public GroupPlayer myself;

    @InterfaceC65349Pkn("target")
    public GroupPlayer target;

    @InterfaceC65349Pkn("type")
    public int type;
}
