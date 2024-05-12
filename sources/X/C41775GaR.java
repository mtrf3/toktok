package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GaR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41775GaR {
    public static final String LIZ() {
        C60903NvH.LJIIJJI().LJJIIJ();
        return "unknown";
    }

    public static final boolean LIZIZ(C41759GaB error) {
        o.LJIIIZ(error, "error");
        if (error instanceof C41601GUj) {
            return false;
        }
        Throwable cause = error.getCause();
        if ((!(cause instanceof C42990Gu2) || ((C42990Gu2) cause).getCode() != -66666) && ((!(cause instanceof C41767GaJ) || ((C41767GaJ) cause).getErrorCode() != -39993) && !o.LJ(error, C41756Ga8.INSTANCE))) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(H1T node) {
        o.LJIIIZ(node, "node");
        C41777GaT.LIZ();
    }

    public static final void LJFF(Throwable error) {
        o.LJIIIZ(error, "error");
        if (C19N.LJ("studio_throw_publish_failure_as_crash", false)) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
    }

    public final void LIZLLL(String message) {
        o.LJIIIZ(message, "message");
        C41777GaT.LIZIZ(message, new C41819Gb9(message, null, 2, null), null);
    }

    public static final void LJ(String message, Throwable th, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(message, "message");
        C41777GaT.LIZIZ(message, th, interfaceC65784Pro);
    }
}
