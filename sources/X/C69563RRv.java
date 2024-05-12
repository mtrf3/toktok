package X;

import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.GetConversationAuditListResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69563RRv extends Message.Builder<GetConversationAuditListResponseBody, C69563RRv> {
    public List<ConversationApplyInfo> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Long LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationAuditListResponseBody build() {
        return new GetConversationAuditListResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
