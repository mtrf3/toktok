package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PtK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65878PtK {
    public static final void LIZ(Object obj, Object obj2) {
        C65877PtJ c65877PtJ = (C65877PtJ) obj;
        if (c65877PtJ.isEmpty()) {
            return;
        }
        Iterator it = c65877PtJ.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
