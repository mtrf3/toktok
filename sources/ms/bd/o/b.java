package ms.bd.o;

import X.C16880lQ;
import android.util.SparseArray;

/* loaded from: classes7.dex */
public final class b {
    public static final SparseArray<a> LIZ = new SparseArray<>();

    /* loaded from: classes7.dex */
    public static abstract class a {
        public Object LIZ(int i, int i2, long j, String str, Object obj) {
            return LIZIZ(j, i2, str, obj);
        }

        public Object LIZIZ(long j, int i, String str, Object obj) {
            return null;
        }
    }

    public static void LIZ(int i, a aVar) {
        SparseArray<a> sparseArray = LIZ;
        a aVar2 = sparseArray.get(i);
        if (aVar2 != null) {
            throw new RuntimeException(C16880lQ.LLLZ((String) k.a(16777217, 0, 0L, "c7a1df", new byte[]{55, 38, 82, 77, 90, 117, 32, 20, 53, 100, 124, 117, 0, 64, 92, 120, 115, 2, 53, 115, 60}), new Object[]{aVar2.toString()}));
        }
        sparseArray.put(i, aVar);
    }
}
