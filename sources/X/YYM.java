package X;

import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYM extends Message.Builder<TimeStampRange, YYM> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TimeStampRange build() {
        return new TimeStampRange(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
