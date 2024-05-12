package X;

import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YY2 extends Message.Builder<ConversationParticipantsListResponseBody, YY2> {
    public ParticipantsPage LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantsListResponseBody build() {
        return new ConversationParticipantsListResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
