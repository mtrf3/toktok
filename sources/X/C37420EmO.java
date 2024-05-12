package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.EmO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37420EmO {
    public static final C37420EmO LIZIZ = new C37420EmO();
    public static final java.util.Set<InterfaceC37421EmP> LIZJ = new HashSet();
    public C37420EmO LIZ;

    public void LIZ(C37499Enf c37499Enf) {
        Iterator it = ((HashSet) LIZJ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC37421EmP) it.next()).LIZ()) {
                return;
            }
        }
        C37420EmO c37420EmO = this.LIZ;
        if (c37420EmO != null) {
            c37420EmO.LIZ(c37499Enf);
        }
    }
}
