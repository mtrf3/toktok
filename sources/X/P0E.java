package X;

import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0E extends Message.Builder<GetStrangerMessagesResponseBody, P0E> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerMessagesResponseBody build() {
        return new GetStrangerMessagesResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
