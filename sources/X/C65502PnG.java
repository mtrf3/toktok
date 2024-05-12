package X;

import java.util.Iterator;

/* renamed from: X.PnG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65502PnG extends AbstractC65540Pns<Object> {
    public final /* synthetic */ Iterable LJLILLLLZI;
    public final /* synthetic */ InterfaceC65503PnH LJLJI;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.LJLILLLLZI.iterator();
        InterfaceC65503PnH interfaceC65503PnH = this.LJLJI;
        it.getClass();
        interfaceC65503PnH.getClass();
        return new C65553Po5(it, interfaceC65503PnH);
    }

    public C65502PnG(Iterable iterable, InterfaceC65503PnH interfaceC65503PnH) {
        this.LJLILLLLZI = iterable;
        this.LJLJI = interfaceC65503PnH;
    }
}
