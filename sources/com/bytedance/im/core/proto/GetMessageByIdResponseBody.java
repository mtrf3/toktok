package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P05;
import X.P06;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetMessageByIdResponseBody extends Message<GetMessageByIdResponseBody, P06> {
    public static final ProtoAdapter<GetMessageByIdResponseBody> ADAPTER = new P05();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("msg_info")
    public final MessageInfo msg_info;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageByIdResponseBody, P06> newBuilder2() {
        P06 p06 = new P06();
        p06.LIZLLL = this.msg_info;
        p06.addUnknownFields(unknownFields());
        return p06;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msg_info != null) {
            sb.append(", msg_info=");
            sb.append(this.msg_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageByIdResponseBody{", '}');
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo) {
        this(messageInfo, C64537PUn.EMPTY);
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.msg_info = messageInfo;
    }
}
