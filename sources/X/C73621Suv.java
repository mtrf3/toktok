package X;

/* renamed from: X.Suv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73621Suv<T> implements InterfaceC116954iR<T> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC115714gR<? extends T> LJLILLLLZI;
    public boolean LJLJJI = true;
    public final C73616Suq LJLJI = new C73616Suq();

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJI) {
            this.LJLJJI = false;
            this.LJLILLLLZI.LIZ(this);
        } else {
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            this.LJLJJI = false;
        }
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJI.update(interfaceC92693kP);
    }

    public C73621Suv(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC115714gR<? extends T> interfaceC115714gR) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC115714gR;
    }
}
