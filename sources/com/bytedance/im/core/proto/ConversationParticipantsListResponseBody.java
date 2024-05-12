package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YY1;
import X.YY2;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class ConversationParticipantsListResponseBody extends Message<ConversationParticipantsListResponseBody, YY2> {
    public static final ProtoAdapter<ConversationParticipantsListResponseBody> ADAPTER = new YY1();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("participants_page")
    public final ParticipantsPage participants_page;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationParticipantsListResponseBody, YY2> newBuilder2() {
        YY2 yy2 = new YY2();
        yy2.LIZLLL = this.participants_page;
        yy2.addUnknownFields(unknownFields());
        return yy2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participants_page != null) {
            sb.append(", participants_page=");
            sb.append(this.participants_page);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationParticipantsListResponseBody{", '}');
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage) {
        this(participantsPage, C64537PUn.EMPTY);
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.participants_page = participantsPage;
    }
}
