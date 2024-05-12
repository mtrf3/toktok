package X;

/* renamed from: X.Sya, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73848Sya<T> implements InterfaceC92693kP, InterfaceC73852Sye<Object> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final C73849Syb<T> LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public C73846SyY<Object> LJLJJL;
    public boolean LJLJJLL;
    public volatile boolean LJLJL;
    public long LJLJLJ;

    public final void LIZ() {
        C73846SyY<Object> c73846SyY;
        while (!this.LJLJL) {
            synchronized (this) {
                c73846SyY = this.LJLJJL;
                if (c73846SyY == null) {
                    this.LJLJJI = false;
                    return;
                }
                this.LJLJJL = null;
            }
            c73846SyY.LIZJ(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJL) {
            this.LJLJL = true;
            this.LJLILLLLZI.LJL(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC73852Sye, X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        if (this.LJLJL || EnumC73845SyX.accept(obj, this.LJLIL)) {
            return true;
        }
        return false;
    }

    public C73848Sya(InterfaceC116954iR<? super T> interfaceC116954iR, C73849Syb<T> c73849Syb) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = c73849Syb;
    }

    public final void LIZIZ(long j, Object obj) {
        if (this.LJLJL) {
            return;
        }
        if (!this.LJLJJLL) {
            synchronized (this) {
                if (this.LJLJL) {
                    return;
                }
                if (this.LJLJLJ == j) {
                    return;
                }
                if (this.LJLJJI) {
                    C73846SyY<Object> c73846SyY = this.LJLJJL;
                    if (c73846SyY == null) {
                        c73846SyY = new C73846SyY<>();
                        this.LJLJJL = c73846SyY;
                    }
                    c73846SyY.LIZIZ(obj);
                    return;
                }
                this.LJLJI = true;
                this.LJLJJLL = true;
            }
        }
        test(obj);
    }
}
