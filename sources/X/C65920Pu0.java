package X;

import Y.ARunnableS15S0101000_11;
import com.bytedance.helios.api.config.AutoSkipApiConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65920Pu0 {
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<Long>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(int i, long j) {
        NetworkConfig networkConfig;
        java.util.Map<Integer, AutoSkipApiConfig> map;
        AutoSkipApiConfig autoSkipApiConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && (map = networkConfig.autoSkipApiConfigs) != null && (autoSkipApiConfig = map.get(Integer.valueOf(i))) != null) {
            ConcurrentHashMap<Integer, Boolean> concurrentHashMap = LIZIZ;
            Boolean bool = concurrentHashMap.get(Integer.valueOf(i));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            o.LJIIIIZZ(bool, "skipMap[id] ?: false");
            if (bool.booleanValue()) {
                return;
            }
            ConcurrentHashMap<Integer, CopyOnWriteArrayList<Long>> concurrentHashMap2 = LIZ;
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = concurrentHashMap2.get(Integer.valueOf(i));
            if (copyOnWriteArrayList == null) {
                Integer valueOf = Integer.valueOf(i);
                CopyOnWriteArrayList<Long> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(Long.valueOf(j));
                concurrentHashMap2.put(valueOf, copyOnWriteArrayList2);
                return;
            }
            copyOnWriteArrayList.add(Long.valueOf(j));
            if (copyOnWriteArrayList.size() < autoSkipApiConfig.count) {
                return;
            }
            double LJLIL = ORZ.LJLIL(copyOnWriteArrayList);
            if (LJLIL >= autoSkipApiConfig.averageCost) {
                concurrentHashMap.put(Integer.valueOf(i), Boolean.TRUE);
                C65939PuJ.LIZ((long) (1000 * LJLIL), C0NY.LIZIZ("skip_", i, "_average"));
                C65926Pu6.LIZIZ("Helios:Network-Invoke", new C65934PuE(i, LJLIL, copyOnWriteArrayList, autoSkipApiConfig), 0, null, 12);
                HandlerThreadC65936PuG.LIZ();
                HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(new ARunnableS15S0101000_11(i, autoSkipApiConfig, 10), autoSkipApiConfig.skipInterval);
            }
            concurrentHashMap2.put(Integer.valueOf(i), new CopyOnWriteArrayList<>());
        }
    }
}
