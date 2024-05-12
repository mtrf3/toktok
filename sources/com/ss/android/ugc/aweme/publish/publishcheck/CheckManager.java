package com.ss.android.ugc.aweme.publish.publishcheck;

import X.C221108m2;
import X.C42147GgR;
import X.C42149GgT;
import X.C62822Ol8;
import X.EnumC42155GgZ;
import X.H78;
import X.InterfaceC42153GgX;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CheckManager {
    public static final CheckManager LIZ = new CheckManager();
    public static final HashMap<LifecycleOwner, C42149GgT> LIZIZ = new HashMap<>();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C42147GgR.LJLIL);

    public final void LIZLLL(C42149GgT checker) {
        o.LJIIIZ(checker, "checker");
        synchronized (this) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("releaseChecker, name = ");
            LIZ2.append(checker.LIZ);
            H78.LIZIZ("CheckManager", X1D.LIZIZ(LIZ2));
            Set<Map.Entry<LifecycleOwner, C42149GgT>> entrySet = LIZIZ.entrySet();
            o.LJIIIIZZ(entrySet, "checkMap.entries");
            LifecycleOwner lifecycleOwner = null;
            for (Map.Entry<LifecycleOwner, C42149GgT> entry : entrySet) {
                if (o.LJ(entry.getValue(), checker)) {
                    lifecycleOwner = entry.getKey();
                }
            }
        }
    }

    public static C42149GgT LIZIZ(LifecycleOwner lifecycleOwner, String str) {
        return LIZ.LIZ(lifecycleOwner, str, ((Number) LIZJ.getValue()).intValue());
    }

    public final C42149GgT LIZ(LifecycleOwner owner, String name, int i) {
        C42149GgT LIZJ2;
        EnumC42155GgZ enumC42155GgZ;
        C42149GgT c42149GgT;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(name, "name");
        synchronized (this) {
            HashMap<LifecycleOwner, C42149GgT> hashMap = LIZIZ;
            if (hashMap.get(owner) != null) {
                C42149GgT c42149GgT2 = hashMap.get(owner);
                EnumC42155GgZ enumC42155GgZ2 = null;
                if (c42149GgT2 != null) {
                    enumC42155GgZ = c42149GgT2.LJIIJJI;
                } else {
                    enumC42155GgZ = null;
                }
                if (enumC42155GgZ != EnumC42155GgZ.CANCELED) {
                    C42149GgT c42149GgT3 = hashMap.get(owner);
                    if (c42149GgT3 != null) {
                        enumC42155GgZ2 = c42149GgT3.LJIIJJI;
                    }
                    if (enumC42155GgZ2 != EnumC42155GgZ.END && ((c42149GgT = hashMap.get(owner)) == null || !c42149GgT.LIZIZ())) {
                        C42149GgT c42149GgT4 = hashMap.get(owner);
                        if (c42149GgT4 != null) {
                            LIZJ2 = c42149GgT4;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }
            LIZJ2 = LIZ.LIZJ(owner, name, i);
        }
        return LIZJ2;
    }

    public final C42149GgT LIZJ(final LifecycleOwner lifecycleOwner, String str, int i) {
        C42149GgT c42149GgT;
        synchronized (this) {
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.publish.publishcheck.CheckManager$newChecker$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    EnumC42155GgZ enumC42155GgZ;
                    EnumC42155GgZ enumC42155GgZ2;
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C42149GgT c42149GgT2 = CheckManager.LIZIZ.get(LifecycleOwner.this);
                        if (c42149GgT2 != null && (enumC42155GgZ = c42149GgT2.LJIIJJI) == EnumC42155GgZ.RUNNING && enumC42155GgZ != (enumC42155GgZ2 = EnumC42155GgZ.CANCELED) && enumC42155GgZ != EnumC42155GgZ.END) {
                            c42149GgT2.LJIIJJI = enumC42155GgZ2;
                            Iterator it = ((ArrayList) c42149GgT2.LJI).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC42153GgX) it.next()).onCancel();
                            }
                            CheckManager.LIZ.LIZLLL(c42149GgT2);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("canceled by code, reason: ");
                            LIZ2.append("destroyed owner");
                            C42149GgT.LJ(X1D.LIZIZ(LIZ2));
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("status when cancelCheck ");
                            LIZ3.append(c42149GgT2.LJIIJJI);
                            C42149GgT.LJ(X1D.LIZIZ(LIZ3));
                        }
                        CheckManager.LIZIZ.remove(LifecycleOwner.this);
                    }
                }
            });
            c42149GgT = new C42149GgT(str, i);
            LIZIZ.put(lifecycleOwner, c42149GgT);
        }
        return c42149GgT;
    }
}
