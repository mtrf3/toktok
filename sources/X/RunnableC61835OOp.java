package X;

import Y.ACallableS4S0300100_10;

/* renamed from: X.OOp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61835OOp implements Runnable {
    public final /* synthetic */ W5O LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ Throwable LJLJJI;
    public final /* synthetic */ QGE LJLJJL;

    public final void LIZ() {
        QGH qgh;
        QGE qge = this.LJLJJL;
        W5O w5o = this.LJLIL;
        String str = this.LJLILLLLZI;
        long j = this.LJLJI;
        Throwable th = this.LJLJJI;
        qge.getClass();
        try {
            if (C61831OOl.LJIIIZ(w5o.LIZIZ.getHost()) && (qgh = qge.LIZ.get(str)) != null) {
                C10K.LIZJ(new ACallableS4S0300100_10(j, w5o, qgh, th, 1));
            }
        } finally {
            try {
            } finally {
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

    public RunnableC61835OOp(QGE qge, W5O w5o, String str, long j, Throwable th) {
        this.LJLJJL = qge;
        this.LJLIL = w5o;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = th;
    }
}
