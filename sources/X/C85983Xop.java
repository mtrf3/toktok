package X;

import Y.AObserverS67S0200000_3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xop, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85983Xop extends G4A {
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

    public final C61713OJx LJIILLIIL(Fragment fragment) {
        C61713OJx LIZIZ = C61712OJw.LIZIZ(fragment);
        LIZIZ.LIZ(LJIILL().LJLILLLLZI);
        return LIZIZ;
    }

    @Override // X.G48, X.InterfaceC87439YTj
    public final void LJFF(FragmentManager fm, BaseFragment f, View v, Bundle bundle) {
        BaseFragment baseFragment;
        BaseFragment baseFragment2;
        BaseFragment baseFragment3;
        BaseFragment baseFragment4;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        super.LJFF(fm, f, v, bundle);
        if (!LJIILL().LJLJI && !(f.getParentFragment() instanceof TuxSheet)) {
            C61713OJx LJIILLIIL = LJIILLIIL(f);
            if (LJIILL().LJLIL != -1) {
                LJIILLIIL.LJI(LJIILL().LJLIL);
            }
            LJIILL().getClass();
            if (LJIILL().LJLJJL) {
                LJIILLIIL.LIZIZ.LJIIL();
            }
            if (LJIILL().LJLJJI) {
                LJIILLIIL.LIZIZ.LJIIJ(true);
            } else {
                LJIILLIIL.LIZ(LJIILL().LJLILLLLZI);
            }
            if (LJIILL().LJLJLJ != -1) {
                LJIILLIIL.LJII(LJIILL().LJLJLJ);
            }
            if (LJIILL().LJLJJLL != -1) {
                LJIILLIIL.LIZLLL(LJIILL().LJLJJLL);
            }
            if (LJIILL().LJLJLLL != -1) {
                LJIILLIIL.LJ(LJIILL().LJLJLLL);
            }
            LJIILLIIL.LIZJ();
            C85982Xoo c85982Xoo = new TBV() { // from class: X.Xoo
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLIL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLIL = ((Number) obj2).intValue();
                }
            };
            AqS146S0200000_15 aqS146S0200000_15 = new AqS146S0200000_15(this, f, 69);
            C68322mC c68322mC = new C68322mC();
            WeakReference<BaseFragment> weakReference = this.LIZIZ;
            if (weakReference != null && (baseFragment4 = weakReference.get()) != null) {
                C85972Xoe subscribeStore = baseFragment4.getViewModel().getSubscribeStore();
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
                    Transformations.map(liveData, new C85980Xom(c85982Xoo)).observe(baseFragment4, new AObserverS67S0200000_3(c68322mC, aqS146S0200000_15, 6));
                }
            }
            C85989Xov c85989Xov = new TBV() { // from class: X.Xov
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJLJ);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJLJ = ((Number) obj2).intValue();
                }
            };
            AqS146S0200000_15 aqS146S0200000_152 = new AqS146S0200000_15(this, f, 70);
            C68322mC c68322mC2 = new C68322mC();
            WeakReference<BaseFragment> weakReference2 = this.LIZIZ;
            if (weakReference2 != null && (baseFragment3 = weakReference2.get()) != null) {
                C85972Xoe subscribeStore2 = baseFragment3.getViewModel().getSubscribeStore();
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
                    Transformations.map(liveData2, new C85980Xom(c85989Xov)).observe(baseFragment3, new AObserverS67S0200000_3(c68322mC2, aqS146S0200000_152, 6));
                }
            }
            C85985Xor c85985Xor = new TBV() { // from class: X.Xor
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJJLL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJJLL = ((Number) obj2).intValue();
                }
            };
            AqS146S0200000_15 aqS146S0200000_153 = new AqS146S0200000_15(this, f, 71);
            C68322mC c68322mC3 = new C68322mC();
            WeakReference<BaseFragment> weakReference3 = this.LIZIZ;
            if (weakReference3 != null && (baseFragment2 = weakReference3.get()) != null) {
                C85972Xoe subscribeStore3 = baseFragment2.getViewModel().getSubscribeStore();
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
                    Transformations.map(liveData3, new C85980Xom(c85985Xor)).observe(baseFragment2, new AObserverS67S0200000_3(c68322mC3, aqS146S0200000_153, 6));
                }
            }
            C85987Xot c85987Xot = new TBV() { // from class: X.Xot
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C43212Gxc) obj).LJLJLLL);
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C43212Gxc) obj).LJLJLLL = ((Number) obj2).intValue();
                }
            };
            AqS146S0200000_15 aqS146S0200000_154 = new AqS146S0200000_15(this, f, 72);
            C68322mC c68322mC4 = new C68322mC();
            WeakReference<BaseFragment> weakReference4 = this.LIZIZ;
            if (weakReference4 == null || (baseFragment = weakReference4.get()) == null) {
                return;
            }
            C85972Xoe subscribeStore4 = baseFragment.getViewModel().getSubscribeStore();
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
            Transformations.map(liveData4, new C85980Xom(c85987Xot)).observe(baseFragment, new AObserverS67S0200000_3(c68322mC4, aqS146S0200000_154, 6));
        }
    }
}
