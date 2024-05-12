package X;

import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OvZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63469OvZ extends Message.Builder<MessagesInConversationRequestBody, C63469OvZ> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC63513OwH LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationRequestBody build() {
        return new MessagesInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
