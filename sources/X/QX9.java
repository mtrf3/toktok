package X;

import Y.ACallableS114S0100000_11;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QX9 {
    public static final String LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ = JBR.LJFF(LIZ2, "api-va.tiktokv.com", "/aweme/v1/friend/register/notice/", LIZ2);
    }

    public static void LIZIZ(Handler handler, java.util.Map info, int i) {
        o.LJIIIZ(info, "info");
        FGR.LIZIZ().LIZ(handler, new ACallableS114S0100000_11(info, 3), i);
    }

    public static void LIZJ(Handler handler, String str, int i, String str2, List list, int i2) {
        FGR.LIZIZ().LIZ(handler, new QX8(str, i, str2, list), i2);
    }

    public static void LIZ(Handler handler, String str, String str2, int i, int i2, boolean z, int i3) {
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        FGR.LIZIZ().LIZ(handler, new QXA(i, str, z2, str2, null), i2);
    }
}
