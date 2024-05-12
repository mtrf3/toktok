package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Gnv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42611Gnv<T> extends CountDownLatch implements InterfaceC116954iR<Object>, InterfaceC92693kP {
    public Object LJLIL;
    public Throwable LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public volatile boolean LJLJJI;

    public C42611Gnv() {
        super(1);
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI = true;
        InterfaceC92693kP interfaceC92693kP = this.LJLJI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public final Object LIZ() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C73864Syq.LIZIZ(e);
            }
        }
        Throwable th = this.LJLILLLLZI;
        if (th == null) {
            return this.LJLIL;
        }
        throw C73864Syq.LIZIZ(th);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        countDown();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLIL == null) {
            this.LJLILLLLZI = th;
        }
        countDown();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLIL == null) {
            this.LJLIL = t;
            this.LJLJI.dispose();
            countDown();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJI = interfaceC92693kP;
        if (this.LJLJJI) {
            interfaceC92693kP.dispose();
        }
    }
}
