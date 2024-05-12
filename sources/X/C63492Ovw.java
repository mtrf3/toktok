package X;

import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63492Ovw extends Message.Builder<DeleteStrangerConversationRequestBody, C63492Ovw> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteStrangerConversationRequestBody build() {
        return new DeleteStrangerConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
