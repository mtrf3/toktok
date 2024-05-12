package X;

import com.bytedance.im.core.proto.GetConversationAuditListRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120484o8 extends Message.Builder<GetConversationAuditListRequestBody, C120484o8> {
    public Long LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationAuditListRequestBody build() {
        return new GetConversationAuditListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
