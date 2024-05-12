package com.bytedance.im.core.proto;

import X.C120494o9;
import X.C63685Oz3;
import X.C63692OzA;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class BatchGetConversationAuditUnreadRequestBody extends Message<BatchGetConversationAuditUnreadRequestBody, C120494o9> {
    public static final ProtoAdapter<BatchGetConversationAuditUnreadRequestBody> ADAPTER;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_short_id")
    public final List<Long> conv_short_id;

    static {
        C63692OzA c63692OzA = new C63692OzA();
        ADAPTER = c63692OzA;
        C89451Z8t.LJ.put(2042, c63692OzA);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2042, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetConversationAuditUnreadRequestBody, C120494o9> newBuilder2() {
        C120494o9 c120494o9 = new C120494o9();
        c120494o9.LIZLLL = C63685Oz3.LIZJ("conv_short_id", this.conv_short_id);
        c120494o9.addUnknownFields(unknownFields());
        return c120494o9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conv_short_id;
        if (list != null && !list.isEmpty()) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetConversationAuditUnreadRequestBody{", '}');
    }

    public BatchGetConversationAuditUnreadRequestBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchGetConversationAuditUnreadRequestBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = C63685Oz3.LJFF("conv_short_id", list);
    }
}
