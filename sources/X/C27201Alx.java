package X;

/* renamed from: X.Alx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27201Alx<T> implements InterfaceC04760Gq {
    public static final C27201Alx<T> LIZ = new C27201Alx<>();

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loaded failed ");
        LIZ2.append(((Throwable) obj).getMessage());
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ2));
    }
}
