package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class T0Y<T, U extends Collection<? super T>> extends AbstractC73936T0a<T, U, U> implements Runnable, InterfaceC92693kP {
    public final Callable<U> LJLJJLL;
    public final long LJLJL;
    public final long LJLJLJ;
    public final TimeUnit LJLJLLL;
    public final AbstractC73945T0j LJLL;
    public final List<U> LJLLI;
    public InterfaceC92693kP LJLLILLLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.LJLLI);
            ((LinkedList) this.LJLLI).clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.LJLJI.offer(it.next());
        }
        this.LJLJJL = true;
        if (LJ()) {
            C73975T1n.LJII(this.LJLJI, this.LJLILLLLZI, this.LJLL, this);
        }
    }

    public final void LJI() {
        if (this.LJLJJI) {
            return;
        }
        try {
            U call = this.LJLJJLL.call();
            C73320Sq4.LIZ(call, "The bufferSupplier returned a null buffer");
            U u = call;
            synchronized (this) {
                if (this.LJLJJI) {
                    return;
                }
                ((LinkedList) this.LJLLI).add(u);
                this.LJLL.LIZJ(new RunnableC73937T0b(this, u), this.LJLJL, this.LJLJLLL);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLILLLLZI.onError(th);
            dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            synchronized (this) {
                ((LinkedList) this.LJLLI).clear();
            }
            this.LJLLILLLL.dispose();
            this.LJLL.dispose();
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
        this.LJLJJL = true;
        synchronized (this) {
            ((LinkedList) this.LJLLI).clear();
        }
        this.LJLILLLLZI.onError(th);
        this.LJLL.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        synchronized (this) {
            Iterator<U> it = this.LJLLI.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLLILLLL, interfaceC92693kP)) {
            this.LJLLILLLL = interfaceC92693kP;
            try {
                U call = this.LJLJJLL.call();
                C73320Sq4.LIZ(call, "The buffer supplied is null");
                U u = call;
                ((LinkedList) this.LJLLI).add(u);
                this.LJLILLLLZI.onSubscribe(this);
                AbstractC73945T0j abstractC73945T0j = this.LJLL;
                long j = this.LJLJLJ;
                abstractC73945T0j.LIZLLL(this, j, j, this.LJLJLLL);
                this.LJLL.LIZJ(new RunnableC73938T0c(this, u), this.LJLJL, this.LJLJLLL);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                interfaceC92693kP.dispose();
                EnumC73538Sta.error(th, this.LJLILLLLZI);
                this.LJLL.dispose();
            }
        }
    }

    @Override // X.AbstractC73936T0a
    public final void LIZLLL(InterfaceC116954iR interfaceC116954iR, Object obj) {
        interfaceC116954iR.onNext(obj);
    }

    public T0Y(C73844SyW c73844SyW, Callable callable, long j, long j2, TimeUnit timeUnit, AbstractC73945T0j abstractC73945T0j) {
        super(c73844SyW, new C73939T0d());
        this.LJLJJLL = callable;
        this.LJLJL = j;
        this.LJLJLJ = j2;
        this.LJLJLLL = timeUnit;
        this.LJLL = abstractC73945T0j;
        this.LJLLI = new LinkedList();
    }
}
