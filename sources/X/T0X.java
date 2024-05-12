package X;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0X<T, U extends Collection<? super T>> extends AbstractC73936T0a<T, U, U> implements Runnable, InterfaceC92693kP {
    public final Callable<U> LJLJJLL;
    public final long LJLJL;
    public final TimeUnit LJLJLJ;
    public final AbstractC73946T0k LJLJLLL;
    public InterfaceC92693kP LJLL;
    public U LJLLI;
    public final AtomicReference<InterfaceC92693kP> LJLLILLLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        U u;
        synchronized (this) {
            u = this.LJLLI;
            this.LJLLI = null;
        }
        if (u != null) {
            this.LJLJI.offer(u);
            this.LJLJJL = true;
            if (LJ()) {
                C73975T1n.LJII(this.LJLJI, this.LJLILLLLZI, null, this);
            }
        }
        EnumC73418Sre.dispose(this.LJLLILLLL);
    }

    public final void LJI() {
        U u;
        try {
            U call = this.LJLJJLL.call();
            C73320Sq4.LIZ(call, "The bufferSupplier returned a null buffer");
            U u2 = call;
            synchronized (this) {
                u = this.LJLLI;
                if (u != null) {
                    this.LJLLI = u2;
                }
            }
            if (u == null) {
                EnumC73418Sre.dispose(this.LJLLILLLL);
                return;
            }
            InterfaceC116954iR<? super V> interfaceC116954iR = this.LJLILLLLZI;
            InterfaceC73767SxH<U> interfaceC73767SxH = this.LJLJI;
            if (((AtomicInteger) this.LJLIL).get() == 0 && ((AtomicInteger) this.LJLIL).compareAndSet(0, 1)) {
                LIZLLL(interfaceC116954iR, u);
                if (((AtomicInteger) this.LJLIL).addAndGet(-1) == 0) {
                    return;
                }
            } else {
                interfaceC73767SxH.offer(u);
                if (!LJ()) {
                    return;
                }
            }
            C73975T1n.LJII(interfaceC73767SxH, interfaceC116954iR, this, this);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLILLLLZI.onError(th);
            dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLLILLLL);
        this.LJLL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLLILLLL.get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
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

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        synchronized (this) {
            this.LJLLI = null;
        }
        this.LJLILLLLZI.onError(th);
        EnumC73418Sre.dispose(this.LJLLILLLL);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        synchronized (this) {
            U u = this.LJLLI;
            if (u == null) {
                return;
            }
            u.add(t);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLL, interfaceC92693kP)) {
            this.LJLL = interfaceC92693kP;
            try {
                U call = this.LJLJJLL.call();
                C73320Sq4.LIZ(call, "The buffer supplied is null");
                this.LJLLI = call;
                this.LJLILLLLZI.onSubscribe(this);
                if (!this.LJLJJI) {
                    AbstractC73946T0k abstractC73946T0k = this.LJLJLLL;
                    long j = this.LJLJL;
                    InterfaceC92693kP LIZLLL = abstractC73946T0k.LIZLLL(this, j, j, this.LJLJLJ);
                    AtomicReference<InterfaceC92693kP> atomicReference = this.LJLLILLLL;
                    while (!atomicReference.compareAndSet(null, LIZLLL)) {
                        if (atomicReference.get() != null) {
                            LIZLLL.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                V0N.LJJIL(th);
                dispose();
                EnumC73538Sta.error(th, this.LJLILLLLZI);
            }
        }
    }

    @Override // X.AbstractC73936T0a
    public final void LIZLLL(InterfaceC116954iR interfaceC116954iR, Object obj) {
        this.LJLILLLLZI.onNext(obj);
    }

    public T0X(C73844SyW c73844SyW, Callable callable, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        super(c73844SyW, new C73939T0d());
        this.LJLLILLLL = new AtomicReference<>();
        this.LJLJJLL = callable;
        this.LJLJL = j;
        this.LJLJLJ = timeUnit;
        this.LJLJLLL = abstractC73946T0k;
    }
}
