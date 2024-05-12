package X;

/* renamed from: X.3Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79883Bo<T> implements InterfaceC70352pT<T>, InterfaceC65462ha, InterfaceC79903Bq<T> {
    public final /* synthetic */ InterfaceC70352pT<T> LJLIL;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return this.LJLIL.collect(interfaceC64672gJ, interfaceC67352kd);
    }

    public C79883Bo(InterfaceC70352pT interfaceC70352pT) {
        this.LJLIL = interfaceC70352pT;
    }

    @Override // X.InterfaceC79903Bq
    public final InterfaceC65462ha<T> fuse(MBA mba, int i, XKI xki) {
        if ((i == 0 || i == -3) && xki == XKI.SUSPEND) {
            return this;
        }
        return new C3BZ(i, mba, xki, this);
    }
}
