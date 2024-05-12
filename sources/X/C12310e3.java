package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.0e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12310e3 {
    public static final C12310e3 LIZIZ = new C12310e3();
    public static final C0FT LIZ = new C0FT(new InterfaceC12300e2() { // from class: X.1Qh
        @Override // X.InterfaceC12300e2
        public final boolean getEnabled() {
            return false;
        }

        @Override // X.InterfaceC12300e2
        public final void logDebug(String tag, String message) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(message, "message");
        }

        @Override // X.InterfaceC12300e2
        public final void logError(String tag, String message) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(message, "message");
        }

        @Override // X.InterfaceC12300e2
        public final void logError(String tag, String message, Throwable exception) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(message, "message");
            o.LJIIJ(exception, "exception");
        }

        @Override // X.InterfaceC12300e2
        public final void logWarn(String tag, String message) {
            o.LJIIJ(tag, "tag");
            o.LJIIJ(message, "message");
        }
    });

    public static String LIZJ(String str) {
        return i0.LJFF("EPKN.-", str);
    }

    public static void LIZ(String str, String message) {
        o.LJIIJ(message, "message");
        C0FT c0ft = LIZ;
        if (((InterfaceC12300e2) c0ft.LIZ).getEnabled()) {
            ((InterfaceC12300e2) c0ft.LIZ).logDebug(LIZJ(str), message);
        }
    }

    public static void LIZLLL(String str, String message) {
        o.LJIIJ(message, "message");
        C0FT c0ft = LIZ;
        if (((InterfaceC12300e2) c0ft.LIZ).getEnabled()) {
            ((InterfaceC12300e2) c0ft.LIZ).logWarn(LIZJ(str), message);
        }
    }

    public static void LIZIZ(String str, String message, Throwable th) {
        o.LJIIJ(message, "message");
        if (th != null) {
            InterfaceC12300e2 interfaceC12300e2 = (InterfaceC12300e2) LIZ.LIZ;
            LIZIZ.getClass();
            interfaceC12300e2.logError(LIZJ(str), message, th);
            return;
        }
        ((InterfaceC12300e2) LIZ.LIZ).logError(LIZJ(str), message);
    }
}
