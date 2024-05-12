package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F46 {
    public static JSInjectGlobalConfig LIZJ;
    public static volatile JSInjectGlobalConfig LIZLLL;
    public static final JSInjectConfig LIZ = new JSInjectConfig(null, null, null, null, null, null, false, 127, null);
    public static final JSInjectGlobalConfig LIZIZ = new JSInjectGlobalConfig(null, null, null, null, null, 31, null);
    public static volatile ConcurrentHashMap<String, JSInjectConfig> LJ = new ConcurrentHashMap<>();

    public static JSInjectGlobalConfig LIZIZ() {
        Object LIZ2;
        if (LIZLLL != null && (!o.LJ(LIZLLL, LIZIZ))) {
            return LIZLLL;
        }
        try {
            F45 f45 = F4G.LIZIZ;
            if (f45 != null) {
                LIZ2 = (JSInjectGlobalConfig) f45.LIZJ("global_js_inject_manage_collections", LIZIZ, JSInjectGlobalConfig.class);
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        JSInjectGlobalConfig jSInjectGlobalConfig = (JSInjectGlobalConfig) LIZ2;
        if ((jSInjectGlobalConfig == null || o.LJ(jSInjectGlobalConfig, LIZIZ)) && (jSInjectGlobalConfig = LIZJ) == null) {
            return null;
        }
        LIZLLL = jSInjectGlobalConfig;
        return LIZLLL;
    }

    public static boolean LIZ(String str) {
        JSInjectGlobalConfig LIZIZ2 = LIZIZ();
        if (LIZIZ2 == null || (!LIZIZ2.startInjectors.contains(str) && !LIZIZ2.finishInjectors.contains(str) && !LIZIZ2.manualInjectors.contains(str) && !LIZIZ2.inlineInjectors.contains(str))) {
            return false;
        }
        Object obj = null;
        try {
            F45 f45 = F4G.LIZIZ;
            if (f45 != null) {
                obj = (JSInjectConfig) f45.LIZJ(str, LIZ, JSInjectConfig.class);
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th) {
            obj = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(obj);
        }
        if (C3C5.m12isFailureimpl(obj) || obj == null || o.LJ(obj, LIZ)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(android.net.Uri uri, JSInjectGlobalConfig jSInjectGlobalConfig) {
        String LIZ2 = C37302EkU.LIZ(uri);
        if (LIZ2 == null) {
            return true;
        }
        Iterator<String> it = jSInjectGlobalConfig.blockList.iterator();
        while (it.hasNext()) {
            if (ujb.o.LJJJLIIL(LIZ2, it.next(), false)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[Manual] Disable by global block. Uri: ");
                LIZ3.append(uri);
                C37198Eio.LIZJ(X1D.LIZIZ(LIZ3));
                return true;
            }
        }
        return false;
    }

    public static JSInjectConfig LIZJ(String jsName, F2U f2u, F4B f4b) {
        Object LIZ2;
        o.LJIIJ(jsName, "jsName");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            F45 f45 = F4G.LIZIZ;
            if (f45 != null) {
                LIZ2 = (JSInjectConfig) f45.LIZJ(jsName, LIZ, JSInjectConfig.class);
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        JSInjectConfig jSInjectConfig = (JSInjectConfig) LIZ2;
        if (jSInjectConfig == null || o.LJ(jSInjectConfig, LIZ)) {
            if (f2u != null) {
                jSInjectConfig = f2u.LIZJ();
            } else {
                jSInjectConfig = null;
            }
            if (jSInjectConfig == null) {
                F47 f47 = f4b.LJ;
                if (f47 != null) {
                    f47.LIZ = 0;
                }
                F47 f472 = f4b.LJ;
                if (f472 != null) {
                    f472.LIZJ = C44847Hit.LIZ(currentTimeMillis);
                }
                return null;
            }
            F47 f473 = f4b.LJ;
            if (f473 != null) {
                f473.LIZIZ = 0;
            }
        } else {
            F47 f474 = f4b.LJ;
            if (f474 != null) {
                f474.LIZIZ = 1;
            }
        }
        if (o.LJ(jSInjectConfig.injectTime, F4F.VERY_BEGINNING.getValue())) {
            LJ.put(jSInjectConfig.geckoUrl, jSInjectConfig);
        }
        F47 f475 = f4b.LJ;
        if (f475 != null) {
            f475.LIZ = 1;
        }
        F47 f476 = f4b.LJ;
        if (f476 != null) {
            f476.LIZJ = C44847Hit.LIZ(currentTimeMillis);
        }
        return jSInjectConfig;
    }

    public static boolean LIZLLL(android.net.Uri uri, JSInjectConfig jSInjectConfig, F4B f4b) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String LIZ2 = C37302EkU.LIZ(uri);
        if (LIZ2 == null) {
            return false;
        }
        Iterator<String> it = jSInjectConfig.blockList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (ujb.o.LJJJLIIL(LIZ2, it.next(), false)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[Manual] Block by JS Config. JSName: ");
            LIZ3.append(jSInjectConfig.name);
            LIZ3.append(", Uri: ");
            LIZ3.append(uri);
            C37198Eio.LIZJ(X1D.LIZIZ(LIZ3));
            return false;
        }
        Iterator<String> it2 = jSInjectConfig.allowList.iterator();
        while (it2.hasNext()) {
            if (s.LJJJLZIJ(LIZ2, it2.next(), false)) {
                F47 f47 = f4b.LJ;
                if (f47 != null) {
                    f47.LIZLLL = C44847Hit.LIZ(currentTimeMillis);
                }
                return true;
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[Manual] Not allow by config. JSName: ");
        LIZ4.append(jSInjectConfig.name);
        LIZ4.append(", Uri: ");
        LIZ4.append(uri);
        C37198Eio.LIZJ(X1D.LIZIZ(LIZ4));
        return false;
    }
}
