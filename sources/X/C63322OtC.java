package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OtC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63322OtC {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C63342OtW.LIZIZ = new C63340OtU();
    }

    public static void LIZ(String str) {
        LIZIZ("imsdk", str);
    }

    public static void LIZJ(String str) {
        if (!C63308Osy.LJI().LIZLLL().LJJIIZI) {
            LIZIZ("imsdk", str);
        }
    }

    public static void LIZLLL(String str) {
        LJI("imsdk", str, null);
    }

    public static void LJFF(String str) {
        LJI("imsdk", str, null);
    }

    public static void LJII(String str) {
        LJI("imsdk", str, null);
    }

    public static void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        InterfaceC63341OtV interfaceC63341OtV = C63310Ot0.LJLILLLLZI;
        if (interfaceC63341OtV != null) {
            interfaceC63341OtV.LIZJ(tag, msg);
        }
    }

    public static void LJ(String str, Throwable th) {
        LJI("imsdk", str, th);
    }

    public static void LJI(String tag, String msg, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C63310Ot0.LIZ(tag, msg, th);
    }
}
