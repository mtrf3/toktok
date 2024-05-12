package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54Q extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54P LJLIL;
    public final /* synthetic */ C5DY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54Q(C54P c54p, C5DY c5dy) {
        super(0);
        this.LJLIL = c54p;
        this.LJLILLLLZI = c5dy;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ArrayList arrayList = new ArrayList();
        List<C54S> list = this.LJLIL.LJ;
        C5DY c5dy = this.LJLILLLLZI;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C54S c54s = (C54S) it.next();
            if (c54s.LIZ(c5dy.LIZIZ, c5dy.LIZ)) {
                arrayList.add(c54s);
            }
        }
        ((ArrayList) this.LJLIL.LJ).removeAll(arrayList);
        return C76800UCe.LIZ;
    }
}
