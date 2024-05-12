package X;

import Y.IDhS68S0200000_5;

/* renamed from: X.Sxc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73788Sxc<T> extends AbstractC73739Swp<T, T> {
    public final InterfaceC48038ItG<? super AbstractC73745Swv<Throwable>, ? extends InterfaceC73650SvO<?>> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.SyU] */
    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        C73843SyV c73843SyV = new C73843SyV(interfaceC73740Swq);
        C73791Sxf c73791Sxf = new C73791Sxf();
        if (!(c73791Sxf instanceof C73842SyU)) {
            c73791Sxf = new C73842SyU(c73791Sxf);
        }
        try {
            InterfaceC73650SvO<?> apply = this.LJLJI.apply(c73791Sxf);
            C73320Sq4.LIZ(apply, "handler returned a null Publisher");
            InterfaceC73650SvO<?> interfaceC73650SvO = apply;
            C73787Sxb c73787Sxb = new C73787Sxb(this.LJLILLLLZI);
            C73789Sxd c73789Sxd = new C73789Sxd(c73843SyV, c73791Sxf, c73787Sxb);
            c73787Sxb.LJLJJI = c73789Sxd;
            interfaceC73740Swq.onSubscribe(c73789Sxd);
            interfaceC73650SvO.subscribe(c73787Sxb);
            c73787Sxb.onNext(0);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73747Swx.error(th, interfaceC73740Swq);
        }
    }

    public C73788Sxc(AbstractC73745Swv abstractC73745Swv, IDhS68S0200000_5 iDhS68S0200000_5) {
        super(abstractC73745Swv);
        this.LJLJI = iDhS68S0200000_5;
    }
}
