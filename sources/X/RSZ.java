package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSZ extends Message.Builder<GetConversationsCheckInfoResponseBody, RSZ> {
    public List<ConversationCheckInfo> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoResponseBody build() {
        return new GetConversationsCheckInfoResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
