package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zc5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90289Zc5 {
    public static final void LIZ(Object obj, Object obj2) {
        C90283Zbz c90283Zbz = (C90283Zbz) obj;
        if (c90283Zbz.isEmpty()) {
            return;
        }
        Iterator it = c90283Zbz.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
