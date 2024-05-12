package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0C extends Message.Builder<GetRecentMessageRespBody, P0C> {
    public Long LIZLLL;
    public List<ConversationRecentMessage> LJ = C63685Oz3.LJIIIIZZ();
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetRecentMessageRespBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null) {
            return new GetRecentMessageRespBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "next_conversation_version", this.LJFF, "has_more");
        throw null;
    }
}
