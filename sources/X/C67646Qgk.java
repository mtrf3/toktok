package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.Qgk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67646Qgk<TResult> extends AbstractC67638Qgc<TResult> {
    public final Object LIZ = new Object();
    public final C67653Qgr<TResult> LIZIZ = new C67653Qgr<>();
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public TResult LJ;
    public Exception LJFF;

    @Override // X.AbstractC67638Qgc
    public final Exception LJIIIIZZ() {
        Exception exc;
        synchronized (this.LIZ) {
            exc = this.LJFF;
        }
        return exc;
    }

    @Override // X.AbstractC67638Qgc
    public final TResult LJIIIZ() {
        TResult tresult;
        synchronized (this.LIZ) {
            QH7.LJIIJ("Task is not yet complete", this.LIZJ);
            if (!this.LIZLLL) {
                if (this.LJFF == null) {
                    tresult = this.LJ;
                } else {
                    throw new C67645Qgj(this.LJFF);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // X.AbstractC67638Qgc
    public final boolean LJIIL() {
        boolean z;
        synchronized (this.LIZ) {
            z = this.LIZJ;
        }
        return z;
    }

    @Override // X.AbstractC67638Qgc
    public final boolean LJIILIIL() {
        boolean z;
        synchronized (this.LIZ) {
            if (this.LIZJ && !this.LIZLLL && this.LJFF == null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.AbstractC67638Qgc
    public final AbstractC67638Qgc LJIILJJIL() {
        return LJIILL(C67641Qgf.LIZ, new InterfaceC67643Qgh() { // from class: X.QZu
            @Override // X.InterfaceC67643Qgh
            public final C67646Qgk LIZ(Object obj) {
                return C67637Qgb.LJ(null);
            }
        });
    }

    public final void LJIJI() {
        synchronized (this.LIZ) {
            if (this.LIZJ) {
                return;
            }
            this.LIZJ = true;
            this.LIZLLL = true;
            this.LIZIZ.LIZ(this);
        }
    }

    public final void LJIJJ() {
        synchronized (this.LIZ) {
            if (!this.LIZJ) {
                return;
            }
            this.LIZIZ.LIZ(this);
        }
    }

    @Override // X.AbstractC67638Qgc
    public final boolean LJIIJJI() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67638Qgc
    public final void LIZIZ(InterfaceC67661Qgz interfaceC67661Qgz) {
        LIZJ(C67641Qgf.LIZ, interfaceC67661Qgz);
    }

    @Override // X.AbstractC67638Qgc
    public final C67646Qgk LJ(InterfaceC67677QhF interfaceC67677QhF) {
        LJFF(C67641Qgf.LIZ, interfaceC67677QhF);
        return this;
    }

    @Override // X.AbstractC67638Qgc
    public final <X extends Throwable> TResult LJIIJ(Class<X> cls) {
        TResult tresult;
        synchronized (this.LIZ) {
            QH7.LJIIJ("Task is not yet complete", this.LIZJ);
            if (!this.LIZLLL) {
                if (!cls.isInstance(this.LJFF)) {
                    if (this.LJFF == null) {
                        tresult = this.LJ;
                    } else {
                        throw new C67645Qgj(this.LJFF);
                    }
                } else {
                    throw cls.cast(this.LJFF);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    public final C67646Qgk LJIILLIIL(InterfaceC67679QhH interfaceC67679QhH) {
        LIZLLL(C67641Qgf.LIZ, interfaceC67679QhH);
        return this;
    }

    public final void LJIIZILJ(Exception exc) {
        QH7.LJIIIZ(exc, "Exception must not be null");
        synchronized (this.LIZ) {
            QH7.LJIIJ("Task is already complete", !this.LIZJ);
            this.LIZJ = true;
            this.LJFF = exc;
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LJIJ(TResult tresult) {
        synchronized (this.LIZ) {
            QH7.LJIIJ("Task is already complete", !this.LIZJ);
            this.LIZJ = true;
            this.LJ = tresult;
        }
        this.LIZIZ.LIZ(this);
    }

    @Override // X.AbstractC67638Qgc
    public final void LIZ(ExecutorC67642Qgg executorC67642Qgg, InterfaceC67680QhI interfaceC67680QhI) {
        this.LIZIZ.LIZIZ(new C67658Qgw(executorC67642Qgg, interfaceC67680QhI));
        LJIJJ();
    }

    @Override // X.AbstractC67638Qgc
    public final void LIZJ(Executor executor, InterfaceC67661Qgz interfaceC67661Qgz) {
        this.LIZIZ.LIZIZ(new C67654Qgs(executor, interfaceC67661Qgz));
        LJIJJ();
    }

    @Override // X.AbstractC67638Qgc
    public final C67646Qgk LIZLLL(Executor executor, InterfaceC67679QhH interfaceC67679QhH) {
        this.LIZIZ.LIZIZ(new C67656Qgu(executor, interfaceC67679QhH));
        LJIJJ();
        return this;
    }

    @Override // X.AbstractC67638Qgc
    public final C67646Qgk LJFF(Executor executor, InterfaceC67677QhF interfaceC67677QhF) {
        this.LIZIZ.LIZIZ(new C67651Qgp(executor, interfaceC67677QhF));
        LJIJJ();
        return this;
    }

    @Override // X.AbstractC67638Qgc
    public final <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJI(Executor executor, InterfaceC67660Qgy<TResult, TContinuationResult> interfaceC67660Qgy) {
        C67646Qgk c67646Qgk = new C67646Qgk();
        this.LIZIZ.LIZIZ(new C67650Qgo(executor, interfaceC67660Qgy, c67646Qgk));
        LJIJJ();
        return c67646Qgk;
    }

    @Override // X.AbstractC67638Qgc
    public final <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJII(Executor executor, InterfaceC67660Qgy<TResult, AbstractC67638Qgc<TContinuationResult>> interfaceC67660Qgy) {
        C67646Qgk c67646Qgk = new C67646Qgk();
        this.LIZIZ.LIZIZ(new C67648Qgm(executor, interfaceC67660Qgy, c67646Qgk));
        LJIJJ();
        return c67646Qgk;
    }

    @Override // X.AbstractC67638Qgc
    public final <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJIILL(Executor executor, InterfaceC67643Qgh<TResult, TContinuationResult> interfaceC67643Qgh) {
        C67646Qgk c67646Qgk = new C67646Qgk();
        this.LIZIZ.LIZIZ(new C67647Qgl(executor, interfaceC67643Qgh, c67646Qgk));
        LJIJJ();
        return c67646Qgk;
    }
}
