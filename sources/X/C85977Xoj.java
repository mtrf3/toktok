package X;

import Y.AObserverS67S0200000_3;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Xoj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85977Xoj extends G46 {
    public final C43212Gxc LIZJ = new C43212Gxc(0, false, 7);

    public final C43212Gxc LJIILL() {
        InterfaceC28616BKy interfaceC28616BKy;
        InterfaceC28616BKy interfaceC28616BKy2;
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        while (true) {
            interfaceC28616BKy = null;
            if (it.hasNext()) {
                interfaceC28616BKy2 = it.next();
                if (interfaceC28616BKy2 instanceof C43212Gxc) {
                    break;
                }
            } else {
                interfaceC28616BKy2 = null;
                break;
            }
        }
        if (interfaceC28616BKy2 instanceof C43212Gxc) {
            interfaceC28616BKy = interfaceC28616BKy2;
        }
        C43212Gxc c43212Gxc = (C43212Gxc) interfaceC28616BKy;
        if (c43212Gxc == null) {
            return this.LIZJ;
        }
        return c43212Gxc;
    }

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        ActivityC86117Xqz activityC86117Xqz;
        ActivityC86117Xqz activityC86117Xqz2;
        ActivityC86117Xqz activityC86117Xqz3;
        ActivityC86117Xqz activityC86117Xqz4;
        int i;
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        if (JF4.LIZ == 26) {
            TypedValue typedValue = new TypedValue();
            Window window = activity.getWindow();
            boolean z = true;
            if (!activity.getTheme().resolveAttribute(R.attr.bxw, typedValue, true) || typedValue.data == 0) {
                z = false;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                i = systemUiVisibility | 16;
            } else {
                i = systemUiVisibility & (-17);
            }
            if (i != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
        if (!LJIILL().LJLJI) {
            C43211Gxb.LIZ(activity, LJIILL());
            C85981Xon c85981Xon = new TBV() { // from class: X.Xon
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLIL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLIL = ((Number) obj2).intValue();
                }
            };
            C62845OlV c62845OlV = new TBV() { // from class: X.OlV
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C43212Gxc) obj).LJLJJI);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJJI = ((Boolean) obj2).booleanValue();
                }
            };
            AqS170S0200000_7 aqS170S0200000_7 = new AqS170S0200000_7(this, activity, 0);
            C68322mC c68322mC = new C68322mC();
            WeakReference<ActivityC86117Xqz> weakReference = this.LIZIZ;
            if (weakReference != null && (activityC86117Xqz4 = weakReference.get()) != null) {
                C85972Xoe subscribeStore = activityC86117Xqz4.getViewModel().getSubscribeStore();
                if (!subscribeStore.LIZ.containsKey(C43212Gxc.class)) {
                    subscribeStore.LIZ.put(C43212Gxc.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) subscribeStore.LIZ;
                LiveData liveData = (LiveData) linkedHashMap.get(C43212Gxc.class);
                if (linkedHashMap.containsKey(C43212Gxc.class) && liveData == null) {
                    liveData = new MutableLiveData();
                    linkedHashMap.put(C43212Gxc.class, liveData);
                }
                if ((liveData instanceof LiveData) && liveData != null) {
                    Transformations.map(liveData, new C85978Xok(c85981Xon, c62845OlV)).observe(activityC86117Xqz4, new AObserverS67S0200000_3(c68322mC, aqS170S0200000_7, 15));
                }
            }
            C85984Xoq c85984Xoq = new TBV() { // from class: X.Xoq
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJJLL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJJLL = ((Number) obj2).intValue();
                }
            };
            AqS138S0200000_7 aqS138S0200000_7 = new AqS138S0200000_7(this, activity, 6);
            C68322mC c68322mC2 = new C68322mC();
            WeakReference<ActivityC86117Xqz> weakReference2 = this.LIZIZ;
            if (weakReference2 != null && (activityC86117Xqz3 = weakReference2.get()) != null) {
                C85972Xoe subscribeStore2 = activityC86117Xqz3.getViewModel().getSubscribeStore();
                if (!subscribeStore2.LIZ.containsKey(C43212Gxc.class)) {
                    subscribeStore2.LIZ.put(C43212Gxc.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) subscribeStore2.LIZ;
                LiveData liveData2 = (LiveData) linkedHashMap2.get(C43212Gxc.class);
                if (linkedHashMap2.containsKey(C43212Gxc.class) && liveData2 == null) {
                    liveData2 = new MutableLiveData();
                    linkedHashMap2.put(C43212Gxc.class, liveData2);
                }
                if ((liveData2 instanceof LiveData) && liveData2 != null) {
                    Transformations.map(liveData2, new C85979Xol(c85984Xoq)).observe(activityC86117Xqz3, new AObserverS67S0200000_3(c68322mC2, aqS138S0200000_7, 14));
                }
            }
            C85986Xos c85986Xos = new TBV() { // from class: X.Xos
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJLLL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJLLL = ((Number) obj2).intValue();
                }
            };
            AqS138S0200000_7 aqS138S0200000_72 = new AqS138S0200000_7(this, activity, 7);
            C68322mC c68322mC3 = new C68322mC();
            WeakReference<ActivityC86117Xqz> weakReference3 = this.LIZIZ;
            if (weakReference3 != null && (activityC86117Xqz2 = weakReference3.get()) != null) {
                C85972Xoe subscribeStore3 = activityC86117Xqz2.getViewModel().getSubscribeStore();
                if (!subscribeStore3.LIZ.containsKey(C43212Gxc.class)) {
                    subscribeStore3.LIZ.put(C43212Gxc.class, new MutableLiveData<>());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) subscribeStore3.LIZ;
                LiveData liveData3 = (LiveData) linkedHashMap3.get(C43212Gxc.class);
                if (linkedHashMap3.containsKey(C43212Gxc.class) && liveData3 == null) {
                    liveData3 = new MutableLiveData();
                    linkedHashMap3.put(C43212Gxc.class, liveData3);
                }
                if ((liveData3 instanceof LiveData) && liveData3 != null) {
                    Transformations.map(liveData3, new C85979Xol(c85986Xos)).observe(activityC86117Xqz2, new AObserverS67S0200000_3(c68322mC3, aqS138S0200000_72, 14));
                }
            }
            C85988Xou c85988Xou = new TBV() { // from class: X.Xou
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJLJ);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJLJ = ((Number) obj2).intValue();
                }
            };
            AqS138S0200000_7 aqS138S0200000_73 = new AqS138S0200000_7(this, activity, 8);
            C68322mC c68322mC4 = new C68322mC();
            WeakReference<ActivityC86117Xqz> weakReference4 = this.LIZIZ;
            if (weakReference4 == null || (activityC86117Xqz = weakReference4.get()) == null) {
                return;
            }
            C85972Xoe subscribeStore4 = activityC86117Xqz.getViewModel().getSubscribeStore();
            if (!subscribeStore4.LIZ.containsKey(C43212Gxc.class)) {
                subscribeStore4.LIZ.put(C43212Gxc.class, new MutableLiveData<>());
            }
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) subscribeStore4.LIZ;
            LiveData liveData4 = (LiveData) linkedHashMap4.get(C43212Gxc.class);
            if (linkedHashMap4.containsKey(C43212Gxc.class) && liveData4 == null) {
                liveData4 = new MutableLiveData();
                linkedHashMap4.put(C43212Gxc.class, liveData4);
            }
            if (!(liveData4 instanceof LiveData) || liveData4 == null) {
                return;
            }
            Transformations.map(liveData4, new C85979Xol(c85988Xou)).observe(activityC86117Xqz, new AObserverS67S0200000_3(c68322mC4, aqS138S0200000_73, 14));
        }
    }
}
