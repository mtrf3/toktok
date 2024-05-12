package com.bytedance.im.core.proto;

import X.C63484Ovo;
import X.C63485Ovp;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetConversationParticipantsReadIndexV3RequestBody extends Message<GetConversationParticipantsReadIndexV3RequestBody, C63484Ovo> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> ADAPTER = new C63485Ovp();
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
    public Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, C63484Ovo> newBuilder2() {
        C63484Ovo c63484Ovo = new C63484Ovo();
        c63484Ovo.LIZLLL = this.conversation_short_id;
        c63484Ovo.LJ = this.conversation_type;
        c63484Ovo.LJFF = this.conversation_id;
        c63484Ovo.addUnknownFields(unknownFields());
        return c63484Ovo;
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
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationParticipantsReadIndexV3RequestBody{", '}');
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str) {
        this(l, num, str, C64537PUn.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}