package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes17.dex */
public final class YYC extends Message.Builder<BatchMarkConversationReadResponseBody, YYC> {
    public List<MarkConversationReadRequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchMarkConversationReadResponseBody build() {
        return new BatchMarkConversationReadResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
