package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O4C {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("no-store", "no-cache", "max-age=0", "max-age=0", "must-revalidate", "proxy-revalidate");
    public static final Gson LIZIZ = new Gson();

    public static String LIZIZ(java.util.Map map) {
        o.LJIIJ(map, "map");
        String json = GsonProtectorUtils.toJson(LIZIZ, map);
        o.LJFF(json, "gson.toJson(map)");
        return json;
    }

    public static Long LIZJ(java.util.Map map) {
        Integer LJJIL;
        int i;
        long j;
        Long LJJIZ;
        Integer LJJIL2;
        if (map != null) {
            String str = (String) map.get("cache-control");
            if (str != null && (LJJIL = C38350F3i.LJJIL(s.LJLLLL(s.LJLLI(str, "max-age=", str), ','))) != null) {
                int intValue = LJJIL.intValue();
                String str2 = (String) map.get("age");
                if (str2 != null && (LJJIL2 = C38350F3i.LJJIL(str2)) != null) {
                    i = LJJIL2.intValue();
                } else {
                    i = 0;
                }
                String str3 = (String) map.get("forest-append-on-request");
                if (str3 != null && (LJJIZ = C38350F3i.LJJIZ(str3)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                return Long.valueOf(((intValue - i) * 1000) + j);
            }
            String str4 = (String) map.get("expires");
            if (str4 != null) {
                Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.ENGLISH).parse(str4);
                o.LJFF(parse, "SimpleDateFormat(\"EEE, d…Locale.ENGLISH).parse(it)");
                return Long.valueOf(parse.getTime());
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(android.net.Uri uri) {
        String LJLLILLLL;
        o.LJIIJ(uri, "uri");
        String path = uri.getPath();
        String str = "";
        if (path != null && (LJLLILLLL = s.LJLLILLLL('.', path, "")) != null) {
            str = LJLLILLLL;
        }
        if (!ujb.o.LJJJJJL(str)) {
            return QZZ.LIZIZ('.', str);
        }
        return str;
    }

    public static java.util.Map LJ(java.util.Map cachedHeaders) {
        o.LJIIJ(cachedHeaders, "cachedHeaders");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : cachedHeaders.entrySet()) {
            if (!ujb.o.LJJJLIIL((String) entry.getKey(), "forest-append-", false)) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r2, boolean r3) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIJ(r2, r0)
            if (r3 == 0) goto L20
            r1 = 46
            java.lang.String r0 = ""
            java.lang.String r2 = ujb.s.LJLLILLLL(r1, r2, r0)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "Locale.ENGLISH"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.o.LJFF(r1, r0)
        L1f:
            return r1
        L20:
            java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2f
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            if (r0 == 0) goto L1f
        L32:
            r1 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4C.LIZ(java.lang.String, boolean):java.lang.String");
    }

    public static boolean LJFF(O4P meta, File file, byte[] bArr) {
        Object LIZ2;
        Object LIZ3;
        o.LJIIJ(meta, "meta");
        Object obj = null;
        if (file != null) {
            try {
                LIZ2 = Boolean.valueOf(file.isFile());
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            if (o.LJ(LIZ2, Boolean.TRUE)) {
                return true;
            }
            synchronized (meta) {
                try {
                    LIZ3 = Boolean.valueOf(file.isFile());
                    C3C5.m7constructorimpl(LIZ3);
                } catch (Throwable th2) {
                    LIZ3 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ3);
                }
                if (!C3C5.m12isFailureimpl(LIZ3)) {
                    obj = LIZ3;
                }
                if (o.LJ((Boolean) obj, Boolean.TRUE)) {
                    return true;
                }
                File file2 = new File(file.getPath() + "_tmp");
                try {
                    C16880lQ.LLLZZIL(file2);
                    C16880lQ.LLLZZIL(file);
                    C38485F8n.LLLI(file2, bArr);
                    if (file2.renameTo(file)) {
                        return true;
                    }
                    throw new IOException("rename file failed");
                } catch (Throwable th3) {
                    C39930Flm.LIZJ("META", "write file failed", th3, true);
                    C16880lQ.LLLZZIL(file2);
                    C16880lQ.LLLZZIL(file);
                    return false;
                }
            }
        }
        C39930Flm.LIZJ("META", "file or byte array is null", null, true);
        return false;
    }
}
