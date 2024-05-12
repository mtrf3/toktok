package X;

import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RUA extends Message.Builder<RU9, RUA> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RU9 build() {
        return new RU9(this.LIZLLL, buildUnknownFields());
    }
}
