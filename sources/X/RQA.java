package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RQA extends Message.Builder<MarkMultiStrangerConversationReadRequestBody, RQA> {
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final MarkMultiStrangerConversationReadRequestBody build() {
        return new MarkMultiStrangerConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
