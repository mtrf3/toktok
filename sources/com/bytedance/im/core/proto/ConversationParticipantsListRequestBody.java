package com.bytedance.im.core.proto;

import X.C63475Ovf;
import X.C63476Ovg;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ConversationParticipantsListRequestBody extends Message<ConversationParticipantsListRequestBody, C63475Ovf> {
    public static final ProtoAdapter<ConversationParticipantsListRequestBody> ADAPTER = new C63476Ovg();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 100;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationParticipantsListRequestBody, C63475Ovf> newBuilder2() {
        C63475Ovf c63475Ovf = new C63475Ovf();
        c63475Ovf.LIZLLL = this.conversation_id;
        c63475Ovf.LJ = this.conversation_short_id;
        c63475Ovf.LJFF = this.conversation_type;
        c63475Ovf.LJI = this.cursor;
        c63475Ovf.LJII = this.limit;
        c63475Ovf.addUnknownFields(unknownFields());
        return c63475Ovf;
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationParticipantsListRequestBody{", '}');
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2) {
        this(str, l, num, l2, num2, C64537PUn.EMPTY);
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.cursor = l2;
        this.limit = num2;
    }
}
