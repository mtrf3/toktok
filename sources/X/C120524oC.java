package X;

import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.4oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120524oC extends Message.Builder<ConversationLeaveRequestBody, C120524oC> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationLeaveRequestBody build() {
        return new ConversationLeaveRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
