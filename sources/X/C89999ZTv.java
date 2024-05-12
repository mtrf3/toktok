package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.ZTv, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89999ZTv<TResult> {
    public static final Executor LJ = C16880lQ.LLLLZLLIL();
    public static final Executor LJFF = new ExecutorC89998ZTu();
    public TResult LIZ;
    public boolean LIZIZ;
    public final Object LIZJ = new Object();
    public List<InterfaceC89997ZTt<TResult, Void>> LIZLLL = new ArrayList();

    public final boolean LIZJ() {
        boolean z;
        synchronized (this.LIZJ) {
            z = this.LIZIZ;
        }
        return z;
    }

    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC89997ZTt) it.next()).LIZ(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.LIZLLL = null;
        }
    }

    public final void LJ() {
        synchronized (this.LIZJ) {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            this.LIZJ.notifyAll();
            LIZLLL();
        }
    }

    public static <TResult> C89999ZTv<TResult> LIZ(Callable<TResult> callable, Executor executor) {
        C89999ZTv<TResult> c89999ZTv = new C89999ZTv<>();
        try {
            executor.execute(new RunnableC89996ZTs(c89999ZTv, callable));
        } catch (Exception unused) {
            c89999ZTv.LJ();
        }
        return c89999ZTv;
    }

    public final void LIZIZ(InterfaceC89997ZTt interfaceC89997ZTt, Executor executor) {
        boolean LIZJ;
        C89999ZTv c89999ZTv = new C89999ZTv();
        synchronized (this.LIZJ) {
            LIZJ = LIZJ();
            if (!LIZJ) {
                ((ArrayList) this.LIZLLL).add(new ZUH(interfaceC89997ZTt, this, c89999ZTv, executor));
            }
        }
        if (LIZJ) {
            try {
                ((ExecutorC89998ZTu) executor).execute(new RunnableC90000ZTw(interfaceC89997ZTt, this, c89999ZTv));
            } catch (Exception unused) {
                c89999ZTv.LJ();
            }
        }
    }
}
