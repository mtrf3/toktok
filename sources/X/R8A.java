package X;

/* loaded from: classes12.dex */
public final class R8A extends AbstractC67056QTk {
    public final /* synthetic */ C45R<C69026R7e> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        int i;
        if (qqi != null && qqi.LIZIZ) {
            ((C73516StE) this.LIZ).onSuccess(qqi);
            return;
        }
        C45R<C69026R7e> c45r = this.LIZ;
        if (qqi != null) {
            i = qqi.LIZLLL;
        } else {
            i = -1;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i, "no data", EnumC69116RAq.SET_OR_RESET_PASSWORD, EnumC69113RAn.CHANGE_PASSWORD, null, "no data"));
    }

    public R8A(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        if (qqi == null) {
            C45R<C69026R7e> c45r = this.LIZ;
            C69049R8b c69049R8b = C69084R9k.Companion;
            EnumC69116RAq scene = this.LIZIZ.scene();
            EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
            c69049R8b.getClass();
            ((C73516StE) c45r).onError(C69049R8b.LIZ(scene, LJLLLL));
            return;
        }
        ((C73516StE) this.LIZ).onError(new C69084R9k(i, qqi.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), qqi.LJII, null, 32, null));
    }
}
