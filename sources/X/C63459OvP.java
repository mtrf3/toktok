package X;

import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OvP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63459OvP extends Message.Builder<DeleteConversationRequestBody, C63459OvP> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteConversationRequestBody build() {
        return new DeleteConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
