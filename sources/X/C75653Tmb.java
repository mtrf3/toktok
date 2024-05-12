package X;

/* renamed from: X.Tmb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75653Tmb<T> implements InterfaceC64592gB {
    public static final C75653Tmb<T> LJLIL = new C75653Tmb<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        C75650TmY.LJ();
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "action", Integer.valueOf(EnumC75660Tmi.ACTION_CANCEL.getValue()), true);
        c75878TqE.LJIIJ(th);
        c75878TqE.LJIILLIIL("topic_pair_failed");
        BPP.LJ(C15380j0.LIZLLL(), th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel pair failed, exception: ");
        LIZ.append(th);
        C0NB.LJ("TopicPairManager", X1D.LIZIZ(LIZ));
    }
}
