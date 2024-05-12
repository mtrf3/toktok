package com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split;

import X.ActivityC45651qj;
import X.C81202Vtu;
import X.LEO;
import X.LKF;
import X.LKG;
import X.ORZ;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SplitContainerManager {
    public static final HashMap<String, WeakReference<LKF>> LIZ = new HashMap<>();
    public static final HashMap<Integer, List<String>> LIZIZ = new HashMap<>();
    public static final HashMap<Integer, String> LIZJ = new HashMap<>();
    public static final LifecycleEventObserver LIZLLL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.SplitContainerManager$lifeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            o.LJIIIZ(source, "source");
            o.LJIIIZ(event, "event");
            if ((source instanceof Activity) && event == Lifecycle.Event.ON_DESTROY) {
                int hashCode = source.hashCode();
                HashMap<Integer, List<String>> hashMap = SplitContainerManager.LIZIZ;
                if (hashMap.containsKey(Integer.valueOf(hashCode))) {
                    List<String> list = hashMap.get(Integer.valueOf(hashCode));
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            SplitContainerManager.LIZ.remove(it.next());
                        }
                    }
                    SplitContainerManager.LIZIZ.remove(Integer.valueOf(hashCode));
                }
            }
        }
    };

    public static LKF LIZIZ(Integer num) {
        WeakReference<LKF> weakReference;
        if (!LEO.LIZJ() || num == null) {
            return null;
        }
        int intValue = num.intValue();
        String str = LIZJ.get(Integer.valueOf(intValue));
        List<String> list = LIZIZ.get(Integer.valueOf(intValue));
        if (list == null || !ORZ.LJLJJI(str, list) || (weakReference = LIZ.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static LKF LIZ(String tag, Fragment fragment, View view, boolean z) {
        LKF lkf;
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
            HashMap<String, WeakReference<LKF>> hashMap = LIZ;
            WeakReference<LKF> weakReference = hashMap.get(tag);
            if (weakReference == null || (lkf = weakReference.get()) == null) {
                if (LEO.LIZJ()) {
                    C81202Vtu c81202Vtu = new C81202Vtu(mo49getActivity, childFragmentManager, view, z);
                    hashMap.put(tag, new WeakReference<>(c81202Vtu));
                    int hashCode = mo49getActivity.hashCode();
                    HashMap<Integer, List<String>> hashMap2 = LIZIZ;
                    List<String> list = hashMap2.get(Integer.valueOf(hashCode));
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(tag);
                    hashMap2.put(Integer.valueOf(hashCode), list);
                    LIZJ.put(Integer.valueOf(hashCode), tag);
                    mo49getActivity.getLifecycle().addObserver(LIZLLL);
                    return c81202Vtu;
                }
                return new LKG(view);
            }
            return lkf;
        }
        return new LKG(view);
    }
}
