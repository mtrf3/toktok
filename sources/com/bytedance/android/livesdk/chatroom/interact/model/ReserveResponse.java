package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ReserveResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ReserveExtra extra;

    /* loaded from: classes14.dex */
    public static final class ReserveExtra {

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

        @InterfaceC65349Pkn("reservation_id")
        public long reservationId;
    }
}
