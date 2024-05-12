package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes17.dex */
public final class YYQ extends Message.Builder<BatchUpdateConversationParticipantResponseBody, YYQ> {
    public List<UpdateConversationParticipantResult> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<UpdateConversationParticipantResult> LJ = C63685Oz3.LJIIIIZZ();
    public List<Long> LJFF = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchUpdateConversationParticipantResponseBody build() {
        return new BatchUpdateConversationParticipantResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
