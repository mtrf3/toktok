package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q34 extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Q3D> arrayList2 = q3d.LIZIZ;
        if (arrayList2 != null) {
            Iterator<Q3D> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Q2G) it.next().LIZ).LIZ);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Q24(arrayList));
        return arrayList3;
    }
}
