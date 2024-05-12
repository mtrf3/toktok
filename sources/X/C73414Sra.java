package X;

/* renamed from: X.Sra, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73414Sra<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC48038ItG<? super Throwable, ? extends T> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

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
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        try {
            T apply = this.LJLILLLLZI.apply(th);
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.LJLIL.onError(nullPointerException);
            } else {
                this.LJLIL.onNext(apply);
                this.LJLIL.onComplete();
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73414Sra(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC48038ItG<? super Throwable, ? extends T> interfaceC48038ItG) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
