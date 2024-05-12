package X;

import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120534oD extends Message.Builder<DissolveConversationRequestBody, C120534oD> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DissolveConversationRequestBody build() {
        return new DissolveConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
