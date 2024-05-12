package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RQ8 extends Message.Builder<DeleteMultiStrangerConversationRequestBody, RQ8> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final DeleteMultiStrangerConversationRequestBody build() {
        return new DeleteMultiStrangerConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
