package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSF extends Message.Builder<GetUserConversationListResponseBody, RSF> {
    public List<ConversationInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetUserConversationListResponseBody build() {
        return new GetUserConversationListResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
