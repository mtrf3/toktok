package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC109604Rw;
import X.InterfaceC65349Pkn;
import X.P02;
import X.P03;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessageInfo extends Message<MessageInfo, P03> {
    public static final ProtoAdapter<MessageInfo> ADAPTER = new P02();
    public static final EnumC109604Rw DEFAULT_STATUS = EnumC109604Rw.AVAILABLE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("body")
    public final MessageBody body;

    @InterfaceC65349Pkn("status")
    public final EnumC109604Rw status;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageInfo, P03> newBuilder2() {
        P03 p03 = new P03();
        p03.LIZLLL = this.status;
        p03.LJ = this.body;
        p03.addUnknownFields(unknownFields());
        return p03;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessageInfo{", '}');
    }

    public MessageInfo(EnumC109604Rw enumC109604Rw, MessageBody messageBody) {
        this(enumC109604Rw, messageBody, C64537PUn.EMPTY);
    }

    public MessageInfo(EnumC109604Rw enumC109604Rw, MessageBody messageBody, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.status = enumC109604Rw;
        this.body = messageBody;
    }
}
