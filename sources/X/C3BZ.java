package X;

/* renamed from: X.3BZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BZ<T> extends AbstractC79763Bc<T, T> {
    @Override // X.AbstractC79813Bh
    public final InterfaceC65462ha<T> dropChannelOperators() {
        return (InterfaceC65462ha<T>) this.LJLIL;
    }

    @Override // X.AbstractC79763Bc
    public final Object LIZLLL(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object collect = this.LJLIL.collect(interfaceC64672gJ, interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public final AbstractC79813Bh<T> create(MBA mba, int i, XKI xki) {
        return new C3BZ(i, mba, xki, this.LJLIL);
    }

    public C3BZ(int i, MBA mba, XKI xki, InterfaceC65462ha interfaceC65462ha) {
        super(i, mba, xki, interfaceC65462ha);
    }

    public C3BZ(InterfaceC65462ha interfaceC65462ha, XKW xkw, int i, XKI xki, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? MBB.INSTANCE : xkw, (i2 & 8) != 0 ? XKI.SUSPEND : xki, interfaceC65462ha);
    }
}
