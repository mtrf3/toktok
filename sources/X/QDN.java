package X;

import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QDN {
    public static C86804Y4y LIZ() {
        Object LLIZ = C16880lQ.LLIZ("phone", FKM.LIZ());
        o.LJII(LLIZ, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        C39405FdJ.LJFF.getClass();
        String LJ = C39571Ffz.LJ((TelephonyManager) LLIZ);
        if (LJ.length() == 0) {
            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            c39567Ffv.getClass();
            LJ = C39567Ffv.LIZIZ(locale);
        }
        if (LJ.length() == 0) {
            return C27486AqY.LJLJJL;
        }
        Iterator it = C86804Y4y.LJLJL.iterator();
        while (it.hasNext()) {
            C86804Y4y c86804Y4y = (C86804Y4y) it.next();
            if (ujb.o.LJJJJIZL(c86804Y4y.LJLJI, LJ, true)) {
                return c86804Y4y;
            }
        }
        return C27486AqY.LJLJJL;
    }
}
