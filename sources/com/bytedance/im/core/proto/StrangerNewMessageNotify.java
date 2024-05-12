package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RS0;
import X.RS1;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class StrangerNewMessageNotify extends Message<StrangerNewMessageNotify, RS1> {
    public static final ProtoAdapter<StrangerNewMessageNotify> ADAPTER = new RS0();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("message")
    public final MessageBody message;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<StrangerNewMessageNotify, RS1> newBuilder2() {
        RS1 rs1 = new RS1();
        rs1.LIZLLL = this.message;
        rs1.addUnknownFields(unknownFields());
        return rs1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        return DIX.LIZLLL(sb, 0, 2, "StrangerNewMessageNotify{", '}');
    }

    public StrangerNewMessageNotify(MessageBody messageBody) {
        this(messageBody, C64537PUn.EMPTY);
    }

    public StrangerNewMessageNotify(MessageBody messageBody, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.message = messageBody;
    }
}
