package X;

import com.squareup.wire.Message;

/* renamed from: X.QVq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67114QVq extends Message.Builder<C67107QVj, C67114QVq> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C67107QVj build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C67107QVj(this.LIZLLL, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "cursor");
        throw null;
    }
}
