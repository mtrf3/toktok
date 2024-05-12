package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes17.dex */
public final class YYW extends Message.Builder<ConversationRemoveParticipantsResponseBody, YYW> {
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<SecUidPair> LJIIIIZZ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRemoveParticipantsResponseBody build() {
        return new ConversationRemoveParticipantsResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
