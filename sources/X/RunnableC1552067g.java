package X;

/* renamed from: X.67g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC1552067g implements Runnable {
    public final /* synthetic */ C67T LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean z;
        String str;
        try {
            C67T c67t = this.LJLIL;
            c67t.LJIIIIZZ = false;
            C67P c67p = c67t.LJIILLIIL;
            if (c67p != null) {
                c67p.invalidate();
            }
            C67T c67t2 = this.LJLIL;
            C67Y c67y = c67t2.LJIJI;
            if (c67y != null) {
                if (c67t2.LJIILLIIL.getData() != null) {
                    z = c67t2.LJIILLIIL.getData().getHasReadTextAudio();
                } else {
                    z = false;
                }
                C67T c67t3 = this.LJLIL;
                if (c67t3.LJIILLIIL.getData() != null && c67t3.LJIILLIIL.getData().getTtsVoiceModel() != null) {
                    str = "auto";
                } else {
                    str = "user_click";
                }
                c67y.LIZ(str, false, true, z);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC1552067g(C67T c67t) {
        this.LJLIL = c67t;
    }
}
