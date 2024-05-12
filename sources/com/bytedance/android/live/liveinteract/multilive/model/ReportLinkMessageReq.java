package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReportLinkMessageReq extends F9E {

    @InterfaceC65349Pkn("anchor_client_list")
    public AnchorClientList anchorClientList;

    @InterfaceC65349Pkn("channel_message")
    public ChannelMessage channelMessage;

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("guest_client_list")
    public GuestClientList guestClientList;

    @InterfaceC65349Pkn("myself")
    public Player mySelf;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportLinkMessageReq() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.common, this.mySelf, this.channelMessage, this.anchorClientList, this.guestClientList};
    }

    public ReportLinkMessageReq(LinkCommon linkCommon, Player player, ChannelMessage channelMessage, AnchorClientList anchorClientList, GuestClientList guestClientList) {
        this.common = linkCommon;
        this.mySelf = player;
        this.channelMessage = channelMessage;
        this.anchorClientList = anchorClientList;
        this.guestClientList = guestClientList;
    }

    public /* synthetic */ ReportLinkMessageReq(LinkCommon linkCommon, Player player, ChannelMessage channelMessage, AnchorClientList anchorClientList, GuestClientList guestClientList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkCommon, (i & 2) != 0 ? null : player, (i & 4) != 0 ? null : channelMessage, (i & 8) != 0 ? null : anchorClientList, (i & 16) == 0 ? guestClientList : null);
    }
}
