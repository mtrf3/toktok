package X;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PM7 {
    public static final HashMap<String, PM8> LIZ = new HashMap<>();

    public static PM8 LIZ() {
        HashMap<String, PM8> hashMap = LIZ;
        PM8 pm8 = hashMap.get("single_logcat");
        if (pm8 == null) {
            PM8 pm82 = new PM8(new File(new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/availableCheck"), "single_logcat"));
            hashMap.put("single_logcat", pm82);
            return pm82;
        }
        return pm8;
    }

    public static void LIZIZ(int i, boolean z) {
        PM8 LIZ2 = LIZ();
        if (2 != LIZ2.LIZIZ) {
            LIZ2.LIZJ = 0;
            LIZ2.LIZLLL = 0;
            LIZ2.LJ = 1;
            LIZ2.LIZIZ = 2;
        }
        if (LIZ2.LJ != 1) {
            return;
        }
        if (z) {
            int i2 = LIZ2.LIZJ + 1;
            LIZ2.LIZJ = i2;
            if (i <= i2) {
                LIZ2.LIZLLL = 0;
            }
        } else {
            int i3 = LIZ2.LIZLLL + 1;
            LIZ2.LIZLLL = i3;
            if (i <= i3) {
                LIZ2.LIZJ = 0;
                LIZ2.LJ = 0;
            }
        }
        try {
            File file = LIZ2.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2.LIZIZ);
            LIZ3.append("\n");
            LIZ3.append(LIZ2.LIZJ);
            LIZ3.append("\n");
            LIZ3.append(LIZ2.LIZLLL);
            LIZ3.append("\n");
            LIZ3.append(LIZ2.LJ);
            PK8.LJIILJJIL(file, X1D.LIZIZ(LIZ3), false);
        } catch (IOException unused) {
        }
    }
}
