package X;

import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.QVl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67109QVl extends Message.Builder<QVZ, C67109QVl> {
    public QVX LIZLLL;
    public QW9 LJ;
    public EnumC67115QVr LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public List<C67102QVe> LJIIIZ = C63685Oz3.LJIIIIZZ();
    public EnumC67116QVs LJIIJ;
    public Long LJIIJJI;
    public String LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final QVZ build() {
        QVX qvx = this.LIZLLL;
        if (qvx != null && this.LJFF != null) {
            return new QVZ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
        }
        C63685Oz3.LJII(qvx, "flag", this.LJFF, "topic_type");
        throw null;
    }
}
