package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class JWA {
    public static int LIZIZ;
    public static final java.util.Map<String, Integer> LIZ = new LinkedHashMap();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(JWB.LJLIL);

    public static final String LIZ(String str) {
        return JWK.LIZ(str);
    }

    public static boolean LIZIZ(String str) {
        return s.LJJJLZIJ(JWK.LIZ(str), "hotspot", false);
    }

    public static boolean LJ(String schema) {
        String queryParameter;
        o.LJIIIZ(schema, "schema");
        android.net.Uri parse = UriProtector.parse(schema);
        if (parse == null || (queryParameter = UriProtector.getQueryParameter(parse, "channel")) == null) {
            return false;
        }
        return s.LJJJLZIJ(queryParameter, "fe_tiktok_lynx_search_transfer", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean LJFF(java.lang.String r2) {
        /*
            java.lang.String r1 = "autoplay"
            if (r2 == 0) goto La
            boolean r0 = ujb.o.LJJJJJL(r2)
            if (r0 == 0) goto L29
        La:
            r0 = 1
        Lb:
            if (r0 == 0) goto L1c
        Ld:
            java.lang.String r1 = ""
        Lf:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L19:
            return r0
        L1a:
            r0 = 0
            goto L19
        L1c:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Exception -> Ld
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r1)     // Catch: java.lang.Exception -> Ld
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld
            goto Lf
        L29:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWA.LJFF(java.lang.String):java.lang.Boolean");
    }

    public static boolean LIZJ(Integer num, DynamicPatch dynamicPatch) {
        if (num == null || num.intValue() != 65514 || dynamicPatch == null || dynamicPatch.getOriginType() != 74) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Integer num, DynamicPatch dynamicPatch) {
        if (num == null || num.intValue() != 65514 || dynamicPatch == null || dynamicPatch.getOriginType() != 40) {
            return false;
        }
        return true;
    }

    public static boolean LJI(String str, String... strArr) {
        String LIZ2 = JWK.LIZ(str);
        for (String str2 : strArr) {
            if (o.LJ(str2, LIZ2)) {
                return true;
            }
        }
        return false;
    }
}
