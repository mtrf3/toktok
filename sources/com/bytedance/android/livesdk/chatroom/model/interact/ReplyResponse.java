package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ReplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public LinkReplyResult data;

    @InterfaceC65349Pkn("extra")
    public ReplyExtra extra;

    /* loaded from: classes14.dex */
    public static final class ReplyExtra extends F9E {

        @InterfaceC65349Pkn("log_pb")
        public LogPb logPb;

        /* loaded from: classes14.dex */
        public static final class LogPb extends F9E {

            @InterfaceC65349Pkn("impr_id")
            public String imprId;

            @Override // X.F9E
            public final Object[] getObjects() {
                String str = this.imprId;
                return new Object[]{str, str};
            }
        }

        @Override // X.F9E
        public final Object[] getObjects() {
            LogPb logPb = this.logPb;
            return new Object[]{logPb, logPb};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        LinkReplyResult linkReplyResult = this.data;
        ReplyExtra replyExtra = this.extra;
        return new Object[]{linkReplyResult, linkReplyResult, replyExtra, replyExtra};
    }
}
