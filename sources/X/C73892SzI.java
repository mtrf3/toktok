package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73892SzI<T> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 802743776666017014L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final AbstractC73851Syd<Throwable> LJLJJI;
    public final InterfaceC115714gR<T> LJLJL;
    public volatile boolean LJLJLJ;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger();
    public final C73568Su4 LJLJI = new C73568Su4();
    public final C73892SzI<T>.a LJLJJL = new a();
    public final AtomicReference<InterfaceC92693kP> LJLJJLL = new AtomicReference<>();

    /* renamed from: X.SzI$a */
    /* loaded from: classes13.dex */
    public final class a extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<Object> {
        public static final long serialVersionUID = 3254781284376480842L;

        @Override // X.InterfaceC116954iR
        public final void onComplete() {
            C73892SzI c73892SzI = C73892SzI.this;
            EnumC73418Sre.dispose(c73892SzI.LJLJJLL);
            C17N.LJJIL(c73892SzI.LJLIL, c73892SzI, c73892SzI.LJLJI);
        }

        public a() {
        }

        @Override // X.InterfaceC116954iR
        public final void onError(Throwable th) {
            C73892SzI c73892SzI = C73892SzI.this;
            EnumC73418Sre.dispose(c73892SzI.LJLJJLL);
            C17N.LJJIZ(c73892SzI.LJLIL, th, c73892SzI, c73892SzI.LJLJI);
        }

        @Override // X.InterfaceC116954iR
        public final void onNext(Object obj) {
            C73892SzI.this.LIZ();
        }

        @Override // X.InterfaceC116954iR
        public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
            EnumC73418Sre.setOnce(this, interfaceC92693kP);
        }
    }

    public final void LIZ() {
        if (this.LJLILLLLZI.getAndIncrement() != 0) {
            return;
        }
        while (!isDisposed()) {
            if (!this.LJLJLJ) {
                this.LJLJLJ = true;
                this.LJLJL.LIZ(this);
            }
            if (this.LJLILLLLZI.decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLJJLL);
        EnumC73418Sre.dispose(this.LJLJJL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(this.LJLJJLL.get());
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLJJL);
        C17N.LJJIL(this.LJLIL, this, this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        EnumC73418Sre.replace(this.LJLJJLL, null);
        this.LJLJLJ = false;
        this.LJLJJI.onNext(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        C17N.LJJJ(this.LJLIL, t, this, this.LJLJI);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this.LJLJJLL, interfaceC92693kP);
    }

    public C73892SzI(InterfaceC116954iR<? super T> interfaceC116954iR, AbstractC73851Syd<Throwable> abstractC73851Syd, InterfaceC115714gR<T> interfaceC115714gR) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJJI = abstractC73851Syd;
        this.LJLJL = interfaceC115714gR;
    }
}
