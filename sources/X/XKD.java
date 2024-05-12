package X;

/* loaded from: classes16.dex */
public final class XKD<E> extends C84644XJw<E> {
    public final InterfaceC88472Yns<E, C76800UCe> LJLJJLL;

    @Override // X.XK1
    public final void LJJIIZI() {
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        E e = this.LJLJJI;
        MBA context = this.LJLJJL.getContext();
        C46108I7s LIZLLL = C46104I7o.LIZLLL(interfaceC88472Yns, e, null);
        if (LIZLLL == null) {
            return;
        }
        C78540Us4.LJIIJ(context, LIZLLL);
    }

    @Override // X.C84629XJh
    public final boolean LJIL() {
        if (!super.LJIL()) {
            return false;
        }
        LJJIIZI();
        return true;
    }

    public XKD(Object obj, XKS xks, InterfaceC88472Yns interfaceC88472Yns) {
        super(obj, xks);
        this.LJLJJLL = interfaceC88472Yns;
    }
}
