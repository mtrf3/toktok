package X;

/* renamed from: X.R8r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69065R8r extends R4O {
    public final /* synthetic */ C45R<C69068R8u> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(C69068R8u c69068R8u) {
        int i;
        if (c69068R8u == null || c69068R8u.LJIILL == null) {
            C45R<C69068R8u> c45r = this.LIZ;
            if (c69068R8u != null) {
                i = c69068R8u.LIZLLL;
            } else {
                i = -1;
            }
            ((C73516StE) c45r).onError(new C69084R9k(i, "no data", EnumC69116RAq.LOGIN, EnumC69113RAn.CHANGE_PASSWORD, null, "no data"));
            return;
        }
        ((C73516StE) this.LIZ).onSuccess(c69068R8u);
    }

    public C69065R8r(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(C69068R8u c69068R8u, int i) {
        if (c69068R8u == null) {
            C45R<C69068R8u> c45r = this.LIZ;
            C69049R8b c69049R8b = C69084R9k.Companion;
            EnumC69116RAq scene = this.LIZIZ.scene();
            EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
            c69049R8b.getClass();
            ((C73516StE) c45r).onError(C69049R8b.LIZ(scene, LJLLLL));
            return;
        }
        ((C73516StE) this.LIZ).onError(new C69084R9k(i, c69068R8u.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), c69068R8u.LJII, null, 32, null));
    }
}
