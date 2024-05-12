package X;

import X.X6T;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$Companion$setupTrack$observer$1;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X6V {
    public static void LIZIZ(View view, InterfaceC65784Pro id, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(id, "id");
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (LJIIIZ != null) {
            LIZ(view, LJIIIZ, (String) id.invoke(), interfaceC88472Yns);
            return;
        }
        ActivityC45651qj LJ = C1DG.LJ(view, "context");
        if (LJ != null) {
            LIZ(view, LJ, (String) id.invoke(), interfaceC88472Yns);
        } else {
            C78983UzD.LJIILL("logWhenShow fail to report");
        }
    }

    public static void LIZ(View view, LifecycleOwner lifecycleOwner, String id, InterfaceC88472Yns interfaceC88472Yns) {
        X6T x6t;
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(id, "id");
        if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
            HashMap<LifecycleOwner, LifecycleEventObserver> hashMap = X6T.LJIIL;
            if (!hashMap.containsKey(lifecycleOwner)) {
                ECViewTracker$Companion$setupTrack$observer$1 eCViewTracker$Companion$setupTrack$observer$1 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$Companion$setupTrack$observer$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            X6T.LJIIJJI.remove(source);
                            X6T.LJIIL.remove(source);
                        }
                    }
                };
                hashMap.put(lifecycleOwner, eCViewTracker$Companion$setupTrack$observer$1);
                if (e1.LIZ(31744, "ecom_logmap_memory_leak_settings", true, true)) {
                    lifecycleOwner.getLifecycle().addObserver(eCViewTracker$Companion$setupTrack$observer$1);
                }
            }
            ConcurrentHashMap<LifecycleOwner, CopyOnWriteArraySet<String>> concurrentHashMap = X6T.LJIIJJI;
            if (!concurrentHashMap.containsKey(lifecycleOwner)) {
                concurrentHashMap.put(lifecycleOwner, new CopyOnWriteArraySet<>());
            }
            Object tag = view.getTag(R.id.clj);
            if (tag instanceof X6T) {
                x6t = (X6T) tag;
            } else {
                x6t = null;
            }
            if (x6t != null) {
                XKQ xkq = x6t.LJIIIIZZ;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                x6t.LJIIIIZZ = null;
                x6t.LIZJ = id;
                x6t.LIZLLL = interfaceC88472Yns;
                x6t.LJI = false;
                return;
            }
            X6T x6t2 = new X6T(view, lifecycleOwner, id, interfaceC88472Yns);
            view.setTag(R.id.clj, x6t2);
            x6t2.LIZ.getViewTreeObserver().addOnPreDrawListener(x6t2.LJIIIZ);
            x6t2.LIZ.addOnAttachStateChangeListener(x6t2.LJIIJ);
            x6t2.LJII = false;
            return;
        }
        throw new IllegalThreadStateException("must in main thread");
    }
}
