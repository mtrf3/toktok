package X;

/* renamed from: X.St6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73508St6<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public T LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        T t = this.LJLJI;
        this.LJLJI = null;
        if (t == null) {
            this.LJLIL.onComplete();
        } else {
            this.LJLIL.onSuccess(t);
        }
    }

    public C73508St6(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL = interfaceC73509St7;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJI = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJI != null) {
            this.LJLJJI = true;
            this.LJLILLLLZI.dispose();
            this.LJLIL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LJLJI = t;
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }
}
