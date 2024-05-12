package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bzn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30607Bzn {
    public final List<C30608Bzo> LIZ = new ArrayList();

    public final String LIZ(int i, String str, String str2) {
        Object obj;
        String str3;
        if (i == 1) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C30608Bzo c30608Bzo = (C30608Bzo) next;
                if (c30608Bzo != null) {
                    obj = c30608Bzo.LJLIL;
                }
                if (o.LJ(obj, str) && o.LJ(c30608Bzo.LJLILLLLZI, str2)) {
                    obj = next;
                    break;
                }
            }
            C30608Bzo c30608Bzo2 = (C30608Bzo) obj;
            if (c30608Bzo2 != null && (str3 = c30608Bzo2.LJLJI) != null) {
                return str3;
            }
        }
        return "";
    }
}
