package X;

import java.io.PrintWriter;
import java.net.UnknownHostException;

/* loaded from: classes12.dex */
public final class PN1 {
    public static String LIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        PN2 pn2 = new PN2();
        PrintWriter printWriter = new PrintWriter(pn2);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return pn2.toString();
    }
}
