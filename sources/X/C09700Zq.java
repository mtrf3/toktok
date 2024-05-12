package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09700Zq {
    public static C09700Zq LIZIZ;
    public final C09690Zp LIZ = new C09690Zp();

    public static C09700Zq LIZ() {
        if (LIZIZ == null) {
            synchronized (C09700Zq.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C09700Zq();
                }
            }
        }
        return LIZIZ;
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A76 a76 = (A76) it.next();
            C31726Cck c31726Cck = new C31726Cck();
            c31726Cck.LIZ = a76;
            arrayList.add(c31726Cck);
        }
        return arrayList;
    }

    public final List<C31726Cck> LIZIZ(EnumC31730Cco enumC31730Cco) {
        C09690Zp c09690Zp = this.LIZ;
        c09690Zp.LIZ();
        return LIZLLL((List) ((HashMap) c09690Zp.LIZIZ).get(enumC31730Cco));
    }

    public final List<C31726Cck> LIZJ(EnumC30736C4m enumC30736C4m) {
        C09690Zp c09690Zp = this.LIZ;
        c09690Zp.LIZ();
        return LIZLLL((List) ((HashMap) c09690Zp.LIZ).get(enumC30736C4m));
    }
}
