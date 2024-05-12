package X;

import com.squareup.wire.Message;

/* renamed from: X.QVo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67112QVo extends Message.Builder<C67102QVe, C67112QVo> {
    public C67107QVj LIZLLL;
    public C67103QVf LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C67102QVe build() {
        C67107QVj c67107QVj = this.LIZLLL;
        if (c67107QVj != null) {
            return new C67102QVe(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(c67107QVj, "cursor");
        throw null;
    }
}
