package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TcV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75027TcV {
    public static int LIZ = 1;
    public static final List<C75029TcX> LIZIZ;
    public static C73495Sst LIZJ;
    public static long LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        arrayList.add(new C75029TcX(1, 2));
        arrayList.add(new C75029TcX(2, 1));
        arrayList.add(new C75029TcX(2, 3));
        arrayList.add(new C75029TcX(3, 1));
    }

    public static boolean LIZ() {
        int i = LIZ;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i) {
        List<C75029TcX> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C75029TcX) next).LJLIL == LIZ) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((C75029TcX) next2).LJLILLLLZI == i) {
                    if (next2 != null) {
                        C012403c.LJ("transitionTo ", i, "ReservationStateMachine");
                        LIZ = i;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
