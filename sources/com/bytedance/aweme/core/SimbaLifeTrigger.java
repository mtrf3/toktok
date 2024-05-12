package com.bytedance.aweme.core;

import X.J25;
import X.J27;
import X.J28;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SimbaLifeTrigger implements GenericLifecycleObserver {
    public final List<Long> LJLIL = new ArrayList();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Collection<ArrayList<J25>> values;
        List<Long> transactionId = this.LJLIL;
        o.LJIIJ(transactionId, "transactionId");
        Iterator it = ((ArrayList) transactionId).iterator();
        while (it.hasNext()) {
            ConcurrentHashMap<J27, ArrayList<J25>> concurrentHashMap = J28.LJFF.get(Long.valueOf(((Number) it.next()).longValue()));
            if (concurrentHashMap != null && (values = concurrentHashMap.values()) != null) {
                for (ArrayList<J25> tasks : values) {
                    o.LJFF(tasks, "tasks");
                    synchronized (tasks) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<J25> it2 = tasks.iterator();
                        while (it2.hasNext()) {
                            J25 next = it2.next();
                            if (next.LIZIZ() == J27.ATFIRST) {
                                J28.LJI.remove(next);
                            }
                            arrayList.add(next);
                        }
                        tasks.removeAll(arrayList);
                    }
                }
            }
        }
    }
}
