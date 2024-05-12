package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSN extends Message.Builder<ConversationParticipantReadIndex, RSN> {
    public String LIZLLL;
    public Long LJ;
    public List<ParticipantReadIndex> LJFF = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantReadIndex build() {
        return new ConversationParticipantReadIndex(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
