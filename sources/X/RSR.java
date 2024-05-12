package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSR extends Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, RSR> {
    public List<ParticipantMinIndex> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsMinIndexV3ResponseBody build() {
        return new GetConversationParticipantsMinIndexV3ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
