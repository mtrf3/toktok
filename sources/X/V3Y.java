package X;

import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes14.dex */
public final class V3Y extends Message.Builder<C79132V3w, V3Y> {
    public V4Z LIZLLL;
    public RUV LJ;
    public V43 LJFF;
    public List<V4N> LJI = C63685Oz3.LJIIIIZZ();
    public C63714OzW LJII;
    public RU2 LJIIIIZZ;
    public RUB LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C79132V3w build() {
        return new C79132V3w(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
