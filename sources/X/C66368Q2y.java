package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q2y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66368Q2y extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        C66342Q1y c66342Q1y = (C66342Q1y) ListProtector.get(LIZIZ, 0);
        c66342Q1y.LJ = true;
        Object obj = ((Q24) ListProtector.get(LIZIZ2, 0)).LIZJ;
        ArrayList arrayList = new ArrayList();
        if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                Q20 LIZ = c66341Q1x.LIZ(obj2);
                c66342Q1y.LJI(obj2, LIZ);
                arrayList.add(LIZ);
            }
        } else if (obj instanceof Object[]) {
            for (Object obj3 : (Object[]) obj) {
                Q20 LIZ2 = c66341Q1x.LIZ(obj3);
                c66342Q1y.LJI(obj3, LIZ2);
                arrayList.add(LIZ2);
            }
        }
        return arrayList;
    }
}
