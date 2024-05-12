package X;

/* renamed from: X.B7k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28264B7k<T> implements InterfaceC64592gB {
    public static final C28264B7k<T> LJLIL = new C28264B7k<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/webcast/room/stickers/check/ is error, error message:");
            if (th == null) {
                str = null;
            } else {
                str = th.getLocalizedMessage();
            }
            LIZ.append(str);
            C0NB.LIZ(X1D.LIZIZ(LIZ));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }
}
