package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0W extends Message.Builder<ParticipantsPage, P0W> {
    public List<Participant> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantsPage build() {
        return new ParticipantsPage(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
