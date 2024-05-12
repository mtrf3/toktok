package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FlY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39916FlY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String webUrl) {
        o.LJIIIZ(webUrl, "webUrl");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("target_handler");
        LIZ2.append("=crossPlatform");
        if (s.LJJJLZIJ(webUrl, X1D.LIZIZ(LIZ2), false)) {
            return webUrl;
        }
        if (s.LJJJZ(webUrl, '?')) {
            int LJJLIIIJL = s.LJJLIIIJL(webUrl, "#", 0, false, 6);
            if (LJJLIIIJL != -1) {
                StringBuilder LIZ3 = X1D.LIZ();
                String substring = webUrl.substring(0, LJJLIIIJL);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ3.append(substring);
                LIZ3.append('&');
                LIZ3.append("target_handler");
                LIZ3.append("=crossPlatform");
                String substring2 = webUrl.substring(LJJLIIIJL);
                o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                LIZ3.append(substring2);
                return X1D.LIZIZ(LIZ3);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(webUrl);
            LIZ4.append('&');
            LIZ4.append("target_handler");
            LIZ4.append("=crossPlatform");
            return X1D.LIZIZ(LIZ4);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(webUrl);
        LIZ5.append('?');
        LIZ5.append("target_handler");
        LIZ5.append("=crossPlatform");
        return X1D.LIZIZ(LIZ5);
    }
}
