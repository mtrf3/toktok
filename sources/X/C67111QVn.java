package X;

import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.QVn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67111QVn extends Message.Builder<C67101QVd, C67111QVn> {
    public C67098QVa LIZLLL;
    public List<QVZ> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C67101QVd build() {
        C67098QVa c67098QVa = this.LIZLLL;
        if (c67098QVa != null) {
            return new C67101QVd(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(c67098QVa, "header");
        throw null;
    }
}
