package X;

/* renamed from: X.Ukj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78085Ukj implements InterfaceC78493UrJ {
    public final /* synthetic */ C78075UkZ LJLIL;

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        C78075UkZ c78075UkZ = this.LJLIL;
        c78075UkZ.LJII = c78075UkZ.LIZJ(Long.valueOf(System.currentTimeMillis()));
        C78075UkZ c78075UkZ2 = this.LJLIL;
        c78075UkZ2.LJIIIZ = c78075UkZ2.LIZJ(Long.valueOf(C30725C4b.LIZ()));
        C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterBackground");
        if (this.LJLIL.LIZJ) {
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterBackground skip current monitor");
            this.LJLIL.LJIILJJIL.LIZLLL();
            this.LJLIL.LIZJ = false;
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C78075UkZ c78075UkZ = this.LJLIL;
        c78075UkZ.LJIIIIZZ = c78075UkZ.LIZJ(Long.valueOf(System.currentTimeMillis()));
        C78075UkZ c78075UkZ2 = this.LJLIL;
        c78075UkZ2.LJIIJ = c78075UkZ2.LIZJ(Long.valueOf(C30725C4b.LIZ()));
        C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterForeground");
    }

    public C78085Ukj(C78075UkZ c78075UkZ) {
        this.LJLIL = c78075UkZ;
    }
}
