package com.ss.android.ugc.aweme.nows.feed.event;

import X.C195247lQ;
import X.C48841JEv;
import X.C64962gm;
import X.EXV;
import X.InterfaceC195257lR;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowEventRegistry<T> {
    public final C64962gm LIZ = C48841JEv.LIZ(EXV.LIZ);
    public final ConcurrentHashMap<InterfaceC195257lR<T>, Object> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZ(T t) {
        Iterator<Map.Entry<InterfaceC195257lR<T>, Object>> it = this.LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            XKX.LIZLLL(this.LIZ, null, null, new C195247lQ(it.next(), t, null), 3);
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, final InterfaceC195257lR<T> interfaceC195257lR) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        Object putIfAbsent = this.LIZIZ.putIfAbsent(interfaceC195257lR, lifecycleOwner);
        if (putIfAbsent != null) {
            o.LJ(putIfAbsent, lifecycleOwner);
            return;
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(new LifecycleEventObserver(this) { // from class: com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry$observe$3
                public final /* synthetic */ NowEventRegistry<T> LJLIL;

                {
                    this.LJLIL = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.LJLIL.LIZIZ.remove(interfaceC195257lR);
                    }
                }
            });
        }
    }
}
