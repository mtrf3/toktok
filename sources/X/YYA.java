package X;

import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes17.dex */
public final class YYA extends Message.Builder<BatchDeleteConversationResponseBody, YYA> {
    public List<DeleteConversationRequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchDeleteConversationResponseBody build() {
        return new BatchDeleteConversationResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
