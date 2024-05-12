package X;

import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRN extends Message.Builder<ConversationRequest, RRN> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRequest build() {
        return new ConversationRequest(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
