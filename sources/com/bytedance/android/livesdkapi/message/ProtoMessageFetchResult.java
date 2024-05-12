package com.bytedance.android.livesdkapi.message;

import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class ProtoMessageFetchResult {

    @InterfaceC65349Pkn("cursor")
    public String cursor;

    @InterfaceC65349Pkn("fetch_interval")
    public long fetchInterval;

    @InterfaceC65349Pkn("fetch_type")
    public int fetchType;

    @InterfaceC65349Pkn("heartbeat_duration")
    public long heartbeatDuration;

    @InterfaceC65349Pkn("history_comment_cursor")
    public String historyCommentCursor = "";

    @InterfaceC65349Pkn("history_no_more")
    public boolean historyNoMore;

    @InterfaceC65349Pkn("internal_ext")
    public String internalExt;

    @InterfaceC65349Pkn("is_first")
    public boolean isFirst;

    @InterfaceC65349Pkn("messages")
    public List<BaseProtoMessage> messages;

    @InterfaceC65349Pkn("need_ack")
    public boolean needAck;

    @InterfaceC65349Pkn("now")
    public long now;

    @InterfaceC65349Pkn("push_server")
    public String pushServer;

    @InterfaceC65349Pkn("route_params")
    public Map<String, String> routeParams;

    /* loaded from: classes6.dex */
    public static final class BaseProtoMessage {

        @InterfaceC65349Pkn("is_history")
        public boolean isHistory;

        @InterfaceC65349Pkn("method")
        public String method;

        @InterfaceC65349Pkn("msg_id")
        public long msgId;

        @InterfaceC65349Pkn("msg_type")
        public int msgType;

        @InterfaceC65349Pkn("offset")
        public long offset;

        @InterfaceC65349Pkn("payload")
        public byte[] payload;
    }
}
