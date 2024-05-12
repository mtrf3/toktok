package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Sxg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73792Sxg<T> extends AbstractC73743Swt<T> {
    public static final long serialVersionUID = -4896760517184205454L;
    public final /* synthetic */ C73791Sxf LJLIL;

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        if (this.LJLIL.LJLJLJ) {
            return;
        }
        this.LJLIL.LJLJLJ = true;
        Runnable andSet = this.LJLIL.LJLJI.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        C73791Sxf c73791Sxf = this.LJLIL;
        if (!c73791Sxf.LJLLILLLL && c73791Sxf.LJLL.getAndIncrement() == 0) {
            this.LJLIL.LJLILLLLZI.clear();
            this.LJLIL.LJLJL.lazySet(null);
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLIL.LJLILLLLZI.clear();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLIL.LJLILLLLZI.isEmpty();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final T poll() {
        return this.LJLIL.LJLILLLLZI.poll();
    }

    public C73792Sxg(C73791Sxf c73791Sxf) {
        this.LJLIL = c73791Sxf;
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLIL.LJLLI, j);
            this.LJLIL.LJIILLIIL();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LJLIL.LJLLILLLL = true;
            return 2;
        }
        return 0;
    }
}
