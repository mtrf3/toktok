package X;

/* renamed from: X.E5s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35864E5s<T> implements InterfaceC64592gB {
    public static final C35864E5s<T> LJLIL = new C35864E5s<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th == null || (str = th.toString()) == null) {
            str = "no reason";
        }
        C35863E5r.LIZ(-10010, str, false);
    }
}
