package X;

/* loaded from: classes6.dex */
public final class CC6<T> implements InterfaceC64592gB {
    public static final CC6<T> LJLIL = new CC6<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (c29401Dk.getErrorCode() == 4003097) {
                C30868C9o.LJI(c29401Dk.getPrompt());
            }
        }
        CC3.LJIIJ("other");
    }
}
