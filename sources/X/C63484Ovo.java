package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63484Ovo extends Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, C63484Ovo> {
    public Long LIZLLL;
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsReadIndexV3RequestBody build() {
        return new GetConversationParticipantsReadIndexV3RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
