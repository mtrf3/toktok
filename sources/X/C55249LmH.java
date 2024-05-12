package X;

import java.util.concurrent.Executor;

/* renamed from: X.LmH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55249LmH {
    public static Executor LIZ;
    public static InterfaceC55255LmN LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static InterfaceC55250LmI LJFF;
    public static boolean LJI;

    public static void LIZ(String str, InterfaceC65784Pro interfaceC65784Pro) {
        String LIZIZ2;
        InterfaceC55250LmI interfaceC55250LmI = LJFF;
        if (interfaceC55250LmI == null) {
            return;
        }
        try {
            LIZIZ2 = (String) interfaceC65784Pro.invoke();
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("catch err ");
            LIZ2.append(android.util.Log.getStackTraceString(th));
            LIZIZ2 = X1D.LIZIZ(LIZ2);
        }
        interfaceC55250LmI.LIZ(4, str, LIZIZ2);
    }
}
