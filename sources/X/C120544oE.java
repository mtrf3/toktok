package X;

import com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120544oE extends Message.Builder<GetConversationAuditSwitchRequestBody, C120544oE> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationAuditSwitchRequestBody build() {
        return new GetConversationAuditSwitchRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
