package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSY;
import X.RSZ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationsCheckInfoResponseBody extends Message<GetConversationsCheckInfoResponseBody, RSZ> {
    public static final ProtoAdapter<GetConversationsCheckInfoResponseBody> ADAPTER = new RSY();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_checkinfo_list")
    public final List<ConversationCheckInfo> conversation_checkinfo_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationsCheckInfoResponseBody, RSZ> newBuilder2() {
        RSZ rsz = new RSZ();
        rsz.LIZLLL = C63685Oz3.LIZJ("conversation_checkinfo_list", this.conversation_checkinfo_list);
        rsz.addUnknownFields(unknownFields());
        return rsz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationCheckInfo> list = this.conversation_checkinfo_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_checkinfo_list=");
            sb.append(this.conversation_checkinfo_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationsCheckInfoResponseBody{", '}');
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_checkinfo_list = C63685Oz3.LJFF("conversation_checkinfo_list", list);
    }
}
