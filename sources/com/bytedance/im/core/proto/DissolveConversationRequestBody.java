package com.bytedance.im.core.proto;

import X.C120534oD;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQK;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class DissolveConversationRequestBody extends Message<DissolveConversationRequestBody, C120534oD> {
    public static final ProtoAdapter<DissolveConversationRequestBody> ADAPTER = new RQK();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DissolveConversationRequestBody, C120534oD> newBuilder2() {
        C120534oD c120534oD = new C120534oD();
        c120534oD.LIZLLL = this.conversation_id;
        c120534oD.LJ = this.conversation_short_id;
        c120534oD.LJFF = this.conversation_type;
        c120534oD.addUnknownFields(unknownFields());
        return c120534oD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "DissolveConversationRequestBody{", '}');
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num) {
        this(str, l, num, C64537PUn.EMPTY);
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
