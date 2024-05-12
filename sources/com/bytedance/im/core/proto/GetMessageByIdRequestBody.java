package com.bytedance.im.core.proto;

import X.C63477Ovh;
import X.C63478Ovi;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetMessageByIdRequestBody extends Message<GetMessageByIdRequestBody, C63477Ovh> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<GetMessageByIdRequestBody> ADAPTER = new C63478Ovi();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageByIdRequestBody, C63477Ovh> newBuilder2() {
        C63477Ovh c63477Ovh = new C63477Ovh();
        c63477Ovh.LIZLLL = this.conversation_id;
        c63477Ovh.LJ = this.conversation_type;
        c63477Ovh.LJFF = this.conversation_short_id;
        c63477Ovh.LJI = this.server_message_id;
        c63477Ovh.addUnknownFields(unknownFields());
        return c63477Ovh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageByIdRequestBody{", '}');
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2) {
        this(str, num, l, l2, C64537PUn.EMPTY);
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
    }
}
