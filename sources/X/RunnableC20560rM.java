package X;

import Y.IDRunnableS29S0200000;
import android.content.Context;
import androidx.work.ListenableWorker;

/* renamed from: X.0rM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20560rM implements Runnable {
    public static final /* synthetic */ int LJLJL = 0;
    public final C43731nd<Void> LJLIL = new C43731nd<>();
    public final Context LJLILLLLZI;
    public final C19380pS LJLJI;
    public final ListenableWorker LJLJJI;
    public final C0VU LJLJJL;
    public final InterfaceC23750wV LJLJJLL;

    static {
        C0VW.LIZIZ("WorkForegroundRunnable");
    }

    public final void LIZ() {
        if (!this.LJLJI.LJIILLIIL || C10580bG.LIZ()) {
            this.LJLIL.LJIIIIZZ(null);
            return;
        }
        C43731nd c43731nd = new C43731nd();
        ((C35591aV) this.LJLJJLL).LIZJ.execute(new IDRunnableS29S0200000(c43731nd, this, 36));
        c43731nd.LJFF(new IDRunnableS29S0200000(c43731nd, this, 37), ((C35591aV) this.LJLJJLL).LIZJ);
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

    public RunnableC20560rM(Context context, C19380pS c19380pS, ListenableWorker listenableWorker, C0VU c0vu, InterfaceC23750wV interfaceC23750wV) {
        this.LJLILLLLZI = context;
        this.LJLJI = c19380pS;
        this.LJLJJI = listenableWorker;
        this.LJLJJL = c0vu;
        this.LJLJJLL = interfaceC23750wV;
    }
}
