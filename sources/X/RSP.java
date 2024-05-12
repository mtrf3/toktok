package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSP extends Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, RSP> {
    public List<ParticipantReadIndex> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsReadIndexV3ResponseBody build() {
        return new GetConversationParticipantsReadIndexV3ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
