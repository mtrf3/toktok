package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PwJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66063PwJ {
    public static InterfaceC66065PwL LIZ;

    public static void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        InterfaceC66065PwL interfaceC66065PwL = LIZ;
        if (interfaceC66065PwL != null) {
            interfaceC66065PwL.i(str, msg, null);
        }
        C66036Pvs LIZIZ = C66036Pvs.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "HeliosEnv.get()");
        LIZIZ.LJFF();
    }

    public static final void LIZ(String str, String msg, Throwable th) {
        o.LJIIIZ(msg, "msg");
        InterfaceC66065PwL interfaceC66065PwL = LIZ;
        if (interfaceC66065PwL != null) {
            interfaceC66065PwL.e(str, msg, th);
        }
        C66036Pvs LIZIZ = C66036Pvs.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "HeliosEnv.get()");
        LIZIZ.LJFF();
    }

    public static final void LIZJ(String str, String msg, Throwable th) {
        o.LJIIIZ(msg, "msg");
        InterfaceC66065PwL interfaceC66065PwL = LIZ;
        if (interfaceC66065PwL != null) {
            interfaceC66065PwL.w(str, msg, th);
        }
        C66036Pvs LIZIZ = C66036Pvs.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "HeliosEnv.get()");
        LIZIZ.LJFF();
    }
}
