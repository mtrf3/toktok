package X;

/* loaded from: classes15.dex */
public final class WPV<T> implements InterfaceC64592gB<Throwable> {
    public static final WPV LJLIL = new WPV();

    @Override // X.InterfaceC64592gB
    public final void accept(Throwable th) {
        Throwable th2 = th;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("viki filter, repository()?.fetchDataWithReturn(false)?.subscribe, throwable.message=");
        LIZ.append(th2.getMessage());
        LIZLLL.d(X1D.LIZIZ(LIZ));
        WPZ.LIZIZ.LIZIZ(false, "filter", th2, "", "");
    }
}
