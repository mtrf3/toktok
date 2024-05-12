package X;

import java.util.HashMap;

/* renamed from: X.EkP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37297EkP {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C37298EkQ.LJLIL);
    public static String LIZIZ = "";
    public static boolean LIZJ;

    public static final void LIZ(String str) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GlobalALSComponentMonitor onScreenCreate ");
        LIZ2.append(LIZIZ);
        LIZ2.append(' ');
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
        LIZIZ = str;
        ((HashMap) LIZ.getValue()).put(LIZIZ, new HashMap());
    }

    public static final void LIZIZ(String str) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GlobalALSComponentMonitor onScreenDestroy ");
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
        ((HashMap) LIZ.getValue()).remove(str);
    }

    public static final void LIZJ(String str) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GlobalALSComponentMonitor onScreenResume ");
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
        LIZIZ = str;
    }
}
