package X;

import com.bytedance.helios.cache.config.CacheConfig;
import com.bytedance.helios.cache.config.CacheGroup;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66273Pzh {
    public static InterfaceC66072PwS LIZ;
    public static InterfaceC66073PwT LIZIZ;

    public static void LIZ(CacheConfig cacheConfig) {
        java.util.Map<Integer, C66282Pzq> map = C66277Pzl.LIZIZ;
        synchronized (map) {
            ((LinkedHashMap) map).clear();
        }
        if (cacheConfig == null) {
            return;
        }
        for (CacheGroup cacheGroup : cacheConfig.cacheGroups) {
            String name = cacheGroup.store;
            o.LJIIIZ(name, "name");
            InterfaceC66286Pzu interfaceC66286Pzu = (InterfaceC66286Pzu) ((LinkedHashMap) AXN.LIZIZ).get(name);
            if (interfaceC66286Pzu == null) {
                interfaceC66286Pzu = AXN.LIZ;
            }
            String name2 = cacheGroup.strategy;
            java.util.Map<String, String> params = cacheGroup.params;
            o.LJIIIZ(name2, "name");
            o.LJIIIZ(params, "params");
            LinkedHashMap linkedHashMap = (LinkedHashMap) C66289Pzx.LIZ;
            if (linkedHashMap.get(name2) != null) {
                Object obj = linkedHashMap.get(name2);
                o.LJI(obj);
                J1T LIZ2 = ((InterfaceC66280Pzo) obj).LIZ(params);
                String name3 = cacheGroup.filter;
                o.LJIIIZ(name3, "name");
                InterfaceC66285Pzt interfaceC66285Pzt = (InterfaceC66285Pzt) ((LinkedHashMap) C66279Pzn.LIZ).get(name3);
                Iterator<Integer> it = cacheGroup.apiIds.iterator();
                while (it.hasNext()) {
                    C66277Pzl.LIZ(it.next().intValue(), interfaceC66286Pzu, LIZ2, interfaceC66285Pzt);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("register ");
                LIZ3.append(cacheGroup.apiIds);
                LIZ3.append(" cache group with ");
                LIZ3.append(interfaceC66286Pzu);
                LIZ3.append("(store), ");
                LIZ3.append(LIZ2);
                LIZ3.append("(strategy)");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                InterfaceC66072PwS interfaceC66072PwS = LIZ;
                if (interfaceC66072PwS != null) {
                    interfaceC66072PwS.d(LIZIZ2);
                }
            } else {
                throw new RuntimeException(a1.LJ("unknown strategy: ", name2, " !"));
            }
        }
    }
}
