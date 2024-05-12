package com.bytedance.router.arg;

import X.C65777Prh;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.gson.internal.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RouteArgInjector {
    public static final RouteArgInjector INSTANCE = new RouteArgInjector();
    public static final ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> map = new ConcurrentHashMap<>();

    public final void inject(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> concurrentHashMap = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().get() == owner) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC65784Pro) it2.next()).invoke();
            }
        }
    }

    public final void register(final LifecycleOwner lifecycleOwner, final InterfaceC65784Pro<C76800UCe> onInjected) {
        o.LJIIIZ(onInjected, "onInjected");
        if (lifecycleOwner != null) {
            ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> concurrentHashMap = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> entry : concurrentHashMap.entrySet()) {
                if (entry.getKey().get() == lifecycleOwner) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> concurrentHashMap2 = map;
                WeakReference<LifecycleOwner> weakReference = new WeakReference<>(lifecycleOwner);
                ArrayList arrayList = new ArrayList();
                arrayList.add(onInjected);
                concurrentHashMap2.put(weakReference, arrayList);
                lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.router.arg.RouteArgInjector$register$$inlined$let$lambda$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> concurrentHashMap3 = RouteArgInjector.map;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> entry2 : concurrentHashMap3.entrySet()) {
                            if (entry2.getKey().get() == LifecycleOwner.this) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        ConcurrentHashMap<WeakReference<LifecycleOwner>, List<InterfaceC65784Pro<C76800UCe>>> concurrentHashMap4 = RouteArgInjector.map;
                        Set elements = linkedHashMap2.keySet();
                        Set<WeakReference<LifecycleOwner>> keySet = concurrentHashMap4.keySet();
                        o.LJIIIZ(keySet, "<this>");
                        o.LJIIIZ(elements, "elements");
                        C65777Prh.LIZ(keySet).removeAll(b.LJII(elements, keySet));
                    }
                });
                return;
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list != null) {
                    list.add(onInjected);
                }
            }
        }
    }
}
