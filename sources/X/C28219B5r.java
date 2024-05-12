package X;

/* renamed from: X.B5r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28219B5r<T> implements InterfaceC64592gB {
    public static final C28219B5r<T> LJLIL = new C28219B5r<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Guest report fail: error msg is ");
        LIZ.append(((Throwable) obj).getMessage());
        C0NB.LIZIZ("BusinessServerReporter", X1D.LIZIZ(LIZ));
    }
}
