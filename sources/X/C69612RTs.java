package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RTs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69612RTs extends Message.Builder<GetMessagesCheckInfoInConversationResponseBody, C69612RTs> {
    public List<MessagesCheckInfo> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Integer LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoInConversationResponseBody build() {
        return new GetMessagesCheckInfoInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
