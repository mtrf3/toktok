package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q2x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66367Q2x extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        C66342Q1y c66342Q1y = (C66342Q1y) ListProtector.get(LIZIZ, 0);
        Object obj = ((Q24) ListProtector.get(LIZIZ2, 0)).LIZJ;
        Q25 q25 = new Q25();
        c66341Q1x.LIZLLL.add(q25);
        if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                Q20 LIZ = c66341Q1x.LIZ(obj2);
                c66342Q1y.LJI(obj2, LIZ);
                LIZ.LIZ(q25);
            }
        } else if (obj instanceof Object[]) {
            for (Object obj3 : (Object[]) obj) {
                Q20 LIZ2 = c66341Q1x.LIZ(obj3);
                c66342Q1y.LJI(obj3, LIZ2);
                LIZ2.LIZ(q25);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(q25);
        return arrayList;
    }
}
