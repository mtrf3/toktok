package com.ss.android.ugc.aweme.ecommerce.slark.impl;

import X.C16880lQ;
import X.C25620zW;
import X.C36636EZk;
import X.C64682gK;
import X.C68142lu;
import X.C68212m1;
import X.C70576Rmu;
import X.C70858RrS;
import X.C70996Rtg;
import X.C76800UCe;
import X.C780334l;
import X.C78948Uye;
import X.C79234V7u;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.X1D;
import X.XKX;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrackNodeStore {
    public static final ConcurrentHashMap<String, C68212m1> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<LifecycleOwner, String> LIZIZ = new ConcurrentHashMap<>();
    public static final LifecycleObserver LIZJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore$observer$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            ConcurrentHashMap<String, C68212m1> concurrentHashMap;
            C68212m1 remove;
            C68212m1 c68212m1;
            String str;
            o.LJIIIZ(source, "source");
            o.LJIIIZ(event, "event");
            if (event == Lifecycle.Event.ON_DESTROY) {
                String str2 = TrackNodeStore.LIZIZ.get(source);
                if (str2 != null && (remove = (concurrentHashMap = TrackNodeStore.LIZ).remove(str2)) != null && remove.LJLJJI) {
                    InterfaceC71003Rtn interfaceC71003Rtn = remove.LJLJI;
                    if ((interfaceC71003Rtn instanceof C68212m1) && (c68212m1 = (C68212m1) interfaceC71003Rtn) != null && (str = c68212m1.LJLIL) != null) {
                        concurrentHashMap.remove(str);
                    }
                }
                XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ.LJJIJIL(), null, new C68142lu(source, null), 2);
            }
        }
    };

    public static String LIZIZ(Object obj) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fn_");
        LIZ2.append(obj.getClass().getName());
        LIZ2.append("__");
        LIZ2.append(obj.hashCode());
        LIZ2.append("__");
        LIZ2.append(System.currentTimeMillis());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZJ(String str) {
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("fn_", str, "__");
        LIZIZ2.append(System.currentTimeMillis());
        return X1D.LIZIZ(LIZIZ2);
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, String str) {
        ConcurrentHashMap<LifecycleOwner, String> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(lifecycleOwner) == null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycleOwner.getLifecycle().addObserver(LIZJ);
            concurrentHashMap.put(lifecycleOwner, str);
        }
    }

    public static final C68212m1 LIZLLL(LifecycleOwner owner, String str) {
        o.LJIIIZ(owner, "owner");
        ConcurrentHashMap<String, C68212m1> concurrentHashMap = LIZ;
        if (str == null) {
            return null;
        }
        C68212m1 c68212m1 = concurrentHashMap.get(str);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LIZ(owner, str);
        } else {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ.LJJIJIL(), null, new C64682gK(owner, str, null), 2);
        }
        return c68212m1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C68212m1 LJ(View view, InterfaceC88472Yns<? super C70858RrS, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(view, "view");
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
        if (LJIILIIL != 0) {
            view = LJIILIIL;
        }
        String LIZIZ2 = LIZIZ(view);
        C70576Rmu c70576Rmu = new C70576Rmu();
        InterfaceC71003Rtn interfaceC71003Rtn = null;
        if (LJIILIIL != 0) {
            C70996Rtg.LIZ(LJIILIIL, c70576Rmu, true, null);
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c70576Rmu);
        }
        if (LJIILIIL != 0) {
            interfaceC71003Rtn = C79234V7u.LJIILL(LJIILIIL);
        }
        C68212m1 c68212m1 = new C68212m1(LIZIZ2, c70576Rmu, interfaceC71003Rtn, false);
        LIZ.put(LIZIZ2, c68212m1);
        return c68212m1;
    }

    public static final C68212m1 LJFF(InterfaceC71003Rtn trackNode, InterfaceC88472Yns<? super C70858RrS, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(trackNode, "trackNode");
        String LIZIZ2 = LIZIZ(trackNode);
        C70576Rmu c70576Rmu = new C70576Rmu();
        C70996Rtg.LIZ(trackNode, c70576Rmu, true, null);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c70576Rmu);
        }
        C68212m1 c68212m1 = new C68212m1(LIZIZ2, c70576Rmu, C79234V7u.LJIILL(trackNode), false);
        ConcurrentHashMap<String, C68212m1> concurrentHashMap = LIZ;
        concurrentHashMap.put(LIZIZ2, c68212m1);
        if (trackNode instanceof C68212m1) {
            concurrentHashMap.remove(((C68212m1) trackNode).LJLIL);
        }
        return c68212m1;
    }
}
