package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0G extends Message.Builder<MessagesPerUserResponseBody, P0G> {
    public Long LJ;
    public Boolean LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIZ;
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<ConversationBadgeCountInfo> LJIIIIZZ = C63685Oz3.LJIIIIZZ();
    public List<C64537PUn> LJIIJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserResponseBody build() {
        return new MessagesPerUserResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
