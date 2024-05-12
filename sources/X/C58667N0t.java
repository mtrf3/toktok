package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N0t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58667N0t {
    public final java.util.Map<String, C40197Fq5> LIZ = new HashMap();

    public C58667N0t(List<C40197Fq5> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            LIZ((C40197Fq5) it.next());
        }
    }

    public final void LIZ(C40197Fq5 c40197Fq5) {
        if (c40197Fq5 == null) {
            return;
        }
        String str = c40197Fq5.LIZ;
        this.LIZ.get(str);
        this.LIZ.put(str, c40197Fq5);
    }

    public final C40197Fq5 LIZIZ(String str) {
        C40197Fq5 c40197Fq5 = (C40197Fq5) ((HashMap) this.LIZ).get(str);
        if (c40197Fq5 != null) {
            return c40197Fq5;
        }
        throw new RuntimeException(i0.LJFF("No BehaviorController defined for class ", str));
    }
}
