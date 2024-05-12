package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ReplyReserveResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ReplyReserveExtra extra;

    /* loaded from: classes14.dex */
    public static final class ReplyReserveExtra {

        @InterfaceC65349Pkn("log_pb")
        public LogPb logPb;

        /* loaded from: classes14.dex */
        public static final class LogPb {

            @InterfaceC65349Pkn("impr_id")
            public String imprId = "";
        }
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData {
    }
}
