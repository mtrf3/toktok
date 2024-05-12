package com.bytedance.otis.ultimate.inflater.compat.lifecycle;

import X.C37692Eqm;
import X.FEH;
import X.FEM;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AndroidXLifecycleOwner implements GenericLifecycleObserver, FEH {
    public final List<FEM> LJLIL = new ArrayList();
    public final Activity LJLILLLLZI;

    @Override // X.FEH
    public final String getType() {
        return "androidx-lifecycle";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        }
    }

    @Override // X.FEH
    public final Activity getActivity() {
        return this.LJLILLLLZI;
    }

    public AndroidXLifecycleOwner(Activity activity) {
        this.LJLILLLLZI = activity;
    }

    @Override // X.FEH
    public final void LIZ(FEM observer) {
        o.LJIIJ(observer, "observer");
        if (((ArrayList) this.LJLIL).isEmpty()) {
            ComponentCallbacks2 componentCallbacks2 = this.LJLILLLLZI;
            if (componentCallbacks2 != null) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            }
        }
        ((ArrayList) this.LJLIL).add(observer);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIJ(owner, "owner");
        Iterator<FEM> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(this);
        }
        ((ArrayList) this.LJLIL).clear();
    }
}
