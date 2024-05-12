package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Svd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73665Svd<T> extends CountDownLatch implements InterfaceC73463SsN<T>, InterfaceC73442Ss2, InterfaceC73509St7<T> {
    public T LJLIL;
    public Throwable LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public volatile boolean LJLJJI;

    public C73665Svd() {
        super(1);
    }

    public final T LIZ() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.LJLJJI = true;
                InterfaceC92693kP interfaceC92693kP = this.LJLJI;
                if (interfaceC92693kP != null) {
                    interfaceC92693kP.dispose();
                }
                throw C73864Syq.LIZIZ(e);
            }
        }
        Throwable th = this.LJLILLLLZI;
        if (th == null) {
            return this.LJLIL;
        }
        throw C73864Syq.LIZIZ(th);
    }

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        countDown();
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLILLLLZI = th;
        countDown();
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJI = interfaceC92693kP;
        if (this.LJLJJI) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL = t;
        countDown();
    }
}
