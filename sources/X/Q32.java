package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q32 extends Q3B {
    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        C66342Q1y c66342Q1y = (C66342Q1y) ListProtector.get(LIZIZ, 0);
        Q24 q24 = (Q24) ListProtector.get(LIZIZ2, 0);
        Object obj = q24.LIZJ;
        Q25 q25 = new Q25();
        c66341Q1x.LIZLLL.add(q25);
        c66342Q1y.LJI(obj, q24);
        q24.LIZ(q25);
        ArrayList arrayList = new ArrayList();
        arrayList.add(q25);
        return arrayList;
    }
}
