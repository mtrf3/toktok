package X;

/* loaded from: classes16.dex */
public class XKO<E> extends XKN<E> implements C3CK<E> {
    @Override // X.C3CK
    public final XKO getChannel() {
        return this;
    }

    @Override // X.XKZ, kotlinx.coroutines.JobSupport, X.InterfaceC79150V4o
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // X.XKZ
    public final void LJJZZI(C76800UCe c76800UCe) {
        this.LJLJI.LJJIFFI(null);
    }

    public XKO(MBA mba, XK4 xk4) {
        super(mba, xk4);
    }

    @Override // X.XKZ
    public final void LJJZ(Throwable th, boolean z) {
        if (!this.LJLJI.LJJIFFI(th) && !z) {
            C78540Us4.LJIIJ(this.LJLILLLLZI, th);
        }
    }
}
