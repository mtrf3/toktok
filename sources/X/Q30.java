package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q30 extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        Q25 q25 = new Q25();
        c66341Q1x.LIZLLL.add(q25);
        Iterator it = LIZIZ.iterator();
        while (it.hasNext()) {
            ((Q20) it.next()).LIZ(q25);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(q25);
        return arrayList;
    }
}
