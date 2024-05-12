package X;

/* renamed from: X.Qli, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67954Qli implements Runnable {
    public final /* synthetic */ InterfaceC68041Qn7 LJLIL;
    public final /* synthetic */ ServiceConnectionC67949Qld LJLILLLLZI;

    public RunnableC67954Qli(ServiceConnectionC67949Qld serviceConnectionC67949Qld, InterfaceC68041Qn7 interfaceC68041Qn7) {
        this.LJLILLLLZI = serviceConnectionC67949Qld;
        this.LJLIL = interfaceC68041Qn7;
    }

    public final void LIZ() {
        synchronized (this.LJLILLLLZI) {
            this.LJLILLLLZI.LJLIL = false;
            if (!this.LJLILLLLZI.LJLJI.LJIIJJI()) {
                this.LJLILLLLZI.LJLJI.LIZ.LIZJ().LJIIL.LIZ("Connected to remote service");
                C68022Qmo c68022Qmo = this.LJLILLLLZI.LJLJI;
                InterfaceC68041Qn7 interfaceC68041Qn7 = this.LJLIL;
                c68022Qmo.LJFF();
                QH7.LJIIIIZZ(interfaceC68041Qn7);
                c68022Qmo.LIZLLL = interfaceC68041Qn7;
                c68022Qmo.LJIILLIIL();
                c68022Qmo.LJIILL();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
