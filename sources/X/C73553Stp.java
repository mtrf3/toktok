package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Stp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73553Stp<T> extends AtomicInteger implements InterfaceC92693kP, InterfaceC116954iR<T> {
    public static final long serialVersionUID = 8443155186132538303L;
    public final InterfaceC73442Ss2 LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> LJLJI;
    public final boolean LJLJJI;
    public InterfaceC92693kP LJLJJLL;
    public volatile boolean LJLJL;
    public final C73568Su4 LJLILLLLZI = new C73568Su4();
    public final C73318Sq2 LJLJJL = new C73318Sq2();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJL = true;
        this.LJLJJLL.dispose();
        this.LJLJJL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJLL.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable terminate = this.LJLILLLLZI.terminate();
            if (terminate != null) {
                this.LJLIL.onError(terminate);
            } else {
                this.LJLIL.onComplete();
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLILLLLZI.addThrowable(th)) {
            if (this.LJLJJI) {
                if (decrementAndGet() == 0) {
                    this.LJLIL.onError(this.LJLILLLLZI.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) <= 0) {
                return;
            }
            this.LJLIL.onError(this.LJLILLLLZI.terminate());
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        try {
            InterfaceC73445Ss5 apply = this.LJLJI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null CompletableSource");
            InterfaceC73445Ss5 interfaceC73445Ss5 = apply;
            getAndIncrement();
            C73554Stq c73554Stq = new C73554Stq(this);
            if (!this.LJLJL && this.LJLJJL.LIZ(c73554Stq)) {
                interfaceC73445Ss5.LIZ(c73554Stq);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJJLL.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73553Stp(InterfaceC73442Ss2 interfaceC73442Ss2, InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC73442Ss2;
        this.LJLJI = interfaceC48038ItG;
        this.LJLJJI = z;
        lazySet(1);
    }
}
