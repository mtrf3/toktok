package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.KTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51760KTc {
    public static boolean LIZ(Bundle one, Bundle two) {
        o.LJIIIZ(one, "one");
        o.LJIIIZ(two, "two");
        if (one.size() != two.size()) {
            return false;
        }
        java.util.Set<String> keySet = one.keySet();
        java.util.Set<String> keySet2 = two.keySet();
        o.LJIIIIZZ(keySet2, "two.keySet()");
        if (!keySet.containsAll(keySet2)) {
            return false;
        }
        for (String str : one.keySet()) {
            Object LLJJIII = C16880lQ.LLJJIII(one, str);
            Object LLJJIII2 = C16880lQ.LLJJIII(two, str);
            if ((LLJJIII instanceof Bundle) && (LLJJIII2 instanceof Bundle)) {
                if (!LIZ((Bundle) LLJJIII, (Bundle) LLJJIII2)) {
                    return false;
                }
            } else if (!o.LJ(LLJJIII, LLJJIII2)) {
                return false;
            }
        }
        return true;
    }
}
