package X;

/* renamed from: X.St5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73507St5<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public final long LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public long LJLJJI;
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
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            this.LJLIL.onComplete();
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
        long j = this.LJLJJI;
        if (j == this.LJLILLLLZI) {
            this.LJLJJL = true;
            this.LJLJI.dispose();
            this.LJLIL.onSuccess(t);
            return;
        }
        this.LJLJJI = j + 1;
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73507St5(InterfaceC73509St7<? super T> interfaceC73509St7, long j) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = j;
    }
}
