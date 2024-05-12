package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class C4Q extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C4Q LJLIL = new C4Q();

    public C4Q() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Iterator it = ((ArrayList) C4P.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC65784Pro) it.next()).invoke();
        }
        return C76800UCe.LIZ;
    }
}
