package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYS extends Message.Builder<UpdateConversationParticipantResult, YYS> {
    public Participant LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantResult build() {
        return new UpdateConversationParticipantResult(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
