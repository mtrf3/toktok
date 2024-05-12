package ms.bd.o;

import X.C16880lQ;
import android.content.Intent;
import android.content.IntentFilter;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class e1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, t2.LIZ(a.LIZIZ.LIZ).LIZ, new IntentFilter((String) k.a(16777217, 0, 0L, "172dae", new byte[]{33, 59, 69, 2, 81, 123, 54, 88, 106, 58, 52, 48, 79, 4, 16, 115, 49, 2, 106, 59, 46, 123, 99, 49, 106, 70, 23, 36, 90, 11, 3, 29, 96, 62, 121, 87, 22})));
        int i2 = -1;
        if (LJJLIIIJILLIZJL != null) {
            int intExtra = LJJLIIIJILLIZJL.getIntExtra((String) k.a(16777217, 0, 0L, "39f99d", new byte[]{49, 47, 20, 89, 19, 96}), -1);
            if (intExtra == 2 || intExtra == 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        return Integer.valueOf(i2);
    }
}
