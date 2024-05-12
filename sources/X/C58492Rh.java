package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58492Rh implements InterfaceC72642tA<C50420Jqa> {
    public final List<InterfaceC88472Yns<C50420Jqa, C76800UCe>> LJLIL = new ArrayList();

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(c50420Jqa);
        }
    }
}
