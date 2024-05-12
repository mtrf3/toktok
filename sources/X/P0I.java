package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0I extends Message.Builder<MessagesInConversationResponseBody, P0I> {
    public Long LJ;
    public Boolean LJFF;
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<C64537PUn> LJI = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationResponseBody build() {
        return new MessagesInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
