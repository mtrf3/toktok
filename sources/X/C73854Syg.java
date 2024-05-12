package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Syg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73854Syg<T> extends AtomicInteger implements InterfaceC116954iR, InterfaceC92693kP {
    public final AtomicReference<InterfaceC92693kP> LJLIL = new AtomicReference<>();
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();
    public final C73861Syn LJLJI = new C73861Syn();
    public final InterfaceC73445Ss5 LJLJJI;
    public final InterfaceC116954iR<? super T> LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73857Syj.LIZJ(this.LJLILLLLZI);
        EnumC73857Syj.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLIL.get() == EnumC73857Syj.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73857Syj.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            InterfaceC116954iR<? super T> interfaceC116954iR = this.LJLJJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (getAndIncrement() == 0) {
                Throwable LIZIZ = c73861Syn.LIZIZ();
                if (LIZIZ != null) {
                    interfaceC116954iR.onError(LIZIZ);
                } else {
                    interfaceC116954iR.onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73857Syj.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            InterfaceC116954iR<? super T> interfaceC116954iR = this.LJLJJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (c73861Syn.LIZ(th)) {
                if (getAndIncrement() == 0) {
                    interfaceC116954iR.onError(c73861Syn.LIZIZ());
                    return;
                }
                return;
            }
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (!isDisposed()) {
            InterfaceC116954iR<? super T> interfaceC116954iR = this.LJLJJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (get() == 0 && compareAndSet(0, 1)) {
                interfaceC116954iR.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable LIZIZ = c73861Syn.LIZIZ();
                    if (LIZIZ != null) {
                        interfaceC116954iR.onError(LIZIZ);
                    } else {
                        interfaceC116954iR.onComplete();
                    }
                    this.LJLIL.lazySet(EnumC73857Syj.LJLIL);
                    EnumC73857Syj.LIZJ(this.LJLILLLLZI);
                }
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        C73859Syl c73859Syl = new C73859Syl(this);
        if (C78996UzQ.LJJJI(this.LJLILLLLZI, c73859Syl, C73854Syg.class)) {
            this.LJLJJL.onSubscribe(this);
            this.LJLJJI.LIZ(c73859Syl);
            C78996UzQ.LJJJI(this.LJLIL, interfaceC92693kP, C73854Syg.class);
        }
    }

    public C73854Syg(InterfaceC73445Ss5 interfaceC73445Ss5, InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLJJI = interfaceC73445Ss5;
        this.LJLJJL = interfaceC116954iR;
    }
}
