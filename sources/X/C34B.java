package X;

import defpackage.b1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.34B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34B {
    public static final C34B LIZ = new C34B();

    public static final void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    public static final void LJII(String str, String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public static String LIZ(String str) {
        return i0.LJFF("IM-", str);
    }

    public static final void LJFF(Throwable t) {
        o.LJIIIZ(t, "t");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            C36922EeM.LJFF(t);
        }
    }

    public static final void LIZJ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, LIZ(tag), msg);
        }
    }

    public static final void LJ(String tag, Throwable t) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(t, "t");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, LIZ(tag), android.util.Log.getStackTraceString(t));
        }
    }

    public static final void LJI(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(4, LIZ(tag), msg);
        }
    }

    public static final void LJIIIIZZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(5, LIZ(tag), msg);
        }
    }

    public static final void LIZLLL(String tag, String msg, Throwable t) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(t, "t");
        LIZ.getClass();
        if (C36922EeM.LIZ) {
            String LIZ2 = LIZ(tag);
            StringBuilder LIZJ = b1.LIZJ(msg, ": ");
            LIZJ.append(android.util.Log.getStackTraceString(t));
            C36922EeM.LIZLLL(6, LIZ2, X1D.LIZIZ(LIZJ));
        }
    }
}
