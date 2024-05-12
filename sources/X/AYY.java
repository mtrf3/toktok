package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYY {
    public static final AYY LIZ = new AYY();

    public static void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("@UserCard|");
        LIZ2.append(tag);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(4, LIZIZ, msg);
        }
    }

    public static void LIZ(String tag, String msg, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("@UserCard|");
        LIZ2.append(tag);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (C36922EeM.LIZ) {
            StringBuilder LIZJ = b1.LIZJ(msg, ": ");
            LIZJ.append(android.util.Log.getStackTraceString(th));
            C36922EeM.LIZLLL(6, LIZIZ, X1D.LIZIZ(LIZJ));
        }
    }
}
