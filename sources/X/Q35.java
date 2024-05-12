package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q35 extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        C66342Q1y c66342Q1y = (C66342Q1y) ListProtector.get(LIZIZ, 0);
        Q24 q24 = (Q24) ListProtector.get(LIZIZ2, 0);
        c66342Q1y.LJI(q24.LIZJ, q24);
        ArrayList arrayList = new ArrayList();
        arrayList.add(q24);
        return arrayList;
    }
}
