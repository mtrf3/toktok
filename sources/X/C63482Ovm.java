package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63482Ovm extends Message.Builder<GetConversationParticipantsMinIndexV3RequestBody, C63482Ovm> {
    public Long LIZLLL;
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsMinIndexV3RequestBody build() {
        return new GetConversationParticipantsMinIndexV3RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
