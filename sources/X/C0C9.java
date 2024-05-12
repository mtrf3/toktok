package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0C9, reason: invalid class name */
/* loaded from: classes.dex */
public class C0C9 {
    public final List<C0CC> LIZ = new CopyOnWriteArrayList();

    public final List LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            it.next().getClass();
            arrayList.add(C0CC.LIZ);
        }
        return arrayList;
    }

    public static void LIZIZ(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0CB) it.next()).LIZ();
        }
    }
}
