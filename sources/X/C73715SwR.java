package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.SwR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73715SwR<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73945T0j LJLJJI;
    public InterfaceC92693kP LJLJJL;
    public RunnableC73716SwS LJLJJLL;
    public volatile long LJLJL;
    public boolean LJLJLJ;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJL.dispose();
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        RunnableC73716SwS runnableC73716SwS = this.LJLJJLL;
        if (runnableC73716SwS != null) {
            EnumC73418Sre.dispose(runnableC73716SwS);
            runnableC73716SwS.run();
        }
        this.LJLIL.onComplete();
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJLJ) {
            C73548Stk.LIZIZ(th);
            return;
        }
        RunnableC73716SwS runnableC73716SwS = this.LJLJJLL;
        if (runnableC73716SwS != null) {
            EnumC73418Sre.dispose(runnableC73716SwS);
        }
        this.LJLJLJ = true;
        this.LJLIL.onError(th);
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJLJ) {
            return;
        }
        long j = this.LJLJL + 1;
        this.LJLJL = j;
        RunnableC73716SwS runnableC73716SwS = this.LJLJJLL;
        if (runnableC73716SwS != null) {
            EnumC73418Sre.dispose(runnableC73716SwS);
        }
        RunnableC73716SwS runnableC73716SwS2 = new RunnableC73716SwS(t, j, this);
        this.LJLJJLL = runnableC73716SwS2;
        EnumC73418Sre.replace(runnableC73716SwS2, this.LJLJJI.LIZJ(runnableC73716SwS2, this.LJLILLLLZI, this.LJLJI));
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJL, interfaceC92693kP)) {
            this.LJLJJL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73715SwR(C73844SyW c73844SyW, long j, TimeUnit timeUnit, AbstractC73945T0j abstractC73945T0j) {
        this.LJLIL = c73844SyW;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73945T0j;
    }
}
