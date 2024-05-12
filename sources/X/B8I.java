package X;

/* loaded from: classes6.dex */
public final class B8I<T> implements InterfaceC64592gB {
    public static final B8I<T> LJLIL = new B8I<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Anchor report fail: error msg is ");
        LIZ.append(((Throwable) obj).getMessage());
        C0NB.LIZIZ("BusinessServerReporter", X1D.LIZIZ(LIZ));
    }
}
