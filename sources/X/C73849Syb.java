package X;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Syb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73849Syb<T> extends AbstractC73851Syd<T> {
    public static final Object[] LJLJL = new Object[0];
    public static final C73848Sya[] LJLJLJ = new C73848Sya[0];
    public static final C73848Sya[] LJLJLLL = new C73848Sya[0];
    public final AtomicReference<Object> LJLIL;
    public final AtomicReference<C73848Sya<T>[]> LJLILLLLZI;
    public final Lock LJLJI;
    public final Lock LJLJJI;
    public final AtomicReference<Throwable> LJLJJL;
    public long LJLJJLL;

    public final T LJJZZIII() {
        T t = (T) this.LJLIL.get();
        if (EnumC73845SyX.isComplete(t) || EnumC73845SyX.isError(t)) {
            return null;
        }
        EnumC73845SyX.getValue(t);
        return t;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        AtomicReference<Throwable> atomicReference = this.LJLJJL;
        C73863Syp c73863Syp = C73864Syq.LIZ;
        do {
            if (atomicReference.compareAndSet(null, c73863Syp)) {
                Object complete = EnumC73845SyX.complete();
                AtomicReference<C73848Sya<T>[]> atomicReference2 = this.LJLILLLLZI;
                C73848Sya<T>[] c73848SyaArr = LJLJLLL;
                C73848Sya<T>[] andSet = atomicReference2.getAndSet(c73848SyaArr);
                if (andSet != c73848SyaArr) {
                    this.LJLJJI.lock();
                    this.LJLJJLL++;
                    this.LJLIL.lazySet(complete);
                    this.LJLJJI.unlock();
                }
                for (C73848Sya<T> c73848Sya : andSet) {
                    c73848Sya.LIZIZ(this.LJLJJLL, complete);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    public C73849Syb() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LJLJI = reentrantReadWriteLock.readLock();
        this.LJLJJI = reentrantReadWriteLock.writeLock();
        this.LJLILLLLZI = new AtomicReference<>(LJLJLJ);
        this.LJLIL = new AtomicReference<>();
        this.LJLJJL = new AtomicReference<>();
    }

    public static <T> C73849Syb<T> LJJZZI(T t) {
        C73849Syb<T> c73849Syb = new C73849Syb<>();
        AtomicReference<Object> atomicReference = c73849Syb.LJLIL;
        C73320Sq4.LIZ(t, "defaultValue is null");
        atomicReference.lazySet(t);
        return c73849Syb;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73848Sya<T> c73848Sya = new C73848Sya<>(interfaceC116954iR, this);
        interfaceC116954iR.onSubscribe(c73848Sya);
        while (true) {
            C73848Sya<T>[] c73848SyaArr = this.LJLILLLLZI.get();
            boolean z = false;
            if (c73848SyaArr == LJLJLLL) {
                Throwable th = this.LJLJJL.get();
                if (th == C73864Syq.LIZ) {
                    interfaceC116954iR.onComplete();
                    return;
                } else {
                    interfaceC116954iR.onError(th);
                    return;
                }
            }
            int length = c73848SyaArr.length;
            C73848Sya<T>[] c73848SyaArr2 = new C73848Sya[length + 1];
            System.arraycopy(c73848SyaArr, 0, c73848SyaArr2, 0, length);
            c73848SyaArr2[length] = c73848Sya;
            AtomicReference<C73848Sya<T>[]> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(c73848SyaArr, c73848SyaArr2)) {
                if (atomicReference.get() != c73848SyaArr) {
                    break;
                }
            }
            if (c73848Sya.LJLJL) {
                LJL(c73848Sya);
                return;
            }
            if (c73848Sya.LJLJL) {
                return;
            }
            synchronized (c73848Sya) {
                if (!c73848Sya.LJLJL) {
                    if (!c73848Sya.LJLJI) {
                        C73849Syb<T> c73849Syb = c73848Sya.LJLILLLLZI;
                        Lock lock = c73849Syb.LJLJI;
                        lock.lock();
                        c73848Sya.LJLJLJ = c73849Syb.LJLJJLL;
                        Object obj = c73849Syb.LJLIL.get();
                        lock.unlock();
                        if (obj != null) {
                            z = true;
                        }
                        c73848Sya.LJLJJI = z;
                        c73848Sya.LJLJI = true;
                        if (obj != null && !c73848Sya.test(obj)) {
                            c73848Sya.LIZ();
                        }
                    }
                }
            }
            return;
        }
    }

    public final void LJL(C73848Sya<T> c73848Sya) {
        C73848Sya<T>[] c73848SyaArr;
        while (true) {
            C73848Sya<T>[] c73848SyaArr2 = this.LJLILLLLZI.get();
            int length = c73848SyaArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c73848SyaArr2[i] != c73848Sya) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c73848SyaArr = LJLJLJ;
            } else {
                c73848SyaArr = new C73848Sya[length - 1];
                System.arraycopy(c73848SyaArr2, 0, c73848SyaArr, 0, i);
                System.arraycopy(c73848SyaArr2, i + 1, c73848SyaArr, i, (length - i) - 1);
            }
            AtomicReference<C73848Sya<T>[]> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(c73848SyaArr2, c73848SyaArr)) {
                if (atomicReference.get() != c73848SyaArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C73320Sq4.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.LJLJJL;
        do {
            if (atomicReference.compareAndSet(null, th)) {
                Object error = EnumC73845SyX.error(th);
                AtomicReference<C73848Sya<T>[]> atomicReference2 = this.LJLILLLLZI;
                C73848Sya<T>[] c73848SyaArr = LJLJLLL;
                C73848Sya<T>[] andSet = atomicReference2.getAndSet(c73848SyaArr);
                if (andSet != c73848SyaArr) {
                    this.LJLJJI.lock();
                    this.LJLJJLL++;
                    this.LJLIL.lazySet(error);
                    this.LJLJJI.unlock();
                }
                for (C73848Sya<T> c73848Sya : andSet) {
                    c73848Sya.LIZIZ(this.LJLJJLL, error);
                }
                return;
            }
        } while (atomicReference.get() == null);
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        C73320Sq4.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLJJL.get() != null) {
            return;
        }
        EnumC73845SyX.next(t);
        this.LJLJJI.lock();
        this.LJLJJLL++;
        this.LJLIL.lazySet(t);
        this.LJLJJI.unlock();
        for (C73848Sya<T> c73848Sya : this.LJLILLLLZI.get()) {
            c73848Sya.LIZIZ(this.LJLJJLL, t);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (this.LJLJJL.get() != null) {
            interfaceC92693kP.dispose();
        }
    }
}
