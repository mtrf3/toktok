package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RR7 extends Message.Builder<DeleteMultiStrangerConversationResponseBody, RR7> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMultiStrangerConversationResponseBody build() {
        return new DeleteMultiStrangerConversationResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
