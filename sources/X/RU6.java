package X;

import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RU6 extends Message.Builder<RU5, RU6> {
    public Integer LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RU5 build() {
        return new RU5(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
