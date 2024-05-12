package com.ss.android.ugc.aweme.ecommerce.eventcenter;

import X.C113554cx;
import X.C58096Mr6;
import X.C60059Nhf;
import X.C60060Nhg;
import X.C65777Prh;
import X.C72818Shy;
import X.C76052yf;
import X.C78983UzD;
import X.F15;
import X.InterfaceC60061Nhh;
import X.InterfaceC72822Si2;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EventCenter implements IEventCenter {
    public static final /* synthetic */ int LIZLLL = 0;
    public final F15 LIZ = new F15();
    public final ConcurrentHashMap<String, ConcurrentHashMap<C60060Nhg<InterfaceC60061Nhh>, InterfaceC72822Si2>> LIZIZ = new ConcurrentHashMap<>();
    public final ReferenceQueue<InterfaceC60061Nhh> LIZJ = new ReferenceQueue<>();

    public static IEventCenter LJ() {
        Object LIZ = C58096Mr6.LIZ(IEventCenter.class, false);
        if (LIZ != null) {
            return (IEventCenter) LIZ;
        }
        if (C58096Mr6.S == null) {
            synchronized (IEventCenter.class) {
                if (C58096Mr6.S == null) {
                    C58096Mr6.S = new EventCenter();
                }
            }
        }
        return C58096Mr6.S;
    }

    public final void LIZLLL() {
        Reference<? extends InterfaceC60061Nhh> poll = this.LIZJ.poll();
        while (poll instanceof C60060Nhg) {
            String str = ((C60060Nhg) poll).LIZ;
            InterfaceC72822Si2 interfaceC72822Si2 = (InterfaceC72822Si2) C65777Prh.LIZJ(LJFF(str)).remove(poll);
            if (interfaceC72822Si2 != null) {
                C72818Shy.LJII(str, interfaceC72822Si2);
            }
            poll = this.LIZJ.poll();
        }
    }

    public final ConcurrentHashMap<C60060Nhg<InterfaceC60061Nhh>, InterfaceC72822Si2> LJFF(String str) {
        ConcurrentHashMap<C60060Nhg<InterfaceC60061Nhh>, InterfaceC72822Si2> concurrentHashMap = this.LIZIZ.get(str);
        if (concurrentHashMap == null) {
            synchronized (this) {
                concurrentHashMap = this.LIZIZ.get(str);
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap<>();
                    this.LIZIZ.put(str, concurrentHashMap);
                }
            }
        }
        return concurrentHashMap;
    }

    public static void LJI(List list, JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                LJII(linkedHashMap, (JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                LJI(arrayList, (JSONArray) obj);
            } else {
                Object obj2 = jSONArray.get(i);
                o.LJIIIIZZ(obj2, "value.get(idx)");
                list.add(obj2);
            }
        }
        ORZ.LLJI(list);
    }

    public static Map LJII(Map map, JSONObject jSONObject) {
        if (map == null) {
            map = new LinkedHashMap();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object v = jSONObject.get(key);
            if (v instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                o.LJIIIIZZ(key, "key");
                map.put(key, linkedHashMap);
                LJII(linkedHashMap, (JSONObject) v);
            } else if (v instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                o.LJIIIIZZ(key, "key");
                map.put(key, arrayList);
                LJI(arrayList, (JSONArray) v);
            } else {
                o.LJIIIIZZ(key, "key");
                o.LJIIIIZZ(v, "v");
                map.put(key, v);
            }
        }
        return C113554cx.LJJLIIIJLLLLLLLZ(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZ(String eventName, String params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        try {
            JSONObject jSONObject = new JSONObject(params);
            long currentTimeMillis = System.currentTimeMillis();
            F15 f15 = this.LIZ;
            Map LJII = LJII(null, jSONObject);
            f15.getClass();
            C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(LJII), eventName));
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZIZ(String str, InterfaceC60061Nhh subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        ConcurrentHashMap<C60060Nhg<InterfaceC60061Nhh>, InterfaceC72822Si2> LJFF = LJFF(str);
        Enumeration<C60060Nhg<InterfaceC60061Nhh>> keys = LJFF.keys();
        o.LJIIIIZZ(keys, "map.keys()");
        ArrayList list = Collections.list(keys);
        o.LJIIIIZZ(list, "list(this)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (o.LJ(reference.get(), subscriber)) {
                InterfaceC72822Si2 interfaceC72822Si2 = LJFF.get(reference);
                if (interfaceC72822Si2 != null) {
                    C72818Shy.LJII(str, interfaceC72822Si2);
                }
                LJFF.remove(reference);
            }
        }
        LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZJ(String eventName, InterfaceC60061Nhh subscriber) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(subscriber, "subscriber");
        C60060Nhg<InterfaceC60061Nhh> c60060Nhg = new C60060Nhg<>(eventName, subscriber, this.LIZJ);
        C60059Nhf c60059Nhf = new C60059Nhf(c60060Nhg, eventName);
        LJFF(eventName).put(c60060Nhg, c60059Nhf);
        C72818Shy.LIZLLL(eventName, c60059Nhf);
        LIZLLL();
    }
}
