package X;

import java.util.NoSuchElementException;

/* renamed from: X.Ssj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73485Ssj<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final T LJLJI;
    public final boolean LJLJJI;
    public InterfaceC92693kP LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJL.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLJL) {
            this.LJLJL = true;
            T t = this.LJLJI;
            if (t == null) {
                if (this.LJLJJI) {
                    this.LJLIL.onError(new NoSuchElementException());
                    return;
                }
            } else {
                this.LJLIL.onNext(t);
            }
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJL) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJL = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJL) {
            return;
        }
        long j = this.LJLJJLL;
        if (j == this.LJLILLLLZI) {
            this.LJLJL = true;
            this.LJLJJL.dispose();
            this.LJLIL.onNext(t);
            this.LJLIL.onComplete();
            return;
        }
        this.LJLJJLL = j + 1;
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJL, interfaceC92693kP)) {
            this.LJLJJL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73485Ssj(InterfaceC116954iR<? super T> interfaceC116954iR, long j, T t, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = j;
        this.LJLJI = t;
        this.LJLJJI = z;
    }
}
