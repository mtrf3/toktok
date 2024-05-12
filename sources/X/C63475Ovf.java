package X;

import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63475Ovf extends Message.Builder<ConversationParticipantsListRequestBody, C63475Ovf> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantsListRequestBody build() {
        return new ConversationParticipantsListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
