package X;

import com.bytedance.helios.api.config.BinderConfig;
import com.bytedance.helios.api.config.BinderMethodConfig;
import com.bytedance.helios.api.config.InterestBinderConfig;
import com.bytedance.helios.api.config.InterestContentProviderConfig;
import com.bytedance.helios.api.config.ShareBinder;
import com.bytedance.helios.api.config.ShareConfig;
import com.bytedance.helios.binder.impl.BinderMonitor;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PwU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66074PwU {
    public static final C66075PwV LIZ = new C66075PwV(null);
    public static final HashMap<String, E19> LIZIZ = new HashMap<>();
    public static final HashMap<String, E1A> LIZJ = new HashMap<>();
    public static final HashMap<String, List<String>> LIZLLL = new HashMap<>();

    public static void LIZ(BinderConfig binderConfig) {
        boolean z;
        o.LJIIIZ(binderConfig, "binderConfig");
        if (!binderConfig.enabled) {
            return;
        }
        C38494F8w c38494F8w = new C38494F8w(true, "BinderConfigManager.update", 2);
        try {
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            heliosEnvImpl.LJIIL.clear();
            Iterator<InterestBinderConfig> it = binderConfig.interestBinders.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                InterestBinderConfig next = it.next();
                HashMap hashMap = new HashMap();
                for (BinderMethodConfig binderMethodConfig : next.methods) {
                    double d = binderMethodConfig.monitorNormal;
                    double d2 = i;
                    if (d < d2) {
                        d = next.monitorNormal;
                    }
                    double d3 = binderMethodConfig.monitorError;
                    if (d3 < d2) {
                        d3 = next.monitorError;
                    }
                    String str = binderMethodConfig.name;
                    List<String> list = binderMethodConfig.dataTypes;
                    List<String> list2 = next.dataTypes;
                    if (list == null || list.isEmpty()) {
                        list = list2;
                    }
                    List<Integer> list3 = binderMethodConfig.apiIds;
                    C65972Puq c65972Puq = C65972Puq.LJ;
                    hashMap.put(str, new E1B(list, c65972Puq.LIZLLL(d), list3, c65972Puq.LIZLLL(d3)));
                    if (!binderMethodConfig.skipSysCalls.isEmpty()) {
                        HashMap<String, List<String>> hashMap2 = LIZLLL;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(next.interfaceName);
                        LIZ2.append('#');
                        LIZ2.append(binderMethodConfig.name);
                        hashMap2.put(X1D.LIZIZ(LIZ2), binderMethodConfig.skipSysCalls);
                    }
                    HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                    o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                    heliosEnvImpl2.LJIIL.addAll(binderMethodConfig.apiIds);
                    i = 0;
                }
                LIZIZ.put(next.interfaceName, new E19(next.needPreAnalysis, hashMap));
            }
            C66075PwV c66075PwV = LIZ;
            List<String> actions = binderConfig.shareConfig.skipActions;
            c66075PwV.getClass();
            o.LJIIIZ(actions, "actions");
            c66075PwV.LJ.clear();
            c66075PwV.LJ.addAll(actions);
            List<String> providers = binderConfig.shareConfig.skipProviders;
            o.LJIIIZ(providers, "providers");
            c66075PwV.LJFF.clear();
            c66075PwV.LJFF.addAll(providers);
            C65972Puq c65972Puq2 = C65972Puq.LJ;
            c66075PwV.LIZ = c65972Puq2.LIZLLL(binderConfig.shareConfig.monitorRate);
            boolean LIZLLL2 = c65972Puq2.LIZLLL(binderConfig.shareConfig.reportRate);
            c66075PwV.LIZIZ = LIZLLL2;
            if (LIZLLL2) {
                C66197PyT c66197PyT = C66197PyT.LIZIZ;
                CopyOnWriteArrayList<InterfaceC66203PyZ> copyOnWriteArrayList = C66199PyV.LIZ;
                if (!copyOnWriteArrayList.contains(c66197PyT)) {
                    copyOnWriteArrayList.add(c66197PyT);
                }
            } else {
                C66199PyV.LIZ.remove(C66197PyT.LIZIZ);
            }
            ShareConfig shareConfig = binderConfig.shareConfig;
            c66075PwV.LIZJ = shareConfig.maskValue;
            if (c66075PwV.LIZ) {
                for (ShareBinder shareBinder : shareConfig.interestBinders) {
                    E19 e19 = LIZIZ.get(shareBinder.interfaceName);
                    if (e19 == null) {
                        e19 = new E19(shareBinder.needPreAnalysis, 2);
                    } else {
                        if (!e19.LIZ && !shareBinder.needPreAnalysis) {
                            z = false;
                            e19.LIZ = z;
                        }
                        z = true;
                        e19.LIZ = z;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str2 : shareBinder.methods) {
                        hashSet.add(str2);
                        java.util.Map<String, E1B> map = e19.LIZIZ;
                        boolean z2 = LIZ.LIZ;
                        map.put(str2, new E1B(z2, z2, 3));
                    }
                    LIZ.LIZLLL.put(shareBinder.interfaceName, hashSet);
                    LIZIZ.put(shareBinder.interfaceName, e19);
                }
            }
            for (Map.Entry<String, E19> entry : LIZIZ.entrySet()) {
                BinderMonitor binderMonitor = BinderMonitor.LJFF.get();
                String interfaceName = entry.getKey();
                java.util.Set<String> keySet = entry.getValue().LIZIZ.keySet();
                boolean z3 = entry.getValue().LIZ;
                binderMonitor.getClass();
                o.LJIIIZ(interfaceName, "interfaceName");
                EV0 ev0 = new EV0(interfaceName, keySet);
                binderMonitor.LIZIZ.put(interfaceName, ev0);
                if (z3) {
                    ev0.LIZ();
                }
            }
            for (InterestContentProviderConfig interestContentProviderConfig : binderConfig.interestProviders) {
                HashMap<String, E1A> hashMap3 = LIZJ;
                String str3 = interestContentProviderConfig.authority;
                C65972Puq c65972Puq3 = C65972Puq.LJ;
                hashMap3.put(str3, new E1A(c65972Puq3.LIZLLL(interestContentProviderConfig.monitorNormal), c65972Puq3.LIZLLL(interestContentProviderConfig.monitorError)));
            }
            C78605Ut7.LJIIIZ(c38494F8w, null);
        } finally {
        }
    }
}
