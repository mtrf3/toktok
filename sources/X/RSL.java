package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSL extends Message.Builder<BatchGetConversationParticipantsReadIndexResponseBody, RSL> {
    public List<ConversationParticipantReadIndex> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationParticipantsReadIndexResponseBody build() {
        return new BatchGetConversationParticipantsReadIndexResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
