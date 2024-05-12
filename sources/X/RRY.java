package X;

import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RRY extends Message.Builder<BatchGetConversationAuditUnreadResponseBody, RRY> {
    public java.util.Map<Long, Long> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationAuditUnreadResponseBody build() {
        return new BatchGetConversationAuditUnreadResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
