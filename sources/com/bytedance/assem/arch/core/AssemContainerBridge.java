package com.bytedance.assem.arch.core;

import X.ActivityC45651qj;
import X.C0MB;
import X.C16880lQ;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78880UxY;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.OHQ;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AssemContainerBridge extends Fragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C0MB<InterfaceC88473Ynt<Integer, Integer, Intent, C76800UCe>> LJLIL = new C0MB<>();
    public final C0MB<InterfaceC88472Yns<int[], C76800UCe>> LJLILLLLZI = new C0MB<>();
    public final Set<InterfaceC65784Pro<C76800UCe>> LJLJI = new LinkedHashSet();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<InterfaceC65784Pro<C76800UCe>> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.LJLJI.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC88473Ynt<Integer, Integer, Intent, C76800UCe> LJ = this.LJLIL.LJ(i, null);
        if (LJ != null) {
            LJ.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
            this.LJLIL.LJII(i);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        InterfaceC88472Yns<int[], C76800UCe> LJ = this.LJLILLLLZI.LJ(i, null);
        if (LJ != null) {
            LJ.invoke(grantResults);
            this.LJLILLLLZI.LJII(i);
        }
    }

    public final void vl(final LifecycleOwner lifecycleOwner, Intent intent, final int i, Bundle bundle, InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(intent, "intent");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (!C78880UxY.LJJLIIIJILLIZJL(requireActivity, lifecycleOwner)) {
                return;
            }
            if (i < 0) {
                C78598Ut0.LJIJJ(intent, this);
                startActivity(intent);
                return;
            } else {
                this.LJLIL.LJI(i, interfaceC88473Ynt);
                C78598Ut0.LJIJJ(intent, this);
                startActivityForResult(intent, i, bundle);
                lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.assem.arch.core.AssemContainerBridge$startActivityForResult$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        LifecycleOwner.this.getLifecycle().removeObserver(this);
                        this.LJLIL.LJII(i);
                    }
                });
                return;
            }
        }
        "This method must be called on main thread".toString();
        throw new IllegalStateException("This method must be called on main thread");
    }
}
