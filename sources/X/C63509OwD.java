package X;

import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OwD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63509OwD extends Message.Builder<BatchDeleteConversationRequestBody, C63509OwD> {
    public List<DeleteConversationRequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchDeleteConversationRequestBody build() {
        return new BatchDeleteConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
