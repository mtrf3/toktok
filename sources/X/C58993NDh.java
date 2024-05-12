package X;

import android.util.LruCache;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NDh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58993NDh {
    public final ConcurrentHashMap<String, List<C58991NDf>> LIZ = new ConcurrentHashMap<>();
    public final LruCache<String, Boolean> LIZIZ = new LruCache<>(20);

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ(String lynxSchema) {
        Object obj;
        C58991NDf c58991NDf;
        o.LJIIIZ(lynxSchema, "lynxSchema");
        List LIZ = LIZ(lynxSchema, this.LIZ);
        if (LIZ.isEmpty()) {
            try {
                if (!CommerceIBEService.LJFF().LIZJ(lynxSchema)) {
                    throw new C59000NDo();
                }
            } catch (C59002NDq unused) {
            }
            throw new C58996NDk();
        }
        synchronized (LIZ) {
            Iterator it = LIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C58991NDf) obj).LJFF == EnumC58992NDg.READY) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c58991NDf = (C58991NDf) obj;
        }
        if (c58991NDf == null) {
            int ordinal = ((C58991NDf) ORZ.LJLLJ(LIZ)).LJFF.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        throw new C59001NDp();
                    }
                    throw new C58997NDl();
                }
                throw new C58999NDn();
            }
            throw new C58998NDm();
        }
        return c58991NDf.LIZ;
    }

    public static List LIZ(String str, ConcurrentHashMap concurrentHashMap) {
        Object putIfAbsent;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new ArrayList()))) != null) {
            obj = putIfAbsent;
        }
        return (List) obj;
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        if (str == null) {
            return;
        }
        for (List<C58991NDf> cacheList : this.LIZ.values()) {
            o.LJIIIIZZ(cacheList, "cacheList");
            synchronized (cacheList) {
                for (C58991NDf c58991NDf : cacheList) {
                    SparkContext sparkContext = c58991NDf.LIZ.getSparkContext();
                    if (sparkContext != null) {
                        str3 = sparkContext.containerId;
                    } else {
                        str3 = null;
                    }
                    if (o.LJ(str3, str)) {
                        cacheList.remove(c58991NDf);
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(c58991NDf.LIZ);
                        C58628Mzg c58628Mzg = c58991NDf.LIZIZ;
                        N0X.LIZ.getClass();
                        c58628Mzg.LJIILJJIL(N0X.LJ, new AqS63S1100000_10(str2, c58991NDf, 1));
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c58991NDf.LIZLLL;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                        return;
                    }
                }
            }
        }
    }
}
