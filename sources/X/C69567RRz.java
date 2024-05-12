package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69567RRz extends Message.Builder<ConversationMessagePreViewResponseBody, C69567RRz> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessagePreViewResponseBody build() {
        return new ConversationMessagePreViewResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
