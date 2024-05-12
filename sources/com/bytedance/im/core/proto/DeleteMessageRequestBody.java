package com.bytedance.im.core.proto;

import X.C63458OvO;
import X.C63468OvY;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class DeleteMessageRequestBody extends Message<DeleteMessageRequestBody, C63468OvY> {
    public static final ProtoAdapter<DeleteMessageRequestBody> ADAPTER = new C63458OvO();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("message_id")
    public final Long message_id;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteMessageRequestBody, C63468OvY> newBuilder2() {
        C63468OvY c63468OvY = new C63468OvY();
        c63468OvY.LIZLLL = this.conversation_id;
        c63468OvY.LJ = this.conversation_short_id;
        c63468OvY.LJFF = this.conversation_type;
        c63468OvY.LJI = this.message_id;
        c63468OvY.addUnknownFields(unknownFields());
        return c63468OvY;
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
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteMessageRequestBody{", '}');
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, C64537PUn.EMPTY);
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.message_id = l2;
    }
}
