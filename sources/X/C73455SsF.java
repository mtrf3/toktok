package X;

/* renamed from: X.SsF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73455SsF<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public long LJLJJI;

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
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            this.LJLJI.dispose();
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLILLLLZI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLILLLLZI = true;
        this.LJLJI.dispose();
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        boolean z;
        if (!this.LJLILLLLZI) {
            long j = this.LJLJJI;
            long j2 = j - 1;
            this.LJLJJI = j2;
            if (j > 0) {
                if (j2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLIL.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            if (this.LJLJJI == 0) {
                this.LJLILLLLZI = true;
                interfaceC92693kP.dispose();
                EnumC73538Sta.complete(this.LJLIL);
                return;
            }
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73455SsF(InterfaceC116954iR<? super T> interfaceC116954iR, long j) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJJI = j;
    }
}
