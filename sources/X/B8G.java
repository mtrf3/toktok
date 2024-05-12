package X;

/* loaded from: classes6.dex */
public final class B8G<T> implements InterfaceC64592gB {
    public static final B8G<T> LJLIL = new B8G<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Guest report fail: error msg is ");
        LIZ.append(((Throwable) obj).getMessage());
        C0NB.LIZIZ("MultiGuestV3ReportUtil", X1D.LIZIZ(LIZ));
    }
}
