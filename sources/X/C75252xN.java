package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75252xN {
    public static final java.util.Map<String, java.util.Map<String, String>> LIZ = new ConcurrentHashMap();

    public static java.util.Map LIZIZ(android.net.Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String queryName : UriProtector.getQueryParameterNames(uri)) {
                o.LJFF(queryName, "queryName");
                String LJJJJI = C78926UyI.LJJJJI(uri, queryName);
                if (LJJJJI != null) {
                    linkedHashMap.put(queryName, LJJJJI);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linkedHashMap;
    }

    public static final java.util.Map<String, String> LIZJ(String containerId) {
        o.LJIIJ(containerId, "containerId");
        java.util.Map<String, String> map = (java.util.Map) ((ConcurrentHashMap) LIZ).get(containerId);
        if (map != null) {
            return map;
        }
        return new LinkedHashMap();
    }

    public static final void LIZLLL(String containerId, java.util.Map<String, String> map) {
        o.LJIIJ(containerId, "containerId");
        ((ConcurrentHashMap) LIZ).put(containerId, map);
    }

    public static final java.util.Map<String, String> LIZ(android.net.Uri uri, java.util.Map<String, String> map, Bundle bundle) {
        C76800UCe c76800UCe;
        android.net.Uri parse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (bundle != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (String key : bundle.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, key);
                o.LJFF(key, "key");
                linkedHashMap2.put(key, String.valueOf(LLJJIII));
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        try {
            String LJJJJI = C78926UyI.LJJJJI(uri, "url");
            if (LJJJJI != null && (parse = UriProtector.parse(LJJJJI)) != null) {
                linkedHashMap.putAll(LIZIZ(parse));
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        linkedHashMap.putAll(LIZIZ(uri));
        return linkedHashMap;
    }
}
