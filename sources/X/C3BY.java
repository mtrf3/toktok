package X;

/* renamed from: X.3BY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BY<T, R> extends AbstractC79763Bc<T, R> {
    public final InterfaceC88473Ynt<InterfaceC64672gJ<? super R>, T, InterfaceC67352kd<? super C76800UCe>, Object> LJLILLLLZI;

    @Override // X.AbstractC79763Bc
    public final Object LIZLLL(InterfaceC64672gJ<? super R> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C3BV c3bv = new C3BV(this, interfaceC64672gJ, null);
        C79843Bk c79843Bk = new C79843Bk(interfaceC67352kd, interfaceC67352kd.getContext());
        Object LJJJIL = C78555UsJ.LJJJIL(c79843Bk, c79843Bk, c3bv);
        if (LJJJIL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJJJIL;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public final AbstractC79813Bh<R> create(MBA mba, int i, XKI xki) {
        return new C3BY(this.LJLILLLLZI, this.LJLIL, mba, i, xki);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3BY(InterfaceC88473Ynt<? super InterfaceC64672gJ<? super R>, ? super T, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC65462ha<? extends T> interfaceC65462ha, MBA mba, int i, XKI xki) {
        super(i, mba, xki, interfaceC65462ha);
        this.LJLILLLLZI = interfaceC88473Ynt;
    }
}
