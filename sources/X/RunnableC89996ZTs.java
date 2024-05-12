package X;

import java.util.concurrent.Callable;

/* renamed from: X.ZTs, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class RunnableC89996ZTs implements Runnable {
    public final /* synthetic */ C89999ZTv LJLIL;
    public final /* synthetic */ Callable LJLILLLLZI;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, TResult] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                C89999ZTv c89999ZTv = this.LJLIL;
                ?? call = this.LJLILLLLZI.call();
                synchronized (c89999ZTv.LIZJ) {
                    if (!c89999ZTv.LIZIZ) {
                        c89999ZTv.LIZIZ = true;
                        c89999ZTv.LIZ = call;
                        c89999ZTv.LIZJ.notifyAll();
                        c89999ZTv.LIZLLL();
                    }
                }
            } catch (Exception unused) {
                this.LJLIL.LJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC89996ZTs(C89999ZTv c89999ZTv, Callable callable) {
        this.LJLIL = c89999ZTv;
        this.LJLILLLLZI = callable;
    }
}
