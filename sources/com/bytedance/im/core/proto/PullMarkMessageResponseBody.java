package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69564RRw;
import X.C69565RRx;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class PullMarkMessageResponseBody extends Message<PullMarkMessageResponseBody, C69565RRx> {
    public static final ProtoAdapter<PullMarkMessageResponseBody> ADAPTER = new C69564RRw();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PullMarkMessageResponseBody, C69565RRx> newBuilder2() {
        C69565RRx c69565RRx = new C69565RRx();
        c69565RRx.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c69565RRx.LJ = this.has_more;
        c69565RRx.LJFF = this.next_cursor;
        c69565RRx.addUnknownFields(unknownFields());
        return c69565RRx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "PullMarkMessageResponseBody{", '}');
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l) {
        this(list, bool, l, C64537PUn.EMPTY);
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
