package X;

import com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.RSh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69575RSh extends Message.Builder<UpdateConversationAuditSwitchResponseBody, C69575RSh> {
    public Boolean LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationAuditSwitchResponseBody build() {
        return new UpdateConversationAuditSwitchResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
