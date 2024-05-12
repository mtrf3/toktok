package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sut, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73619Sut<T> extends AtomicInteger implements InterfaceC116954iR<T> {
    public static final long serialVersionUID = -7098360935104053232L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final C73616Suq LJLILLLLZI;
    public final InterfaceC115714gR<? extends T> LJLJI;
    public long LJLJJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        long j = this.LJLJJI;
        if (j != Long.MAX_VALUE) {
            this.LJLJJI = j - 1;
        }
        if (j != 0) {
            LIZ();
        } else {
            this.LJLIL.onComplete();
        }
    }

    public final void LIZ() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.LJLILLLLZI.isDisposed()) {
                this.LJLJI.LIZ(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI.replace(interfaceC92693kP);
    }

    public C73619Sut(InterfaceC116954iR<? super T> interfaceC116954iR, long j, C73616Suq c73616Suq, InterfaceC115714gR<? extends T> interfaceC115714gR) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = c73616Suq;
        this.LJLJI = interfaceC115714gR;
        this.LJLJJI = j;
    }
}
