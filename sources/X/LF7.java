package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class LF7 {
    public static final List<String> LIZ = new ArrayList();
    public static String LIZIZ = "";

    public static boolean LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        int LIZIZ2 = new LFA(new LF9(new C54967Lhj(new LF6(new LF8())))).LIZIZ();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        LF0.LIZIZ.LIZIZ(LIZIZ2);
        boolean z = true;
        if (LIZIZ2 != 1) {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("result:");
        LIZ2.append(z);
        LIZ2.append(", duration:");
        LIZ2.append(currentTimeMillis2);
        LIZ2.append(",  log:");
        LIZ2.append(LIZ);
        LIZIZ = X1D.LIZIZ(LIZ2);
        LFE.LIZIZ("DeviceAuth", LIZIZ);
        return z;
    }
}
