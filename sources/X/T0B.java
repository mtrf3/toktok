package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0B<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final T0E[] LJLJJL = new T0E[0];
    public static final T0E[] LJLJJLL = new T0E[0];
    public static final long serialVersionUID = -533785617179540163L;
    public final T0H<T> LJLIL;
    public boolean LJLILLLLZI;
    public final AtomicReference<T0E[]> LJLJI = new AtomicReference<>(LJLJJL);
    public final AtomicBoolean LJLJJI = new AtomicBoolean();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.set(LJLJJLL);
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLJI.get() == LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            T0D t0d = (T0D) this.LJLIL;
            t0d.getClass();
            t0d.add(EnumC73845SyX.complete());
            t0d.LJLIL++;
            for (T0E<T> t0e : this.LJLJI.getAndSet(LJLJJLL)) {
                ((T0D) this.LJLIL).LIZJ(t0e);
            }
        }
    }

    public T0B(T0D t0d) {
        this.LJLIL = t0d;
    }

    public final void LIZ(T0E<T> t0e) {
        T0E[] t0eArr;
        while (true) {
            T0E[] t0eArr2 = this.LJLJI.get();
            int length = t0eArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (!t0eArr2[i].equals(t0e)) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                t0eArr = LJLJJL;
            } else {
                t0eArr = new T0E[length - 1];
                System.arraycopy(t0eArr2, 0, t0eArr, 0, i);
                System.arraycopy(t0eArr2, i + 1, t0eArr, i, (length - i) - 1);
            }
            AtomicReference<T0E[]> atomicReference = this.LJLJI;
            while (!atomicReference.compareAndSet(t0eArr2, t0eArr)) {
                if (atomicReference.get() != t0eArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            T0D t0d = (T0D) this.LJLIL;
            t0d.getClass();
            t0d.add(EnumC73845SyX.error(th));
            t0d.LJLIL++;
            for (T0E<T> t0e : this.LJLJI.getAndSet(LJLJJLL)) {
                ((T0D) this.LJLIL).LIZJ(t0e);
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (!this.LJLILLLLZI) {
            T0D t0d = (T0D) this.LJLIL;
            t0d.getClass();
            EnumC73845SyX.next(t);
            t0d.add(t);
            t0d.LJLIL++;
            for (T0E<T> t0e : this.LJLJI.get()) {
                ((T0D) this.LJLIL).LIZJ(t0e);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            for (T0E<T> t0e : this.LJLJI.get()) {
                ((T0D) this.LJLIL).LIZJ(t0e);
            }
        }
    }
}
