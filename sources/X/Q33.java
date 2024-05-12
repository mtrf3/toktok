package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class Q33 extends Q3B {
    public abstract Q20 LIZIZ(Collection<String> collection);

    @Override // X.Q3B
    public final List<Q20> LIZ(C66341Q1x c66341Q1x, Q3D q3d, int i) {
        Collection<String> collection;
        List LIZIZ = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 0), i);
        List LIZIZ2 = C13T.LIZIZ(c66341Q1x, (Q3D) ListProtector.get(q3d.LIZIZ, 1), i);
        Q20 q20 = (Q20) ListProtector.get(LIZIZ, 0);
        Q24 q24 = (Q24) ListProtector.get(LIZIZ2, 0);
        Object obj = q24.LIZJ;
        if (obj instanceof String) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(q24.LIZJ);
            collection = arrayList;
        } else if (obj instanceof String[]) {
            collection = Arrays.asList((Object[]) obj);
        } else if (obj instanceof Collection) {
            collection = (Collection) obj;
        } else {
            throw new IllegalArgumentException();
        }
        Q20 LIZIZ3 = LIZIZ(collection);
        q20.LIZ(LIZIZ3);
        return Collections.singletonList(LIZIZ3);
    }
}
