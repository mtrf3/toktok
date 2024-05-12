package X;

/* renamed from: X.EHd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36161EHd<T> implements InterfaceC64592gB {
    public static final C36161EHd<T> LJLIL = new C36161EHd<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("filterAlreadyReadFeedData error and ");
        LIZ.append(((Throwable) obj).getStackTrace());
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }
}
