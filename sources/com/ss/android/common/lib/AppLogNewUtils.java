package com.ss.android.common.lib;

import X.C16880lQ;
import X.C30581Hy;
import X.C38354F3m;
import X.C40501Fuz;
import X.C40502Fv0;
import X.C40505Fv3;
import X.C40506Fv4;
import X.C56542Ju;
import X.C66232ip;
import X.C66242iq;
import X.HandlerThreadC36423ERf;
import X.JNN;
import X.JVR;
import X.PP2;
import X.T1V;
import X.XKX;
import X.YMV;
import Y.ARunnableS6S1100100_6;
import Y.ARunnableS7S1100000_6;
import android.os.Build;
import android.os.Bundle;
import android.os.MessageQueue;
import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import com.ss.android.ugc.aweme.base.INetworkQualityService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.services.NetworkQualityServiceImpl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AppLogNewUtils {
    public static JSONObject LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
    }

    public static void LIZ(String str, Map<String, String> map) {
        JSONObject jSONObject;
        if (C38354F3m.LJ(str)) {
            return;
        }
        if (map == null || map.isEmpty()) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(map);
        }
        HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS6S1100100_6(str, System.currentTimeMillis(), jSONObject, 0));
    }

    public static void LIZJ(String str, Bundle bundle) {
        if (T1V.LJLILLLLZI) {
            MLCommonService.instance().traceMobClickEventBundle(str, bundle);
        }
        HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS6S1100100_6(System.currentTimeMillis(), bundle, str, 1));
    }

    public static void LIZLLL(final String eventName, final Map map) {
        if (C40505Fv3.LIZ && eventName != null && map != null && JNN.LJIILLIIL.containsKey(eventName)) {
            JVR.LIZIZ().execute(new ARunnableS7S1100000_6(map, eventName, 23));
        }
        o.LJIIIZ(eventName, "eventName");
        if (map != null) {
            YMV.LIZ(eventName, null, map, 2);
        }
        if (T1V.LJLILLLLZI) {
            MLCommonService.instance().traceMobClickEventMap(eventName, map);
        }
        if (C30581Hy.LJJIII(eventName)) {
            INetworkQualityService createINetworkQualityServicebyMonsterPlugin = NetworkQualityServiceImpl.createINetworkQualityServicebyMonsterPlugin(false);
            if (map != null) {
                try {
                    map.put("launch_network_status", String.valueOf(createINetworkQualityServicebyMonsterPlugin.getNetQualityLevel()));
                } catch (Exception unused) {
                }
            }
        }
        Map<String, HashSet<C56542Ju>> map2 = C40502Fv0.LIZIZ;
        if (((LinkedHashMap) map2).get(eventName) == null) {
            LIZ(eventName, map);
        } else {
            ReentrantLock reentrantLock = C40502Fv0.LIZ;
            reentrantLock.lock();
            try {
                HashSet hashSet = new HashSet((Collection) ((LinkedHashMap) map2).get(eventName));
                reentrantLock.unlock();
                Iterator it = hashSet.iterator();
                if (!it.hasNext()) {
                    LIZ(eventName, map);
                } else {
                    it.next().getClass();
                    throw null;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (C40506Fv4.LIZ) {
            AppLogDualReportSettings.LIZ.getClass();
            if (!((Map) AppLogDualReportSettings.LIZIZ.getValue()).containsKey(eventName)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C16880lQ.LJLI(C16880lQ.LLJJJJ().getQueue(), new MessageQueue.IdleHandler() { // from class: X.2is
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        XKX.LIZLLL(C40501Fuz.LIZ, null, null, new C66252ir(map, eventName, null), 3);
                        return false;
                    }
                });
            } else {
                XKX.LIZLLL(C40501Fuz.LIZ, null, null, new C66232ip(map, eventName, null), 3);
            }
        }
    }

    public static void onEventV3(final String eventName, final JSONObject jSONObject) {
        if (C40505Fv3.LIZ && eventName != null && jSONObject != null && JNN.LJIILLIIL.containsKey(eventName)) {
            JVR.LIZIZ().execute(new ARunnableS7S1100000_6(jSONObject, eventName, 22));
        }
        o.LJIIIZ(eventName, "eventName");
        if (jSONObject != null) {
            YMV.LIZ(eventName, jSONObject, null, 4);
        }
        if (T1V.LJLILLLLZI) {
            MLCommonService.instance().traceMobClickEvent(eventName, jSONObject);
        }
        if (C30581Hy.LJJIII(eventName)) {
            INetworkQualityService createINetworkQualityServicebyMonsterPlugin = NetworkQualityServiceImpl.createINetworkQualityServicebyMonsterPlugin(false);
            if (jSONObject != null) {
                try {
                    jSONObject.put("launch_network_status", createINetworkQualityServicebyMonsterPlugin.getNetQualityLevel());
                } catch (Exception unused) {
                }
            }
        }
        Map<String, HashSet<C56542Ju>> map = C40502Fv0.LIZIZ;
        if (((LinkedHashMap) map).get(eventName) == null) {
            PP2.LIZIZ.LIZ(eventName, jSONObject);
            JSONObject LIZIZ = LIZIZ(jSONObject);
            HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS6S1100100_6(eventName, System.currentTimeMillis(), LIZIZ, 3));
        } else {
            ReentrantLock reentrantLock = C40502Fv0.LIZ;
            reentrantLock.lock();
            try {
                HashSet hashSet = new HashSet((Collection) ((LinkedHashMap) map).get(eventName));
                reentrantLock.unlock();
                Iterator it = hashSet.iterator();
                if (!it.hasNext()) {
                    PP2.LIZIZ.LIZ(eventName, jSONObject);
                    JSONObject LIZIZ2 = LIZIZ(jSONObject);
                    HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS6S1100100_6(eventName, System.currentTimeMillis(), LIZIZ2, 3));
                } else {
                    it.next().getClass();
                    throw null;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (C40506Fv4.LIZ) {
            AppLogDualReportSettings.LIZ.getClass();
            if (!((Map) AppLogDualReportSettings.LIZIZ.getValue()).containsKey(eventName)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C16880lQ.LJLI(C16880lQ.LLJJJJ().getQueue(), new MessageQueue.IdleHandler() { // from class: X.2iu
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        XKX.LIZLLL(C40501Fuz.LIZ, null, null, new C66272it(eventName, null, jSONObject), 3);
                        return false;
                    }
                });
            } else {
                XKX.LIZLLL(C40501Fuz.LIZ, null, null, new C66242iq(eventName, null, jSONObject), 3);
            }
        }
    }
}
