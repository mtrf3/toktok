package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RR2;
import X.RR3;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RecallMessageRequestBody extends Message<RecallMessageRequestBody, RR3> {
    public static final ProtoAdapter<RecallMessageRequestBody> ADAPTER = new RR2();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RecallMessageRequestBody, RR3> newBuilder2() {
        RR3 rr3 = new RR3();
        rr3.LIZLLL = this.conversation_id;
        rr3.LJ = this.conversation_short_id;
        rr3.LJFF = this.conversation_type;
        rr3.LJI = this.server_message_id;
        rr3.addUnknownFields(unknownFields());
        return rr3;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "RecallMessageRequestBody{", '}');
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, C64537PUn.EMPTY);
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.server_message_id = l2;
    }
}
