package com.bytedance.im.core.proto;

import X.C120544oE;
import X.C63729Ozl;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetConversationAuditSwitchRequestBody extends Message<GetConversationAuditSwitchRequestBody, C120544oE> {
    public static final ProtoAdapter<GetConversationAuditSwitchRequestBody> ADAPTER;
    public static final Integer DEFAULT_CONVERSATION_TYPE;
    public static final Long DEFAULT_CONV_SHORT_ID;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    static {
        C63729Ozl c63729Ozl = new C63729Ozl();
        ADAPTER = c63729Ozl;
        DEFAULT_CONV_SHORT_ID = 0L;
        DEFAULT_CONVERSATION_TYPE = 0;
        C89451Z8t.LJ.put(2022, c63729Ozl);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2022, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationAuditSwitchRequestBody, C120544oE> newBuilder2() {
        C120544oE c120544oE = new C120544oE();
        c120544oE.LIZLLL = this.conv_short_id;
        c120544oE.LJ = this.conversation_type;
        c120544oE.addUnknownFields(unknownFields());
        return c120544oE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationAuditSwitchRequestBody{", '}');
    }

    public GetConversationAuditSwitchRequestBody(Long l, Integer num) {
        this(l, num, C64537PUn.EMPTY);
    }

    public GetConversationAuditSwitchRequestBody(Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.conversation_type = num;
    }
}
