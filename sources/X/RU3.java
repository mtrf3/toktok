package X;

import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RU3 extends Message.Builder<RU2, RU3> {
    public RU0 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RU2 build() {
        return new RU2(this.LIZLLL, buildUnknownFields());
    }
}
