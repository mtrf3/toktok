package X;

import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.PbA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64752PbA {
    public static volatile InterfaceC64780Pbc LIZ;
    public static final C64753PbB LIZIZ;
    public static boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static String LJ;

    static {
        new C64779Pbb();
        LIZIZ = new C64753PbB();
    }

    public static boolean LIZ() {
        if (LIZ == null) {
            C64667PZn.LIZIZ = 9;
            return false;
        }
        if (!LIZ.LJ()) {
            return false;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        if (LIZJ && !LIZLLL) {
            C64667PZn.LIZIZ = 7;
            C64667PZn.LIZJ = LJ;
            return false;
        }
        return true;
    }
}
