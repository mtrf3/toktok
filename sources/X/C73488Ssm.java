package X;

import java.util.NoSuchElementException;

/* renamed from: X.Ssm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73488Ssm<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final T LJLJI;
    public InterfaceC92693kP LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            T t = this.LJLJI;
            if (t != null) {
                this.LJLIL.onSuccess(t);
            } else {
                this.LJLIL.onError(new NoSuchElementException());
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJLL) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJLL = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJLL) {
            return;
        }
        long j = this.LJLJJL;
        if (j == this.LJLILLLLZI) {
            this.LJLJJLL = true;
            this.LJLJJI.dispose();
            this.LJLIL.onSuccess(t);
            return;
        }
        this.LJLJJL = j + 1;
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJI, interfaceC92693kP)) {
            this.LJLJJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73488Ssm(InterfaceC73463SsN<? super T> interfaceC73463SsN, long j, T t) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = j;
        this.LJLJI = t;
    }
}
