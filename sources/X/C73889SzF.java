package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73889SzF<T, U> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 1418547743690811973L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();
    public final C73889SzF<T, U>.a LJLJI = new a();
    public final C73568Su4 LJLJJI = new C73568Su4();

    /* renamed from: X.SzF$a */
    /* loaded from: classes13.dex */
    public final class a extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<U> {
        public static final long serialVersionUID = -8693423678067375039L;

        @Override // X.InterfaceC116954iR
        public final void onComplete() {
            C73889SzF c73889SzF = C73889SzF.this;
            EnumC73418Sre.dispose(c73889SzF.LJLILLLLZI);
            C17N.LJJIL(c73889SzF.LJLIL, c73889SzF, c73889SzF.LJLJJI);
        }

        public a() {
        }

        @Override // X.InterfaceC116954iR
        public final void onError(Throwable th) {
            C73889SzF c73889SzF = C73889SzF.this;
            EnumC73418Sre.dispose(c73889SzF.LJLILLLLZI);
            C17N.LJJIZ(c73889SzF.LJLIL, th, c73889SzF, c73889SzF.LJLJJI);
        }

        @Override // X.InterfaceC116954iR
        public final void onNext(U u) {
            EnumC73418Sre.dispose(this);
            C73889SzF c73889SzF = C73889SzF.this;
            EnumC73418Sre.dispose(c73889SzF.LJLILLLLZI);
            C17N.LJJIL(c73889SzF.LJLIL, c73889SzF, c73889SzF.LJLJJI);
        }

        @Override // X.InterfaceC116954iR
        public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
            EnumC73418Sre.setOnce(this, interfaceC92693kP);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        EnumC73418Sre.dispose(this.LJLJI);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(this.LJLILLLLZI.get());
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLJI);
        C17N.LJJIL(this.LJLIL, this, this.LJLJJI);
    }

    public C73889SzF(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        EnumC73418Sre.dispose(this.LJLJI);
        C17N.LJJIZ(this.LJLIL, th, this, this.LJLJJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        C17N.LJJJ(this.LJLIL, t, this, this.LJLJJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLILLLLZI, interfaceC92693kP);
    }
}
