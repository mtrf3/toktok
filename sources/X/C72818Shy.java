package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Shy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72818Shy {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C72821Si1.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C71649SAb.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C71648SAa.LJLIL);

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static ConcurrentHashMap LIZJ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static final void LIZ(C76052yf c76052yf) {
        if (c76052yf == null || c76052yf.LJLIL == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
        Iterator it = ((CopyOnWriteArrayList) LIZ.getValue()).iterator();
        o.LJFF(it, "eventQueue.iterator()");
        while (it.hasNext()) {
            C76052yf c76052yf2 = (C76052yf) it.next();
            if (Math.abs(currentTimeMillis - c76052yf2.LJLILLLLZI) > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                concurrentSkipListSet.add(c76052yf2);
            }
        }
        Iterator it2 = concurrentSkipListSet.iterator();
        while (it2.hasNext()) {
            ((CopyOnWriteArrayList) LIZ.getValue()).remove(it2.next());
        }
        ((CopyOnWriteArrayList) LIZ.getValue()).add(c76052yf);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ().get(c76052yf.LJLIL);
        if (copyOnWriteArrayList != null) {
            Iterator it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                InterfaceC40311Frv interfaceC40311Frv = ((C72820Si0) it3.next()).LIZJ;
                if (interfaceC40311Frv != null) {
                    interfaceC40311Frv.LIZ(c76052yf.LJLJI, c76052yf.LJLIL);
                }
            }
        }
    }

    public static final void LIZLLL(String eventName, InterfaceC72822Si2 subscriber) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(subscriber, "subscriber");
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        LJ(eventName, subscriber, currentTimeMillis, uuid);
    }

    public static final void LJI(C72820Si0 c72820Si0, String str) {
        InterfaceC40311Frv interfaceC40311Frv;
        if (str != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ().get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                LIZIZ().put(str, copyOnWriteArrayList);
            } else if (copyOnWriteArrayList.contains(c72820Si0)) {
                return;
            }
            copyOnWriteArrayList.add(c72820Si0);
            LIZIZ().put(str, copyOnWriteArrayList);
            Iterator it = ((CopyOnWriteArrayList) LIZ.getValue()).iterator();
            while (it.hasNext()) {
                C76052yf c76052yf = (C76052yf) it.next();
                if (o.LJ(c76052yf.LJLIL, str) && c72820Si0.LIZIZ <= c76052yf.LJLILLLLZI && (interfaceC40311Frv = c72820Si0.LIZJ) != null) {
                    interfaceC40311Frv.LIZ(c76052yf.LJLJI, str);
                }
            }
        }
    }

    public static final void LJII(String eventName, InterfaceC72822Si2 subscriber) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(subscriber, "subscriber");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ().get(subscriber);
        if (concurrentHashMap != null) {
            Object obj = concurrentHashMap.get(eventName);
            if (obj != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ().get(eventName);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(obj);
                }
                concurrentHashMap.remove(eventName);
            }
            if (concurrentHashMap.isEmpty()) {
                LIZJ().remove(subscriber);
            }
        }
    }

    public static final void LJFF(String str, InterfaceC72822Si2 subscriber, String str2) {
        o.LJIIJ(subscriber, "subscriber");
        LJ(str, subscriber, System.currentTimeMillis(), str2);
    }

    public static final void LJ(String eventName, InterfaceC72822Si2 subscriber, long j, String str) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(subscriber, "subscriber");
        C72820Si0 c72820Si0 = new C72820Si0(str, j, new C72819Shz(subscriber), null);
        if (LIZJ().get(subscriber) == null) {
            LIZJ().put(subscriber, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ().get(subscriber);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(eventName, c72820Si0);
        }
        LJI(c72820Si0, eventName);
    }
}
