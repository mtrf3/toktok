package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Eio, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37198Eio {
    public static void LIZIZ(String message) {
        o.LJIIJ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(message);
        LIZ.append(" throwable: ");
        LIZ.append((String) null);
        X1D.LIZIZ(LIZ);
    }

    public static void LIZJ(String message) {
        o.LJIIJ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(message);
        LIZ.append(" throwable: ");
        LIZ.append((String) null);
        X1D.LIZIZ(LIZ);
    }

    public static final void LIZ(String message, Throwable th) {
        String str;
        o.LJIIJ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(message);
        LIZ.append(" throwable: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
