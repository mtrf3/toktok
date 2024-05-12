package X;

/* loaded from: classes15.dex */
public final class W7D implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final W6M<W6U, W5A> LIZ;
    public final W6O LIZIZ;
    public final InterfaceC81759W6x<C81392Vwy<W5A>> LIZJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
        String id = interfaceC81770W7i.getId();
        W5O LJ = interfaceC81770W7i.LJ();
        Object LIZIZ = interfaceC81770W7i.LIZIZ();
        VA3 va3 = LJ.LJIILLIIL;
        if (va3 == null || va3.getPostprocessorCacheKey() == null) {
            this.LIZJ.LIZIZ(w7f, interfaceC81770W7i);
            return;
        }
        LIZ.LIZ(id, "PostprocessedBitmapMemoryCacheProducer");
        V91 LIZLLL = this.LIZIZ.LIZLLL(LJ, LIZIZ);
        C81392Vwy LJFF = this.LIZ.LJFF(LIZLLL);
        java.util.Map map = null;
        if (LJFF != null) {
            if (LIZ.LJIIIZ(id)) {
                map = C65618Pp8.of("cached_value_found", "true");
            }
            LIZ.LIZIZ(id, "PostprocessedBitmapMemoryCacheProducer", map);
            LIZ.LIZLLL(id, "PostprocessedBitmapMemoryCacheProducer", true);
            w7f.LIZ(1.0f);
            w7f.LIZIZ(1, LJFF);
            LJFF.close();
            return;
        }
        W7E w7e = new W7E(w7f, LIZLLL, va3 instanceof W7H, this.LIZ, interfaceC81770W7i.LJ().LJIILL);
        if (LIZ.LJIIIZ(id)) {
            map = C65618Pp8.of("cached_value_found", "false");
        }
        LIZ.LIZIZ(id, "PostprocessedBitmapMemoryCacheProducer", map);
        this.LIZJ.LIZIZ(w7e, interfaceC81770W7i);
    }

    public W7D(W6M w6m, W6O w6o, W77 w77) {
        this.LIZ = w6m;
        this.LIZIZ = w6o;
        this.LIZJ = w77;
    }
}
