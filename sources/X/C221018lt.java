package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.8lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221018lt {
    public static final boolean LIZ = C19N.LJ("alog_write_for_all_channel", true);

    public static final void LIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    public static final void LJI(String str, String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public static final void LJ(Throwable t) {
        o.LJIIIZ(t, "t");
        if (LIZ) {
            C36922EeM.LJFF(t);
        } else if (C36922EeM.LIZ) {
            C36922EeM.LJFF(t);
        }
    }

    public static final void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (LIZ) {
            C36922EeM.LIZLLL(6, tag, msg);
        } else if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, tag, msg);
        }
    }

    public static final void LIZLLL(String str, Throwable t) {
        o.LJIIIZ(t, "t");
        if (LIZ) {
            C36922EeM.LIZLLL(6, str, android.util.Log.getStackTraceString(t));
        } else if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, str, android.util.Log.getStackTraceString(t));
        }
    }

    public static final void LJFF(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (LIZ) {
            C36922EeM.LIZLLL(4, tag, msg);
        } else if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(4, tag, msg);
        }
    }

    public static final void LIZJ(String tag, String msg, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (LIZ) {
            StringBuilder LIZJ = b1.LIZJ(msg, ": ");
            LIZJ.append(android.util.Log.getStackTraceString(th));
            C36922EeM.LIZLLL(6, tag, X1D.LIZIZ(LIZJ));
        } else if (C36922EeM.LIZ) {
            StringBuilder LIZJ2 = b1.LIZJ(msg, ": ");
            LIZJ2.append(android.util.Log.getStackTraceString(th));
            C36922EeM.LIZLLL(6, tag, X1D.LIZIZ(LIZJ2));
        }
    }
}
