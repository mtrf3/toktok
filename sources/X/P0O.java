package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0O extends Message.Builder<ConversationRecentMessage, P0O> {
    public Long LIZLLL;
    public Long LJFF;
    public Integer LJI;
    public String LJII;
    public List<MessageBody> LJ = C63685Oz3.LJIIIIZZ();
    public List<MessageBody> LJIIIIZZ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRecentMessage build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null && this.LJII != null) {
            return new ConversationRecentMessage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "conversation_short_id", this.LJFF, "version", this.LJII, "conversation_id");
        throw null;
    }
}
