package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73773SxN<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -5417183359794346637L;
    public final InterfaceC58210Msw<T> LJLIL;
    public final int LJLILLLLZI;
    public InterfaceC73570Su6<T> LJLJI;
    public volatile boolean LJLJJI;
    public int LJLJJL;

    public void setDone() {
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        C73771SxL c73771SxL = (C73771SxL) this.LJLIL;
        c73771SxL.getClass();
        setDone();
        c73771SxL.LIZIZ();
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public int fusionMode() {
        return this.LJLJJL;
    }

    public boolean isDone() {
        return this.LJLJJI;
    }

    public InterfaceC73570Su6<T> queue() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC116954iR
    public void onError(Throwable th) {
        C73771SxL c73771SxL = (C73771SxL) this.LJLIL;
        if (c73771SxL.LJLJJLL.addThrowable(th)) {
            if (c73771SxL.LJLJJL == EnumC73710SwM.IMMEDIATE) {
                c73771SxL.LJLJLLL.dispose();
            }
            setDone();
            c73771SxL.LIZIZ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
        if (this.LJLJJL == 0) {
            C73771SxL c73771SxL = (C73771SxL) this.LJLIL;
            c73771SxL.getClass();
            queue().offer(t);
            c73771SxL.LIZIZ();
            return;
        }
        ((C73771SxL) this.LJLIL).LIZIZ();
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        InterfaceC73570Su6<T> c73913Szd;
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(3);
                if (requestFusion == 1) {
                    this.LJLJJL = requestFusion;
                    this.LJLJI = interfaceC73571Su7;
                    this.LJLJJI = true;
                    C73771SxL c73771SxL = (C73771SxL) this.LJLIL;
                    c73771SxL.getClass();
                    setDone();
                    c73771SxL.LIZIZ();
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLJJL = requestFusion;
                    this.LJLJI = interfaceC73571Su7;
                    return;
                }
            }
            int i = -this.LJLILLLLZI;
            if (i < 0) {
                c73913Szd = new C73912Szc<>(-i);
            } else {
                c73913Szd = new C73913Szd<>(i);
            }
            this.LJLJI = c73913Szd;
        }
    }

    public C73773SxN(InterfaceC58210Msw<T> interfaceC58210Msw, int i) {
        this.LJLIL = interfaceC58210Msw;
        this.LJLILLLLZI = i;
    }
}
