package X;

/* renamed from: X.TmP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75641TmP<T> implements InterfaceC64592gB {
    public static final C75641TmP<T> LJLIL = new C75641TmP<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        C75650TmY.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keep pair alive failed, exception: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "TopicPairManager");
        if (th instanceof CH1) {
            C30868C9o.LJI(((C29401Dk) th).getPrompt());
        }
    }
}
