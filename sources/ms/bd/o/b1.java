package ms.bd.o;

import X.C16880lQ;
import android.telephony.TelephonyManager;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class b1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(C16880lQ.LLLLL(a.LIZIZ.LIZ), (String) k.a(16777217, 0, 0L, "517d80", new byte[]{52, 59, 75, 30, 2}));
        if (telephonyManager == null || telephonyManager.getSimState() != 5) {
            return bool;
        }
        return Boolean.TRUE;
    }
}
