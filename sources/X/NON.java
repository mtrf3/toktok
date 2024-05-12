package X;

import android.text.TextUtils;
import ujb.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NON {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str, String str2) {
        int LJJLIIIJJIZ;
        if (str == null || o.LJJJJJL(str2)) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        if (!TextUtils.isEmpty(str2) && (LJJLIIIJJIZ = s.LJJLIIIJJIZ(str2, '?', 0, false, 6)) != -1) {
            str2 = str2.substring(0, LJJLIIIJJIZ);
            kotlin.jvm.internal.o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String LIZJ = C38352F3k.LIZJ(str2);
        kotlin.jvm.internal.o.LJIIIIZZ(LIZJ, "md5Hex(generateBaseUrl(url))");
        String substring = LIZJ.substring(8, 24);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring);
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x060e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.NNR LIZ(java.lang.String r13, java.lang.String r14, int r15, int r16, int r17, X.NOV r18, X.NOY r19, android.os.Bundle r20, java.lang.String r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NON.LIZ(java.lang.String, java.lang.String, int, int, int, X.NOV, X.NOY, android.os.Bundle, java.lang.String, int, boolean):X.NNR");
    }
}
