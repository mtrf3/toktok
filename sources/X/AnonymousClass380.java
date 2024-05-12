package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.380, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass380 {
    public static void LIZ(InterfaceC789137v interfaceC789137v, List<C787637g> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "users");
        Iterator<C787637g> it = list.iterator();
        while (it.hasNext()) {
            C789337x c789337x = it.next().LIZIZ;
            if (c789337x != null) {
                LJ.add(c789337x);
            }
        }
        interfaceC789137v.LIZLLL(LJ);
        ArrayList arrayList = new ArrayList();
        Iterator<C787637g> it2 = list.iterator();
        while (it2.hasNext()) {
            C789437y c789437y = it2.next().LIZLLL;
            if (c789437y != null) {
                arrayList.add(c789437y);
            }
        }
        interfaceC789137v.LJII(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<C787637g> it3 = list.iterator();
        while (it3.hasNext()) {
            C789537z c789537z = it3.next().LIZJ;
            if (c789537z != null) {
                arrayList2.add(c789537z);
            }
        }
        interfaceC789137v.LIZJ(arrayList2);
    }
}
