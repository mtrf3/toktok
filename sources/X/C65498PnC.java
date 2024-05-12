package X;

import java.util.Iterator;

/* renamed from: X.PnC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65498PnC extends AbstractC65540Pns<Object> {
    public final /* synthetic */ Iterable LJLILLLLZI;
    public final /* synthetic */ InterfaceC65644PpY LJLJI;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.LJLILLLLZI.iterator();
        InterfaceC65644PpY interfaceC65644PpY = this.LJLJI;
        interfaceC65644PpY.getClass();
        return new C65643PpX(it, interfaceC65644PpY);
    }

    public C65498PnC(AbstractC65590Pog abstractC65590Pog) {
        C65497PnB c65497PnB = C65484Pmy.LIZ;
        this.LJLILLLLZI = abstractC65590Pog;
        this.LJLJI = c65497PnB;
    }
}
