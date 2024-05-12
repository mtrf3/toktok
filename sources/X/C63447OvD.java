package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OvD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63447OvD extends Message.Builder<GetMessagesCheckInfoInConversationRequestBody, C63447OvD> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoInConversationRequestBody build() {
        return new GetMessagesCheckInfoInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
