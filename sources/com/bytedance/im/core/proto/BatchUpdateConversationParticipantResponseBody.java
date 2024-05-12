package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYP;
import X.YYQ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public final class BatchUpdateConversationParticipantResponseBody extends Message<BatchUpdateConversationParticipantResponseBody, YYQ> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantResponseBody> ADAPTER = new YYP();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("callback_failed_participants")
    public final List<UpdateConversationParticipantResult> callback_failed_participants;

    @InterfaceC65349Pkn("failed_participants")
    public final List<Long> failed_participants;

    @InterfaceC65349Pkn("success_participants")
    public final List<UpdateConversationParticipantResult> success_participants;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchUpdateConversationParticipantResponseBody, YYQ> newBuilder2() {
        YYQ yyq = new YYQ();
        yyq.LIZLLL = C63685Oz3.LIZJ("success_participants", this.success_participants);
        yyq.LJ = C63685Oz3.LIZJ("callback_failed_participants", this.callback_failed_participants);
        yyq.LJFF = C63685Oz3.LIZJ("failed_participants", this.failed_participants);
        yyq.addUnknownFields(unknownFields());
        return yyq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<UpdateConversationParticipantResult> list = this.success_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
        List<UpdateConversationParticipantResult> list2 = this.callback_failed_participants;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", callback_failed_participants=");
            sb.append(this.callback_failed_participants);
        }
        List<Long> list3 = this.failed_participants;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchUpdateConversationParticipantResponseBody{", '}');
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3) {
        this(list, list2, list3, C64537PUn.EMPTY);
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.success_participants = C63685Oz3.LJFF("success_participants", list);
        this.callback_failed_participants = C63685Oz3.LJFF("callback_failed_participants", list2);
        this.failed_participants = C63685Oz3.LJFF("failed_participants", list3);
    }
}
