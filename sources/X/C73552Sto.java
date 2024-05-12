package X;

/* renamed from: X.Sto, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73552Sto<T> extends AbstractC73555Str<T> implements InterfaceC116954iR<T> {
    public static final long serialVersionUID = 8443155186132538303L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> LJLJI;
    public final boolean LJLJJI;
    public InterfaceC92693kP LJLJJLL;
    public volatile boolean LJLJL;
    public final C73568Su4 LJLILLLLZI = new C73568Su4();
    public final C73318Sq2 LJLJJL = new C73318Sq2();

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final void clear() {
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJL = true;
        this.LJLJJLL.dispose();
        this.LJLJJL.dispose();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return true;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final T poll() {
        return null;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return i & 2;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
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
            C73551Stn c73551Stn = new C73551Stn(this);
            if (!this.LJLJL && this.LJLJJL.LIZ(c73551Stn)) {
                interfaceC73445Ss5.LIZ(c73551Stn);
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

    public C73552Sto(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJI = interfaceC48038ItG;
        this.LJLJJI = z;
        lazySet(1);
    }
}
