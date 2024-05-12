package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ebm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36762Ebm {
    public static InterfaceC36767Ebr LIZ = new C36764Ebo();

    public static void LIZ(String message) {
        o.LJIIJ(message, "message");
        LIZ.LIZIZ(message);
    }

    public static void LIZJ(String message) {
        o.LJIIJ(message, "message");
        LIZ.LIZIZ(message);
    }

    public static void LIZIZ(String message, Throwable th) {
        o.LJIIJ(message, "message");
        if (th == null) {
            LIZ.LIZIZ(message);
        } else {
            LIZ.LIZJ(message, th);
        }
    }
}
