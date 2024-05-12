package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RS3 extends Message.Builder<ConversationMessage, RS3> {
    public ConversationInfoV2 LIZLLL;
    public List<MessageBody> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessage build() {
        ConversationInfoV2 conversationInfoV2 = this.LIZLLL;
        if (conversationInfoV2 != null) {
            return new ConversationMessage(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(conversationInfoV2, "conversations");
        throw null;
    }
}
