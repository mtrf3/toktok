package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.Fvx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40561Fvx<ResultT> {
    public final Object LIZ = new Object();
    public final C40566Fw2<ResultT> LIZIZ = new C40566Fw2<>();
    public boolean LIZJ;
    public ResultT LIZLLL;
    public Exception LJ;

    public final void LIZLLL() {
        synchronized (this.LIZ) {
            if (this.LIZJ) {
                this.LIZIZ.LIZ(this);
            }
        }
    }

    public final Exception LJ() {
        Exception exc;
        synchronized (this.LIZ) {
            exc = this.LJ;
        }
        return exc;
    }

    public final boolean LJI() {
        boolean z;
        synchronized (this.LIZ) {
            z = false;
            if (this.LIZJ && this.LJ == null) {
                z = true;
            }
        }
        return z;
    }

    public final ResultT LJFF() {
        ResultT resultt;
        synchronized (this.LIZ) {
            if (this.LIZJ) {
                Exception exc = this.LJ;
                if (exc == null) {
                    resultt = this.LIZLLL;
                } else {
                    throw new EPS(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    public final void LIZ(ResultT resultt) {
        synchronized (this.LIZ) {
            if (!this.LIZJ) {
                this.LIZJ = true;
                this.LIZLLL = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LIZIZ(Executor executor, InterfaceC40570Fw6 interfaceC40570Fw6) {
        C40566Fw2<ResultT> c40566Fw2 = this.LIZIZ;
        C40567Fw3 c40567Fw3 = new C40567Fw3(executor, interfaceC40570Fw6);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
        }
        LIZLLL();
    }

    public final void LIZJ(Executor executor, InterfaceC40563Fvz interfaceC40563Fvz) {
        C40566Fw2<ResultT> c40566Fw2 = this.LIZIZ;
        C40565Fw1 c40565Fw1 = new C40565Fw1(executor, interfaceC40563Fvz);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40565Fw1);
        }
        LIZLLL();
    }
}
