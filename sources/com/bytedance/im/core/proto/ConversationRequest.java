package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRM;
import X.RRN;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConversationRequest extends Message<ConversationRequest, RRN> {
    public static final ProtoAdapter<ConversationRequest> ADAPTER = new RRM();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationRequest, RRN> newBuilder2() {
        RRN rrn = new RRN();
        rrn.LIZLLL = this.conversation_short_id;
        rrn.LJ = this.conversation_type;
        rrn.addUnknownFields(unknownFields());
        return rrn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationRequest{", '}');
    }

    public ConversationRequest(Long l, Integer num) {
        this(l, num, C64537PUn.EMPTY);
    }

    public ConversationRequest(Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
