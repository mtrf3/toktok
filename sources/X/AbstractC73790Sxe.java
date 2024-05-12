package X;

/* renamed from: X.Sxe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73790Sxe<T, U> extends C73783SxX implements InterfaceC73812Sy0<T> {
    public static final long serialVersionUID = -5604623027276966720L;
    public final InterfaceC73740Swq<? super T> LJLJLLL;
    public final AbstractC73797Sxl<U> LJLL;
    public final InterfaceC73651SvP LJLLI;
    public long LJLLILLLL;

    @Override // X.C73783SxX, X.InterfaceC73651SvP
    public final void cancel() {
        super.cancel();
        this.LJLLI.cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        this.LJLLILLLL++;
        this.LJLJLLL.onNext(t);
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        setSubscription(interfaceC73651SvP);
    }

    public AbstractC73790Sxe(C73843SyV c73843SyV, AbstractC73797Sxl abstractC73797Sxl, C73787Sxb c73787Sxb) {
        super(false);
        this.LJLJLLL = c73843SyV;
        this.LJLL = abstractC73797Sxl;
        this.LJLLI = c73787Sxb;
    }
}
