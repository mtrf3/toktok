package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Sxp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC73801Sxp<T> extends AbstractC73743Swt<T> implements InterfaceC73812Sy0<T>, Runnable {
    public static final long serialVersionUID = -8241002408341274697L;
    public final AbstractC73945T0j LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final AtomicLong LJLJJL = new AtomicLong();
    public InterfaceC73651SvP LJLJJLL;
    public InterfaceC73570Su6<T> LJLJL;
    public volatile boolean LJLJLJ;
    public volatile boolean LJLJLLL;
    public Throwable LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public boolean LJLLJ;

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        if (this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        this.LJLJJLL.cancel();
        this.LJLIL.dispose();
        if (getAndIncrement() == 0) {
            this.LJLJL.clear();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJL.clear();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJL.isEmpty();
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            LJFF();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLLJ) {
                LIZLLL();
            } else if (this.LJLLI == 1) {
                LJ();
            } else {
                LIZJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LJFF() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.LJLIL.LIZIZ(this);
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJLLL) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLL = th;
        this.LJLJLLL = true;
        LJFF();
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJLLL) {
            return;
        }
        if (this.LJLLI == 2) {
            LJFF();
            return;
        }
        if (!this.LJLJL.offer(t)) {
            this.LJLJJLL.cancel();
            this.LJLL = new C73799Sxn("Queue is full?!");
            this.LJLJLLL = true;
        }
        LJFF();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLJJL, j);
            LJFF();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LJLLJ = true;
            return 2;
        }
        return 0;
    }

    public AbstractRunnableC73801Sxp(AbstractC73945T0j abstractC73945T0j, boolean z, int i) {
        this.LJLIL = abstractC73945T0j;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = i - (i >> 2);
    }

    public final boolean LIZIZ(boolean z, boolean z2, InterfaceC73740Swq<?> interfaceC73740Swq) {
        if (this.LJLJLJ) {
            clear();
            return true;
        }
        if (z) {
            if (this.LJLILLLLZI) {
                if (z2) {
                    this.LJLJLJ = true;
                    Throwable th = this.LJLL;
                    if (th != null) {
                        interfaceC73740Swq.onError(th);
                    } else {
                        interfaceC73740Swq.onComplete();
                    }
                    this.LJLIL.dispose();
                    return true;
                }
                return false;
            }
            Throwable th2 = this.LJLL;
            if (th2 != null) {
                this.LJLJLJ = true;
                clear();
                interfaceC73740Swq.onError(th2);
                this.LJLIL.dispose();
                return true;
            }
            if (z2) {
                this.LJLJLJ = true;
                interfaceC73740Swq.onComplete();
                this.LJLIL.dispose();
                return true;
            }
            return false;
        }
        return false;
    }
}
