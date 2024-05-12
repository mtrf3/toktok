package X;

import com.bytedance.im.core.proto.AckConversationApplyResponseBody;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.squareup.wire.Message;

/* renamed from: X.RSd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69571RSd extends Message.Builder<AckConversationApplyResponseBody, C69571RSd> {
    public ConversationApplyInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckConversationApplyResponseBody build() {
        return new AckConversationApplyResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
