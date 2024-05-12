package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.V4i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79144V4i extends Message.Builder<V4S, C79144V4i> {
    public V4Q LJIIIZ;
    public V4L LJIIJ;
    public C64537PUn LJIILJJIL;
    public RU2 LJIILL;
    public RUB LJIILLIIL;
    public java.util.Map<String, RUF> LIZLLL = new LinkedHashMap();
    public java.util.Map<String, C79135V3z> LJ = new LinkedHashMap();
    public java.util.Map<String, C63714OzW> LJFF = new LinkedHashMap();
    public java.util.Map<String, C79141V4f> LJI = new LinkedHashMap();
    public java.util.Map<String, V43> LJII = new LinkedHashMap();
    public java.util.Map<String, C79129V3t> LJIIIIZZ = new LinkedHashMap();
    public java.util.Map<String, C79135V3z> LJIIJJI = new LinkedHashMap();
    public java.util.Map<String, V43> LJIIL = new LinkedHashMap();
    public java.util.Map<String, C79129V3t> LJIILIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final V4S build() {
        return new V4S(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, buildUnknownFields());
    }
}
