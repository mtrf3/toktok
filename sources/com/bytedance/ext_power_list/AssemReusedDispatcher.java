package com.bytedance.ext_power_list;

import X.C16880lQ;
import X.C212868Xa;
import X.C8VV;
import X.C8VZ;
import X.InterfaceC212998Xn;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AssemReusedDispatcher<R extends InterfaceC212998Xn<R, ITEM>, ITEM> {
    public ReusedUIAssem<?> LIZ;
    public final AssemReusedDispatcher$dispatcher$1 LIZIZ = new LifecycleEventObserver(this) { // from class: com.bytedance.ext_power_list.AssemReusedDispatcher$dispatcher$1
        public final /* synthetic */ AssemReusedDispatcher<R, ITEM> LJLIL;

        {
            this.LJLIL = this;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
            o.LJIIIZ(event, "event");
            ReusedUIAssem<?> reusedUIAssem = this.LJLIL.LIZ;
            if (reusedUIAssem == null) {
                return;
            }
            switch (C212868Xa.LIZ[event.ordinal()]) {
                case 1:
                    Lifecycle.State currentState = reusedUIAssem.getLifecycle().getCurrentState();
                    Lifecycle.State state = Lifecycle.State.CREATED;
                    if (C16880lQ.LLJJIJIL(currentState, state) < 0) {
                        reusedUIAssem.onCreate();
                    } else {
                        if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) > 0) {
                            reusedUIAssem.onPause();
                        }
                        if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), state) > 0) {
                            reusedUIAssem.onStop();
                        }
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                    return;
                case 2:
                    Lifecycle.State currentState2 = reusedUIAssem.getLifecycle().getCurrentState();
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (C16880lQ.LLJJIJIL(currentState2, state2) < 0) {
                        if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                            reusedUIAssem.onCreate();
                        }
                        reusedUIAssem.onStart();
                    } else if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), state2) > 0) {
                        reusedUIAssem.onPause();
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_START);
                    return;
                case 3:
                    if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) < 0) {
                        if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                            reusedUIAssem.onCreate();
                        }
                        if (C16880lQ.LLJJIJIL(reusedUIAssem.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) < 0) {
                            reusedUIAssem.onStart();
                        }
                        reusedUIAssem.onResume();
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                    return;
                case 4:
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                    reusedUIAssem.onPause();
                    return;
                case 5:
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                    reusedUIAssem.onStop();
                    return;
                case 6:
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                    reusedUIAssem.onDestroy();
                    return;
                default:
                    return;
            }
        }
    };

    public final void LIZ(C8VZ c8vz, ReusedUIAssem assem, View containerView, LifecycleOwner lifecycle, C8VZ component) {
        o.LJIIIZ(c8vz, "<this>");
        o.LJIIIZ(assem, "assem");
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(component, "component");
        this.LIZ = assem;
        C8VV.LJ(c8vz, new AqS49S0400000_3(assem, (ReusedUIAssem<?>) containerView, (View) component, (C8VZ) lifecycle, (LifecycleOwner) 17));
    }
}
