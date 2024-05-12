package defpackage;

import X.X1D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class j0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        o.LJIIIIZZ(bigDecimal, "BigDecimal(num).divide(B…gMode.HALF_UP).toString()");
        if ('0' == bigDecimal.charAt(bigDecimal.length() - 1)) {
            StringBuilder LIZ2 = X1D.LIZ();
            String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            LIZ2.append(substring);
            LIZ2.append(str);
            return X1D.LIZIZ(LIZ2);
        }
        return i0.LJFF(bigDecimal, str);
    }
}
