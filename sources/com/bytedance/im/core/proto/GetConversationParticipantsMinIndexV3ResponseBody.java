package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSQ;
import X.RSR;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationParticipantsMinIndexV3ResponseBody extends Message<GetConversationParticipantsMinIndexV3ResponseBody, RSR> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> ADAPTER = new RSQ();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("indexes")
    public final List<ParticipantMinIndex> indexes;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, RSR> newBuilder2() {
        RSR rsr = new RSR();
        rsr.LIZLLL = C63685Oz3.LIZJ("indexes", this.indexes);
        rsr.addUnknownFields(unknownFields());
        return rsr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ParticipantMinIndex> list = this.indexes;
        if (list != null && !list.isEmpty()) {
            sb.append(", indexes=");
            sb.append(this.indexes);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationParticipantsMinIndexV3ResponseBody{", '}');
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.indexes = C63685Oz3.LJFF("indexes", list);
    }
}
