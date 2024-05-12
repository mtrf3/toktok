package X;

import java.net.UnknownHostException;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7C {
    public static final String LJ(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        String stackTraceString = android.util.Log.getStackTraceString(th);
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(tr)");
        return stackTraceString;
    }

    public static final void LIZ(C5IP c5ip, String str) {
        LJI(3, c5ip.LIZ, null, str);
    }

    public static final void LJFF(C5IP c5ip, String str) {
        LJI(4, c5ip.LIZ, null, str);
    }

    public static final void LJII(C5IP c5ip, String str) {
        LJI(5, c5ip.LIZ, null, str);
    }

    public static final void LIZIZ(C5IP c5ip, String str, String str2) {
        LJI(3, c5ip.LIZ, str, str2);
    }

    public static final void LIZJ(C5IP c5ip, String str, String str2, Throwable th) {
        String str3 = c5ip.LIZ;
        StringBuilder LJFF = C72972SkS.LJFF(str2, '\n');
        LJFF.append(LJ(th));
        LJI(6, str3, str, X1D.LIZIZ(LJFF));
    }

    public static void LJI(int i, String str, String str2, String msg) {
        boolean z;
        if (msg == null || msg.length() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Editor-Pro-Log");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append('.');
            sb.append(str);
        }
        if (str2 != null && str2.length() != 0) {
            sb.append('.');
            sb.append(str2);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "tag.toString()");
        C36922EeM.LIZLLL(i, sb2, msg);
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return;
                    }
                    o.LJIIIZ(msg, "msg");
                    C65757PrN.LIZ(msg, "LogError");
                    return;
                }
                o.LJIIIZ(msg, "msg");
                C65757PrN.LIZ(msg, "LogWarning");
                return;
            }
            o.LJIIIZ(msg, "msg");
            C65757PrN.LIZ(msg, "LogInfo");
            return;
        }
        o.LJIIIZ(msg, "msg");
        C65757PrN.LIZ(msg, "LogDebug");
    }

    public static /* synthetic */ void LIZLLL(C5IP c5ip, String str, String str2, Throwable th, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        LIZJ(c5ip, str, str2, th);
    }
}
