package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYU extends Message.Builder<UpdateConversationParticipantResponseBody, YYU> {
    public Participant LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantResponseBody build() {
        return new UpdateConversationParticipantResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
