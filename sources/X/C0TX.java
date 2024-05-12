package X;

import android.os.Process;
import kotlin.jvm.internal.o;

/* renamed from: X.0TX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TX {
    public static final C0TX LIZ = new C0TX();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("[");
        sb.append(Process.myTid());
        sb.append("][");
        if (LIZIZ.length() > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("pre: ");
            LIZ2.append(LIZIZ);
            LIZ2.append(", ");
            sb.append(X1D.LIZIZ(LIZ2));
        }
        if (LIZJ.length() > 0) {
            sb.append("cur: ");
            sb.append(LIZJ);
            if (LIZLLL.length() > 0) {
                sb.append("#{");
                sb.append(LIZLLL);
                sb.append("}");
            }
        }
        sb.append("] ");
        sb.append(str);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public static void LIZIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C0NB.LJIIIZ("effect_log", LIZ(msg));
        LIZLLL = "";
    }

    public static final void LIZLLL(String msg) {
        o.LJIIIZ(msg, "msg");
        LIZLLL = "";
    }

    public final void LIZJ(String str) {
        if (!o.LJ(str, LIZJ)) {
            LIZLLL = "";
            LIZIZ = LIZJ;
            LIZJ = str;
        }
    }
}
