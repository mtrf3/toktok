package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SzA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73884SzA<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73945T0j LJLJJI;
    public final boolean LJLJJL;
    public InterfaceC92693kP LJLJJLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJLL.dispose();
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLJJI.LIZJ(new RunnableC73885SzB(this), this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        long j;
        AbstractC73945T0j abstractC73945T0j = this.LJLJJI;
        RunnableC73886SzC runnableC73886SzC = new RunnableC73886SzC(this, th);
        if (this.LJLJJL) {
            j = this.LJLILLLLZI;
        } else {
            j = 0;
        }
        abstractC73945T0j.LIZJ(runnableC73886SzC, j, this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLJJI.LIZJ(new RunnableC73887SzD(this, t), this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73884SzA(InterfaceC116954iR<? super T> interfaceC116954iR, long j, TimeUnit timeUnit, AbstractC73945T0j abstractC73945T0j, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73945T0j;
        this.LJLJJL = z;
    }
}
