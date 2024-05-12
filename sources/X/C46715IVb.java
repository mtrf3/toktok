package X;

/* renamed from: X.IVb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46715IVb<T> implements InterfaceC64592gB {
    public static final C46715IVb<T> LJLIL = new C46715IVb<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getLocalNotifyInfo() - error: ");
        LIZ.append(((Throwable) obj).getMessage());
        C47629Imf.LIZIZ("DoNotifyWork", X1D.LIZIZ(LIZ));
    }
}
