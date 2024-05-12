package X;

/* loaded from: classes12.dex */
public final class R8J extends AbstractC69028R7g {
    public final /* synthetic */ C45R<R40<C69024R7c>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.QQE
    public final void onResponse(R40<C69024R7c> r40) {
        if (r40 == null) {
            ((C73516StE) this.LIZ).onError(new C69084R9k(-1, "no data", EnumC69116RAq.SIGN_UP, this.LIZIZ.LJLLLL(), null, null, 32, null));
        } else if (r40.LIZLLL != 0) {
            ((C73516StE) this.LIZ).onError(new C69084R9k(r40.LIZLLL, r40.LJFF, EnumC69116RAq.SIGN_UP, this.LIZIZ.LJLLLL(), null, null, 32, null));
        } else {
            C68545QvF.LIZ(true);
            ((C73516StE) this.LIZ).onSuccess(r40);
        }
    }

    public R8J(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }
}
