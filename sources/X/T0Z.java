package X;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class T0Z<T, U extends Collection<? super T>> extends AbstractC73936T0a<T, U, U> implements Runnable, InterfaceC92693kP {
    public final Callable<U> LJLJJLL;
    public final long LJLJL;
    public final TimeUnit LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;
    public final AbstractC73945T0j LJLLI;
    public U LJLLILLLL;
    public InterfaceC92693kP LJLLJ;
    public InterfaceC92693kP LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;

    public final void LJI() {
        try {
            U call = this.LJLJJLL.call();
            C73320Sq4.LIZ(call, "The bufferSupplier returned a null buffer");
            U u = call;
            synchronized (this) {
                U u2 = this.LJLLILLLL;
                if (u2 == null || this.LJLLLL != this.LJLLLLLL) {
                    return;
                }
                this.LJLLILLLL = u;
                LJFF(u2, this);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            dispose();
            this.LJLILLLLZI.onError(th);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLLL.dispose();
            this.LJLLI.dispose();
            synchronized (this) {
                this.LJLLILLLL = null;
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        U u;
        this.LJLLI.dispose();
        synchronized (this) {
            u = this.LJLLILLLL;
            this.LJLLILLLL = null;
        }
        this.LJLJI.offer(u);
        this.LJLJJL = true;
        if (LJ()) {
            C73975T1n.LJII(this.LJLJI, this.LJLILLLLZI, this, this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        synchronized (this) {
            this.LJLLILLLL = null;
        }
        this.LJLILLLLZI.onError(th);
        this.LJLLI.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        synchronized (this) {
            U u = this.LJLLILLLL;
            if (u == null) {
                return;
            }
            u.add(t);
            if (u.size() < this.LJLJLLL) {
                return;
            }
            this.LJLLILLLL = null;
            this.LJLLLL++;
            if (this.LJLL) {
                this.LJLLJ.dispose();
            }
            LJFF(u, this);
            try {
                U call = this.LJLJJLL.call();
                C73320Sq4.LIZ(call, "The buffer supplied is null");
                U u2 = call;
                synchronized (this) {
                    this.LJLLILLLL = u2;
                    this.LJLLLLLL++;
                }
                if (this.LJLL) {
                    AbstractC73945T0j abstractC73945T0j = this.LJLLI;
                    long j = this.LJLJL;
                    this.LJLLJ = abstractC73945T0j.LIZLLL(this, j, j, this.LJLJLJ);
                }
            } catch (Throwable th) {
                V0N.LJJIL(th);
                this.LJLILLLLZI.onError(th);
                dispose();
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLLL, interfaceC92693kP)) {
            this.LJLLL = interfaceC92693kP;
            try {
                U call = this.LJLJJLL.call();
                C73320Sq4.LIZ(call, "The buffer supplied is null");
                this.LJLLILLLL = call;
                this.LJLILLLLZI.onSubscribe(this);
                AbstractC73945T0j abstractC73945T0j = this.LJLLI;
                long j = this.LJLJL;
                this.LJLLJ = abstractC73945T0j.LIZLLL(this, j, j, this.LJLJLJ);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                interfaceC92693kP.dispose();
                EnumC73538Sta.error(th, this.LJLILLLLZI);
                this.LJLLI.dispose();
            }
        }
    }

    @Override // X.AbstractC73936T0a
    public final void LIZLLL(InterfaceC116954iR interfaceC116954iR, Object obj) {
        interfaceC116954iR.onNext(obj);
    }

    public T0Z(C73844SyW c73844SyW, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, AbstractC73945T0j abstractC73945T0j) {
        super(c73844SyW, new C73939T0d());
        this.LJLJJLL = callable;
        this.LJLJL = j;
        this.LJLJLJ = timeUnit;
        this.LJLJLLL = i;
        this.LJLL = z;
        this.LJLLI = abstractC73945T0j;
    }
}
