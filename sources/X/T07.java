package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public final class T07<T> extends AtomicBoolean implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -7419642935409022375L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final T06<T> LJLILLLLZI;
    public final T08 LJLJI;
    public InterfaceC92693kP LJLJJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.LJLILLLLZI.LJJZ(this.LJLJI);
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI.dispose();
        if (compareAndSet(false, true)) {
            T06<T> t06 = this.LJLILLLLZI;
            T08 t08 = this.LJLJI;
            synchronized (t06) {
                T08 t082 = t06.LJLJI;
                if (t082 != null && t082 == t08) {
                    long j = t08.LJLILLLLZI - 1;
                    t08.LJLILLLLZI = j;
                    if (j == 0 && t08.LJLJI) {
                        t06.LJJZZI(t08);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.LJLILLLLZI.LJJZ(this.LJLJI);
            this.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJI, interfaceC92693kP)) {
            this.LJLJJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public T07(InterfaceC116954iR<? super T> interfaceC116954iR, T06<T> t06, T08 t08) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = t06;
        this.LJLJI = t08;
    }
}
