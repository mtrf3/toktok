package com.bytedance.im.core.proto;

import X.C63494Ovy;
import X.C63495Ovz;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MarkStrangerConversationReadRequestBody extends Message<MarkStrangerConversationReadRequestBody, C63494Ovy> {
    public static final ProtoAdapter<MarkStrangerConversationReadRequestBody> ADAPTER = new C63495Ovz();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkStrangerConversationReadRequestBody, C63494Ovy> newBuilder2() {
        C63494Ovy c63494Ovy = new C63494Ovy();
        c63494Ovy.LIZLLL = this.conversation_short_id;
        c63494Ovy.addUnknownFields(unknownFields());
        return c63494Ovy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkStrangerConversationReadRequestBody{", '}');
    }

    public MarkStrangerConversationReadRequestBody(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public MarkStrangerConversationReadRequestBody(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
    }
}
