package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSK;
import X.RSL;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BatchGetConversationParticipantsReadIndexResponseBody extends Message<BatchGetConversationParticipantsReadIndexResponseBody, RSL> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody> ADAPTER = new RSK();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversationParticipantsReadIndex")
    public final List<ConversationParticipantReadIndex> conversationParticipantsReadIndex;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetConversationParticipantsReadIndexResponseBody, RSL> newBuilder2() {
        RSL rsl = new RSL();
        rsl.LIZLLL = C63685Oz3.LIZJ("conversationParticipantsReadIndex", this.conversationParticipantsReadIndex);
        rsl.addUnknownFields(unknownFields());
        return rsl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationParticipantReadIndex> list = this.conversationParticipantsReadIndex;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversationParticipantsReadIndex=");
            sb.append(this.conversationParticipantsReadIndex);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetConversationParticipantsReadIndexResponseBody{", '}');
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversationParticipantsReadIndex = C63685Oz3.LJFF("conversationParticipantsReadIndex", list);
    }
}
