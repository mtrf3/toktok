package X;

import com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RQX extends Message.Builder<GetConversationAuditSwitchResponseBody, RQX> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationAuditSwitchResponseBody build() {
        return new GetConversationAuditSwitchResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
