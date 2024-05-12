package X;

import com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4oA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120504oA extends Message.Builder<UpdateConversationAuditSwitchRequestBody, C120504oA> {
    public Long LIZLLL;
    public Integer LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationAuditSwitchRequestBody build() {
        return new UpdateConversationAuditSwitchRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
