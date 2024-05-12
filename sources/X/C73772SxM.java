package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73772SxM<T, U> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<U> {
    public static final long serialVersionUID = -4606175640614850599L;
    public final long LJLIL;
    public final C73770SxK<T, U> LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile InterfaceC73570Su6<U> LJLJJI;
    public int LJLJJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLJI = true;
        this.LJLILLLLZI.LIZJ();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLILLLLZI.LJLJLJ.addThrowable(th)) {
            C73770SxK<T, U> c73770SxK = this.LJLILLLLZI;
            if (!c73770SxK.LJLJI) {
                c73770SxK.LIZIZ();
            }
            this.LJLJI = true;
            this.LJLILLLLZI.LIZJ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(U u) {
        if (this.LJLJJL == 0) {
            C73770SxK<T, U> c73770SxK = this.LJLILLLLZI;
            if (c73770SxK.get() == 0 && c73770SxK.compareAndSet(0, 1)) {
                c73770SxK.LJLIL.onNext(u);
                if (c73770SxK.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC73570Su6 interfaceC73570Su6 = this.LJLJJI;
                if (interfaceC73570Su6 == null) {
                    interfaceC73570Su6 = new C73912Szc(c73770SxK.LJLJJL);
                    this.LJLJJI = interfaceC73570Su6;
                }
                interfaceC73570Su6.offer(u);
                if (c73770SxK.getAndIncrement() != 0) {
                    return;
                }
            }
            c73770SxK.LIZLLL();
            return;
        }
        this.LJLILLLLZI.LIZJ();
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP) && (interfaceC92693kP instanceof InterfaceC73558Stu)) {
            InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
            int requestFusion = interfaceC73571Su7.requestFusion(7);
            if (requestFusion == 1) {
                this.LJLJJL = requestFusion;
                this.LJLJJI = interfaceC73571Su7;
                this.LJLJI = true;
                this.LJLILLLLZI.LIZJ();
                return;
            }
            if (requestFusion == 2) {
                this.LJLJJL = requestFusion;
                this.LJLJJI = interfaceC73571Su7;
            }
        }
    }

    public C73772SxM(C73770SxK<T, U> c73770SxK, long j) {
        this.LJLIL = j;
        this.LJLILLLLZI = c73770SxK;
    }
}
