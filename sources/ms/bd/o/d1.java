package ms.bd.o;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class d1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int[] iArr;
        t2 LIZ = t2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            int size = ((ArrayList) LIZ.LIZIZ).size();
            if (size > 0) {
                if (size != 1) {
                    try {
                        List<Integer> list = LIZ.LIZIZ;
                        int i2 = size - 10;
                        if (i2 <= 0) {
                            i2 = 0;
                        }
                        List subList = ((ArrayList) list).subList(i2, size);
                        iArr = new int[subList.size()];
                        for (int i3 = 0; i3 < subList.size(); i3++) {
                            iArr[i3] = ((Integer) subList.get(i3)).intValue();
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    iArr = new int[]{((Integer) ListProtector.get(LIZ.LIZIZ, 0)).intValue()};
                }
            }
            iArr = new int[0];
        }
        return iArr;
    }
}
