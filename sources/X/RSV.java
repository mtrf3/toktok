package X;

import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RSV extends Message.Builder<ParticipantReadIndex, RSV> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantReadIndex build() {
        return new ParticipantReadIndex(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
