package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSO;
import X.RSP;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationParticipantsReadIndexV3ResponseBody extends Message<GetConversationParticipantsReadIndexV3ResponseBody, RSP> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> ADAPTER = new RSO();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("indexes")
    public final List<ParticipantReadIndex> indexes;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, RSP> newBuilder2() {
        RSP rsp = new RSP();
        rsp.LIZLLL = C63685Oz3.LIZJ("indexes", this.indexes);
        rsp.addUnknownFields(unknownFields());
        return rsp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ParticipantReadIndex> list = this.indexes;
        if (list != null && !list.isEmpty()) {
            sb.append(", indexes=");
            sb.append(this.indexes);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationParticipantsReadIndexV3ResponseBody{", '}');
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.indexes = C63685Oz3.LJFF("indexes", list);
    }
}
