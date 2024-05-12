package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSM;
import X.RSN;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class ConversationParticipantReadIndex extends Message<ConversationParticipantReadIndex, RSN> {
    public static final ProtoAdapter<ConversationParticipantReadIndex> ADAPTER = new RSM();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("participantReadIndex")
    public final List<ParticipantReadIndex> participantReadIndex;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationParticipantReadIndex, RSN> newBuilder2() {
        RSN rsn = new RSN();
        rsn.LIZLLL = this.conversation_id;
        rsn.LJ = this.conversation_short_id;
        rsn.LJFF = C63685Oz3.LIZJ("participantReadIndex", this.participantReadIndex);
        rsn.addUnknownFields(unknownFields());
        return rsn;
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
        List<ParticipantReadIndex> list = this.participantReadIndex;
        if (list != null && !list.isEmpty()) {
            sb.append(", participantReadIndex=");
            sb.append(this.participantReadIndex);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationParticipantReadIndex{", '}');
    }

    public ConversationParticipantReadIndex(String str, Long l, List<ParticipantReadIndex> list) {
        this(str, l, list, C64537PUn.EMPTY);
    }

    public ConversationParticipantReadIndex(String str, Long l, List<ParticipantReadIndex> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.participantReadIndex = C63685Oz3.LJFF("participantReadIndex", list);
    }
}
