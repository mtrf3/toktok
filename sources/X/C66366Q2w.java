package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Q2w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66366Q2w extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        Q26 q26 = new Q26();
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        Iterator it = LIZIZ.iterator();
        while (it.hasNext()) {
            ((Q20) it.next()).LIZ(q26.LIZJ);
        }
        Iterator it2 = LIZIZ2.iterator();
        while (it2.hasNext()) {
            ((Q20) it2.next()).LIZ(q26.LIZLLL);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(q26);
        return arrayList;
    }
}
