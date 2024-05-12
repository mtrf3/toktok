package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235179Kv {
    public static final m LIZ = new m();

    public static java.util.Map LIZ() {
        HashMap hashMap;
        java.util.Map map;
        FFL LJIIIZ = FFL.LJIIIZ();
        m mVar = LIZ;
        LJIIIZ.getClass();
        try {
            hashMap = (HashMap) C237429Tm.LIZ(String.valueOf(FFL.LJIJ(true, "pdp_lynx_config", 31744, m.class, mVar)), HashMap.class);
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Set keySet = hashMap.keySet();
                o.LJIIIIZZ(keySet, "map.keys");
                for (Object obj : keySet) {
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof java.util.Map) {
                        map = (java.util.Map) obj2;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        linkedHashMap.put(obj.toString(), C237429Tm.LIZ(map.toString(), PdpLynxPreloadItem.class));
                    }
                }
                return linkedHashMap;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return null;
    }
}
