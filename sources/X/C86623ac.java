package X;

import ujb.o;
import ujb.s;

/* renamed from: X.3ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86623ac {
    public static java.util.Map LIZ(Exception exc) {
        String str;
        String th = exc.toString();
        String stackTraceString = android.util.Log.getStackTraceString(exc);
        Object LJLLLL = ORZ.LJLLLL(s.LJLJJL(th, new String[]{":"}, 2, 2));
        String str2 = "";
        if (LJLLLL == null) {
            LJLLLL = "";
        }
        if (stackTraceString != null) {
            str = o.LJJJJZ(o.LJJJJZ(C40689Fy1.LLF(th.length(), stackTraceString), "android.database.sqlite", "adr", false), "androidx.sqlite.db.framework", "adrx", false);
        } else {
            str = null;
        }
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("error", th);
        oszArr[1] = new OSZ("error_class", LJLLLL);
        if (str != null) {
            str2 = str;
        }
        oszArr[2] = new OSZ("error_stack", str2);
        return C113554cx.LJJL(oszArr);
    }
}
