package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2IK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IK {
    public final List<C2LB> LIZ = new ArrayList();

    public final void LIZ(C2LB c2lb) {
        if (!((ArrayList) this.LIZ).contains(c2lb)) {
            ((ArrayList) this.LIZ).add(c2lb);
        }
    }

    public final void LIZIZ(String str) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((C2LB) it.next()).LJLJJLL = str;
        }
    }
}
