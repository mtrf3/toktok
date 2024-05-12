package X;

import defpackage.b1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.7ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189837ch {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZLLL(String str) {
        return i0.LJFF("Story-", str);
    }

    public static void LIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        String LIZLLL = LIZLLL(tag);
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(3, LIZLLL, msg);
        }
    }

    public static void LIZJ(String str, Throwable t) {
        o.LJIIIZ(t, "t");
        String LIZLLL = LIZLLL(str);
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, LIZLLL, android.util.Log.getStackTraceString(t));
        }
    }

    public static void LJ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        String LIZLLL = LIZLLL(str);
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(4, LIZLLL, msg);
        }
    }

    public static void LIZIZ(String str, String msg, Throwable t) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(t, "t");
        String LIZLLL = LIZLLL(str);
        if (C36922EeM.LIZ) {
            StringBuilder LIZJ = b1.LIZJ(msg, ": ");
            LIZJ.append(android.util.Log.getStackTraceString(t));
            C36922EeM.LIZLLL(6, LIZLLL, X1D.LIZIZ(LIZJ));
        }
    }
}
