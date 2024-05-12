package X;

import defpackage.i0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.o;

/* renamed from: X.7C7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C7 {
    public static final String LIZ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LIZIZ(j, 1000L, "k");
        }
        if (j < 1000000000) {
            return LIZIZ(j, 1000000L, "m");
        }
        return LIZIZ(j, 1000000000L, "b");
    }

    public static String LIZIZ(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        o.LJIIIIZZ(bigDecimal, "bd.toString()");
        if ('0' == bigDecimal.charAt(bigDecimal.length() - 1)) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append(str);
            return X1D.LIZIZ(LIZ);
        }
        return i0.LJFF(bigDecimal, str);
    }
}
