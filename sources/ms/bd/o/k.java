package ms.bd.o;

import X.C16880lQ;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public class k {
    public static native Object a(int i, int i2, long j, String str, Object obj);

    public static Object b(int i, int i2, long j, String str, Object obj) {
        b.a aVar = b.LIZ.get(i);
        if (aVar != null) {
            try {
                return aVar.LIZ(i, i2, j, str, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        throw new RuntimeException(C16880lQ.LLLZ((String) a(16777217, 0, 0L, "a7046e", new byte[]{Byte.MAX_VALUE, 37, 3, 67, 6, 118, 103, 86, 36, 96, 48, 60, 80, 0, 0, 124, 116, 23, 109, 109, 116}), new Object[]{Integer.valueOf(i)}));
    }
}
