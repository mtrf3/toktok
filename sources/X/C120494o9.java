package X;

import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.4o9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120494o9 extends Message.Builder<BatchGetConversationAuditUnreadRequestBody, C120494o9> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationAuditUnreadRequestBody build() {
        return new BatchGetConversationAuditUnreadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
