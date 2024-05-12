package X;

import java.util.NoSuchElementException;

/* renamed from: X.SsO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73464SsO<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final T LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public T LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        T t = this.LJLJJI;
        this.LJLJJI = null;
        if (t != null || (t = this.LJLILLLLZI) != null) {
            this.LJLIL.onSuccess(t);
        } else {
            this.LJLIL.onError(new NoSuchElementException());
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJL) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJL = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJL) {
            return;
        }
        if (this.LJLJJI != null) {
            this.LJLJJL = true;
            this.LJLJI.dispose();
            this.LJLIL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LJLJJI = t;
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73464SsO(InterfaceC73463SsN<? super T> interfaceC73463SsN, T t) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = t;
    }
}
