package com.bytedance.im.core.proto;

import X.C120554oF;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQ4;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetStrangerMessagesRequestBody extends Message<GetStrangerMessagesRequestBody, C120554oF> {
    public static final ProtoAdapter<GetStrangerMessagesRequestBody> ADAPTER = new RQ4();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Boolean DEFAULT_RESET_UNREAD_COUNT = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("reset_unread_count")
    public final Boolean reset_unread_count;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetStrangerMessagesRequestBody, C120554oF> newBuilder2() {
        C120554oF c120554oF = new C120554oF();
        c120554oF.LIZLLL = this.conversation_short_id;
        c120554oF.LJ = this.reset_unread_count;
        c120554oF.addUnknownFields(unknownFields());
        return c120554oF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.reset_unread_count != null) {
            sb.append(", reset_unread_count=");
            sb.append(this.reset_unread_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetStrangerMessagesRequestBody{", '}');
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool) {
        this(l, bool, C64537PUn.EMPTY);
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.reset_unread_count = bool;
    }
}
