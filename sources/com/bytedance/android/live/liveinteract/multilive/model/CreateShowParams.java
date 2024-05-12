package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.ShowConfig;

/* loaded from: classes14.dex */
public final class CreateShowParams {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("show_config")
    public ShowConfig showConfig;

    @InterfaceC65349Pkn("show_users")
    public List<ListUser> showUsers = new ArrayList();

    /* loaded from: classes14.dex */
    public static final class ListUser {

        @InterfaceC65349Pkn("linkmic_id")
        public String linkmicId = "";

        @InterfaceC65349Pkn("order")
        public int order;

        @InterfaceC65349Pkn("user_id")
        public long userId;
    }
}
