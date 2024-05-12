package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54N extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54M LJLIL;
    public final /* synthetic */ C5DY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54N(C54M c54m, C5DY c5dy) {
        super(0);
        this.LJLIL = c54m;
        this.LJLILLLLZI = c5dy;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ArrayList arrayList = new ArrayList();
        List<C54T> list = this.LJLIL.LIZJ;
        C5DY c5dy = this.LJLILLLLZI;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C54T c54t = (C54T) it.next();
            if (c54t.LIZ(c5dy.LIZ)) {
                arrayList.add(c54t);
            }
        }
        ((ArrayList) this.LJLIL.LIZJ).removeAll(arrayList);
        return C76800UCe.LIZ;
    }
}
