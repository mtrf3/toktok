package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.71Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C71Y {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    public static final void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(6, str, msg);
        }
    }

    public static final void LIZLLL(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (C36922EeM.LIZ) {
            C36922EeM.LIZLLL(4, tag, msg);
        }
    }

    public static final void LIZJ(String tag, String msg, Throwable t) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(t, "t");
        if (C36922EeM.LIZ) {
            StringBuilder LIZJ = b1.LIZJ(msg, ": ");
            LIZJ.append(android.util.Log.getStackTraceString(t));
            C36922EeM.LIZLLL(6, tag, X1D.LIZIZ(LIZJ));
        }
    }
}
