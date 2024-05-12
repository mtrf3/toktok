package com.ss.android.ug.bus;

import X.C16880lQ;
import X.QTC;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class UgCallbackCenter {
    public static final Object LIZ = new Object();
    public static final ConcurrentHashMap<Type, ConcurrentHashMap<QTC, Object>> LIZIZ = new ConcurrentHashMap<>();
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public static <Event> void LIZ(Event event) {
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            LIZJ.post(new ARunnableS47S0100000_11(event, 44));
            return;
        }
        ConcurrentHashMap<QTC, Object> concurrentHashMap = LIZIZ.get(event.getClass());
        if (concurrentHashMap != null) {
            for (QTC qtc : concurrentHashMap.keySet()) {
                if (qtc != null) {
                    qtc.LIZ(event);
                }
            }
        }
    }

    public static <EVENT> void LIZIZ(LifecycleOwner lifecycleOwner, final QTC<EVENT> qtc) {
        if (qtc == null) {
            return;
        }
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            LIZJ.post(new ARunnableS30S0200000_11(qtc, lifecycleOwner, 15));
            return;
        }
        final Type type = ((ParameterizedType) qtc.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        ConcurrentHashMap<Type, ConcurrentHashMap<QTC, Object>> concurrentHashMap = LIZIZ;
        final ConcurrentHashMap<QTC, Object> concurrentHashMap2 = concurrentHashMap.get(type);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap.put(type, concurrentHashMap2);
        }
        concurrentHashMap2.put(qtc, LIZ);
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ug.bus.UgCallbackCenter.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void onDestroy() {
                    concurrentHashMap2.remove(qtc);
                    if (concurrentHashMap2.isEmpty()) {
                        UgCallbackCenter.LIZIZ.remove(type);
                    }
                }
            });
        }
    }
}
