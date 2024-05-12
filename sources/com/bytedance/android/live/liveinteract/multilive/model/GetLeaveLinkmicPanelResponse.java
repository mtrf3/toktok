package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetLeaveLinkmicPanelResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("fan_ticket")
        public long fanTicket;

        @InterfaceC65349Pkn("gifters")
        public long gifters;

        @InterfaceC65349Pkn("link_begin_time")
        public long linkBeginTime;

        @InterfaceC65349Pkn("link_end_time")
        public long linkEndTime;

        @InterfaceC65349Pkn("new_followers")
        public long newFollowers;

        @InterfaceC65349Pkn("suggest_user")
        public List<LeaveLinkmicPanelSuggestUser> suggestUser = new ArrayList();

        @InterfaceC65349Pkn("viewers")
        public long viewers;
    }
}
