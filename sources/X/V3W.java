package X;

import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes14.dex */
public final class V3W extends Message.Builder<C79131V3v, V3W> {
    public RUF LIZLLL;
    public V3T LJFF;
    public V4L LJI;
    public Integer LJIIIZ;
    public RU2 LJIIJJI;
    public RUB LJIIL;
    public List<V4U> LJ = C63685Oz3.LJIIIIZZ();
    public List<C79129V3t> LJII = C63685Oz3.LJIIIIZZ();
    public List<C63714OzW> LJIIIIZZ = C63685Oz3.LJIIIIZZ();
    public List<Integer> LJIIJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C79131V3v build() {
        return new C79131V3v(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
