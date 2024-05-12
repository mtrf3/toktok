package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0R;
import X.P0S;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetCmdMessageRespBody extends Message<GetCmdMessageRespBody, P0S> {
    public static final ProtoAdapter<GetCmdMessageRespBody> ADAPTER = new P0R();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;
    public static final Long DEFAULT_NEXT_USER_MESSAGE_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("next_cmd_index")
    public final Long next_cmd_index;

    @InterfaceC65349Pkn("next_user_message_cursor")
    public final Long next_user_message_cursor;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetCmdMessageRespBody, P0S> newBuilder2() {
        P0S p0s = new P0S();
        p0s.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        p0s.LJ = this.has_more;
        p0s.LJFF = this.next_cmd_index;
        p0s.LJI = this.next_user_message_cursor;
        p0s.addUnknownFields(unknownFields());
        return p0s;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        if (this.next_cmd_index != null) {
            sb.append(", next_cmd_index=");
            sb.append(this.next_cmd_index);
        }
        if (this.next_user_message_cursor != null) {
            sb.append(", next_user_message_cursor=");
            sb.append(this.next_user_message_cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetCmdMessageRespBody{", '}');
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l, Long l2) {
        this(list, bool, l, l2, C64537PUn.EMPTY);
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.has_more = bool;
        this.next_cmd_index = l;
        this.next_user_message_cursor = l2;
    }
}
