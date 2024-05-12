package X;

import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RSt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69587RSt extends Message.Builder<MessageByInitResponseBody, C69587RSt> {
    public List<ConversationMessage> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageByInitResponseBody build() {
        Boolean bool = this.LJ;
        if (bool != null && this.LJFF != null) {
            return new MessageByInitResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(bool, "has_more", this.LJFF, "next_init_version");
        throw null;
    }
}
