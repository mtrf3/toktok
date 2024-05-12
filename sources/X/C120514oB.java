package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.4oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120514oB extends Message.Builder<BatchMarkConversationReadRequestBody, C120514oB> {
    public List<MarkConversationReadRequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchMarkConversationReadRequestBody build() {
        return new BatchMarkConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
