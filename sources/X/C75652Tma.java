package X;

/* renamed from: X.Tma, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75652Tma<T> implements InterfaceC64592gB {
    public static final C75652Tma<T> LJLIL = new C75652Tma<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CH1) {
            C30868C9o.LJI(((C29401Dk) th).getPrompt());
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "action", Integer.valueOf(EnumC75660Tmi.ACTION_PAIR.getValue()), true);
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIILLIIL("topic_pair_failed");
        BPP.LJ(C15380j0.LIZLLL(), th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start pair failed, throwable: ");
        LIZ.append(th);
        C0NB.LJ("TopicPairManager", X1D.LIZIZ(LIZ));
        C75650TmY.LJ();
    }
}
