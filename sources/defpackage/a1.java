package defpackage;

import X.C10430b1;
import X.C1DF;
import X.C23430vz;
import X.C23520w8;
import X.C23540wA;
import X.C78963Uyt;
import X.InterfaceC23370vt;
import X.O6R;
import X.X1D;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final /* synthetic */ class a1 {
    public static int LIZ(float f, InterfaceC23370vt interfaceC23370vt) {
        float LJJJJIZL = interfaceC23370vt.LJJJJIZL(f);
        if (Float.isInfinite(LJJJJIZL)) {
            return Integer.MAX_VALUE;
        }
        return O6R.LJJIIZ(LJJJJIZL);
    }

    public static long LIZIZ(long j, InterfaceC23370vt interfaceC23370vt) {
        if (j != C10430b1.LIZJ) {
            return C78963Uyt.LIZIZ(interfaceC23370vt.LJJJLZIJ(C10430b1.LIZLLL(j)), interfaceC23370vt.LJJJLZIJ(C10430b1.LIZIZ(j)));
        }
        return C23430vz.LIZJ;
    }

    public static float LIZJ(long j, InterfaceC23370vt interfaceC23370vt) {
        if (C23540wA.LIZ(C23520w8.LIZIZ(j), 4294967296L)) {
            return interfaceC23370vt.getDensity() * interfaceC23370vt.LJJJJI() * C23520w8.LIZJ(j);
        }
        "Only Sp can convert to Px".toString();
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static long LIZLLL(long j, InterfaceC23370vt interfaceC23370vt) {
        if (j != C23430vz.LIZJ) {
            return C1DF.LIZIZ(interfaceC23370vt.LJJJJIZL(C23430vz.LIZIZ(j)), interfaceC23370vt.LJJJJIZL(C23430vz.LIZ(j)));
        }
        return C10430b1.LIZJ;
    }

    public static void LJFF(Context context, String str) {
        o.LJIIIZ(context, str);
        new LinkedHashMap();
    }

    public static String LJ(String str, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }
}
