package X;

import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RRP extends Message.Builder<BroadcastUserCounterRequestBody, RRP> {
    public List<ConversationRequest> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final BroadcastUserCounterRequestBody build() {
        return new BroadcastUserCounterRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
