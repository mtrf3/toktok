package X;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Pcr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64857Pcr implements InterfaceC39219FaJ {
    public static String LIZIZ(String str, java.util.Map map) {
        List list = (List) map.get(str);
        if (list == null) {
            Locale US = Locale.US;
            o.LJIIIIZZ(US, "US");
            String lowerCase = str.toLowerCase(US);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            list = (List) map.get(lowerCase);
            if (list == null) {
                return null;
            }
        }
        return (String) C64504PTg.LIZIZ(list, -1, list);
    }

    @Override // X.InterfaceC39219FaJ
    public final InputStream LIZ(InputStream inputStream, java.util.Map<String, List<String>> headers, C64738Paw c64738Paw) {
        java.util.Map<String, Long> map;
        java.util.Map<String, Long> map2;
        o.LJIIIZ(inputStream, "inputStream");
        o.LJIIIZ(headers, "headers");
        try {
            if (o.LJ("ttzip", LIZIZ("Content-Encoding", headers))) {
                inputStream = C37348ElE.LIZ(inputStream, LIZIZ("ttzip-version", headers));
                if (c64738Paw != null && (map2 = c64738Paw.LJJJI) != null) {
                    ((HashMap) map2).put("zstd_err_code", 0L);
                }
            }
            return inputStream;
        } catch (Exception e) {
            if (c64738Paw != null && (map = c64738Paw.LJJJI) != null) {
                ((HashMap) map).put("zstd_err_code", 1L);
            }
            throw e;
        }
    }
}
