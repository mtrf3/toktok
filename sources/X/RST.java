package X;

import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RST extends Message.Builder<ParticipantMinIndex, RST> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantMinIndex build() {
        return new ParticipantMinIndex(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
