package X;

import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RUG extends Message.Builder<RUF, RUG> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RUF build() {
        return new RUF(this.LIZLLL, buildUnknownFields());
    }
}
