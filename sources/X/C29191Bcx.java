package X;

/* renamed from: X.Bcx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29191Bcx<T> implements InterfaceC64592gB {
    public static final C29191Bcx<T> LJLIL = new C29191Bcx<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable occurs: ");
        String str2 = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (th != null) {
            str2 = th.getMessage();
        }
        C32014ChO.LIZJ("RankListUserViewBinder", LIZIZ, str2);
    }
}
