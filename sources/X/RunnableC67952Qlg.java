package X;

/* renamed from: X.Qlg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67952Qlg implements Runnable {
    public final /* synthetic */ ServiceConnectionC67949Qld LJLIL;

    public RunnableC67952Qlg(ServiceConnectionC67949Qld serviceConnectionC67949Qld) {
        this.LJLIL = serviceConnectionC67949Qld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo c68022Qmo = this.LJLIL.LJLJI;
            c68022Qmo.LIZLLL = null;
            c68022Qmo.LJIILL();
        } finally {
            if (LIZ) {
            }
        }
    }
}
