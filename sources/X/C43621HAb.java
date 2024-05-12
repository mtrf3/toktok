package X;

/* renamed from: X.HAb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43621HAb<T> implements InterfaceC64592gB {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ InterfaceC43623HAd LJLILLLLZI;
    public final /* synthetic */ C43622HAc LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;

    public C43621HAb(C76732zl c76732zl, C43618H9y c43618H9y, C43622HAc c43622HAc, C68322mC c68322mC) {
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = c43618H9y;
        this.LJLJI = c43622HAc;
        this.LJLJJI = c68322mC;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (this.LJLIL.element == 0) {
            this.LJLILLLLZI.LIZ(this.LJLJI.LJ);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MvNetModule submitRequest illegalFileCount ");
        LIZ.append(this.LJLIL.element);
        LIZ.append(" errToast ");
        LIZ.append(this.LJLJJI.element);
        H78.LJII(X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LIZIZ(this.LJLJJI.element, this.LJLJI.LJ);
    }
}
