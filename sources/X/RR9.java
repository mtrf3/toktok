package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RR9 extends Message.Builder<MarkMultiStrangerConversationReadResponseBody, RR9> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMultiStrangerConversationReadResponseBody build() {
        return new MarkMultiStrangerConversationReadResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
