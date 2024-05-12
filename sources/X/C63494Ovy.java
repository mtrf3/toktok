package X;

import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63494Ovy extends Message.Builder<MarkStrangerConversationReadRequestBody, C63494Ovy> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkStrangerConversationReadRequestBody build() {
        return new MarkStrangerConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
