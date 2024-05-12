package X;

/* renamed from: X.Suo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73614Suo<T> implements InterfaceC116954iR<T> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC48038ItG<? super Throwable, ? extends InterfaceC115714gR<? extends T>> LJLILLLLZI;
    public final boolean LJLJI;
    public final C73616Suq LJLJJI = new C73616Suq();
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        this.LJLJJL = true;
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJL) {
            if (this.LJLJJLL) {
                C73548Stk.LIZIZ(th);
                return;
            } else {
                this.LJLIL.onError(th);
                return;
            }
        }
        this.LJLJJL = true;
        if (this.LJLJI && !(th instanceof Exception)) {
            this.LJLIL.onError(th);
            return;
        }
        try {
            InterfaceC115714gR<? extends T> apply = this.LJLILLLLZI.apply(th);
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.LJLIL.onError(nullPointerException);
                return;
            }
            apply.LIZ(this);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLJJI.replace(interfaceC92693kP);
    }

    public C73614Suo(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC48038ItG<? super Throwable, ? extends InterfaceC115714gR<? extends T>> interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = z;
    }
}
