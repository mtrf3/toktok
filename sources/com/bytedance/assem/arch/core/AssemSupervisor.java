package com.bytedance.assem.arch.core;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212348Va;
import X.C212358Vb;
import X.C212368Vc;
import X.C212378Vd;
import X.C214368bA;
import X.C221108m2;
import X.C39557Ffl;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73098SmU;
import X.C7C3;
import X.C88496YoG;
import X.C8V7;
import X.C8VA;
import X.C8VP;
import X.C8VU;
import X.C8W0;
import X.C8W6;
import X.InterfaceC212388Ve;
import X.InterfaceC65350Pko;
import X.SZE;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AssemSupervisor implements LifecycleEventObserver {
    public static final /* synthetic */ int LJLLLL = 0;
    public final C7C3 LJLIL;
    public final C8VA LJLILLLLZI;
    public final C8VU LJLJI;
    public final C212348Va LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final LifecycleOwner LJLJL;
    public final Context LJLJLJ;
    public volatile boolean LJLJLLL;
    public boolean LJLL;
    public final CopyOnWriteArrayList<C8W0> LJLLI;
    public final ConcurrentHashMap<InterfaceC65350Pko<? extends C8W0>, C8VP> LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public View LJLLL;

    public final List<C8W0> LIZIZ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList = this.LJLLI;
        ArrayList arrayList = new ArrayList();
        Iterator<C8W0> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C8W0 next = it.next();
            C8W0 c8w0 = next;
            if (c8w0.hasLoaded && c8w0.active) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final C7C3 LIZJ() {
        return (C7C3) this.LJLJJL.getValue();
    }

    public final C8VA LIZLLL() {
        return (C8VA) this.LJLJJLL.getValue();
    }

    public final Lifecycle LJ() {
        Lifecycle lifecycle = this.LJLJL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    public final void LJII() {
        Iterator<C8W0> it = this.LJLLI.iterator();
        while (it.hasNext()) {
            C8W0 assem = it.next();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            o.LJIIIIZZ(assem, "assem");
            LJFF(state, assem);
        }
        ((LinkedHashMap) LIZJ().LIZIZ).clear();
        C8VA LIZLLL = LIZLLL();
        ((LinkedHashMap) LIZLLL.LIZIZ).clear();
        ((LinkedHashMap) LIZLLL.LIZJ).clear();
        this.LJLLI.clear();
        this.LJLLILLLL.clear();
        LJ().removeObserver(this);
        this.LJLLL = null;
    }

    public final void LIZ(C8W0 c8w0) {
        AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(c8w0, this, 6);
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            aqS150S0200000_3.invoke();
        } else {
            ((Handler) this.LJLLJ.getValue()).post(new ARunnableS39S0100000_3((Object) aqS150S0200000_3, 13));
        }
    }

    public static void LJFF(Lifecycle.State dstState, C8W0 assem) {
        o.LJIIIZ(dstState, "dstState");
        o.LJIIIZ(assem, "assem");
        int i = C212358Vb.LIZ[dstState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) >= 0) {
                        assem.handleOnPause$assem_release();
                    }
                    if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) >= 0) {
                        assem.handleOnStop$assem_release();
                    }
                    if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                        return;
                    }
                    assem.handleOnDestroy$assem_release();
                    return;
                }
                if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) >= 0) {
                    return;
                }
                if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                    assem.handleOnCreate$assem_release();
                }
                if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) < 0) {
                    assem.handleOnStart$assem_release();
                }
                assem.handleOnResume();
                return;
            }
            Lifecycle.State currentState = assem.getLifecycle().getCurrentState();
            Lifecycle.State state = Lifecycle.State.STARTED;
            if (C16880lQ.LLJJIJIL(currentState, state) < 0) {
                if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                    assem.handleOnCreate$assem_release();
                }
                assem.handleOnStart$assem_release();
                return;
            } else {
                if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), state) <= 0) {
                    return;
                }
                assem.handleOnPause$assem_release();
                return;
            }
        }
        Lifecycle.State currentState2 = assem.getLifecycle().getCurrentState();
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (C16880lQ.LLJJIJIL(currentState2, state2) < 0) {
            assem.handleOnCreate$assem_release();
            return;
        }
        if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) > 0) {
            assem.handleOnPause$assem_release();
        }
        if (C16880lQ.LLJJIJIL(assem.getLifecycle().getCurrentState(), state2) <= 0) {
            return;
        }
        assem.handleOnStop$assem_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJI(C8W0 assem, C8W6 c8w6) {
        o.LJIIIZ(assem, "assem");
        if (C16880lQ.LLJJIJIL(LJ().getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("loadAssem return: ");
                LIZ.append(this);
                LIZ.append(", ");
                LIZ.append(LJ().getCurrentState());
                LIZ.append(", ");
                LIZ.append(assem);
                c8v7.log("AssemList", X1D.LIZIZ(LIZ));
                return false;
            }
            return false;
        }
        if (!this.LJLLI.contains(assem)) {
            String valueOf = String.valueOf(assem.hashCode());
            SZE.LIZ(valueOf, C65352Pkq.LIZ(C88496YoG.class));
            assem.setSupervisor(this);
            assem.setParent(this.LJLJL);
            if (c8w6 != 0) {
                assem.setInteractor(c8w6);
                if (c8w6 instanceof InterfaceC212388Ve) {
                    ((InterfaceC212388Ve) c8w6).LIZ();
                }
            }
            this.LJLLI.add(assem);
            if (!assem.active) {
                assem.triggerLazyLoad(new AqS150S0200000_3(assem, this, 7));
            } else {
                assem.hasLoaded = true;
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88496YoG.class), valueOf, C212378Vd.LJLIL);
            return true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("This assem has already existed: ");
        LIZ2.append(assem);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public final boolean LJIIIIZZ(String str, InterfaceC65350Pko clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (C16880lQ.LLJJIJIL(LJ().getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            return false;
        }
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList = this.LJLLI;
        ArrayList arrayList = new ArrayList();
        Iterator<C8W0> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C8W0 next = it.next();
            if (next.getClass().isAssignableFrom(C39557Ffl.LIZ(clazz))) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C8W0 c8w0 = (C8W0) it2.next();
            if (str == null || o.LJ(c8w0.assemTagInternal, str)) {
                if (true ^ (c8w0 instanceof ReusedAssem)) {
                    if (LJ().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        c8w0.handleOnPause$assem_release();
                    }
                    if (LJ().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        c8w0.handleOnStop$assem_release();
                    }
                    if (LJ().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        c8w0.handleOnDestroy$assem_release();
                    }
                    this.LJLLI.remove(c8w0);
                } else {
                    "ReusedAssem is not support unload!".toString();
                    throw new IllegalStateException("ReusedAssem is not support unload!");
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        switch (C212358Vb.LIZIZ[event.ordinal()]) {
            case 1:
                CopyOnWriteArrayList<C8W0> copyOnWriteArrayList = this.LJLLI;
                ArrayList arrayList = new ArrayList();
                Iterator<C8W0> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C8W0 next = it.next();
                    if (next.active) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C8W0 it3 = (C8W0) it2.next();
                    Lifecycle.State state = Lifecycle.State.CREATED;
                    o.LJIIIIZZ(it3, "it");
                    LJFF(state, it3);
                }
                return;
            case 2:
                CopyOnWriteArrayList<C8W0> copyOnWriteArrayList2 = this.LJLLI;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C8W0> it4 = copyOnWriteArrayList2.iterator();
                while (it4.hasNext()) {
                    C8W0 next2 = it4.next();
                    C8W0 c8w0 = next2;
                    if (c8w0.active && c8w0.hasLoaded) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C8W0 it6 = (C8W0) it5.next();
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    o.LJIIIIZZ(it6, "it");
                    LJFF(state2, it6);
                }
                return;
            case 3:
                CopyOnWriteArrayList<C8W0> copyOnWriteArrayList3 = this.LJLLI;
                ArrayList arrayList3 = new ArrayList();
                Iterator<C8W0> it7 = copyOnWriteArrayList3.iterator();
                while (it7.hasNext()) {
                    C8W0 next3 = it7.next();
                    C8W0 c8w02 = next3;
                    if (c8w02.active && c8w02.hasLoaded) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    C8W0 it9 = (C8W0) it8.next();
                    Lifecycle.State state3 = Lifecycle.State.RESUMED;
                    o.LJIIIIZZ(it9, "it");
                    LJFF(state3, it9);
                }
                return;
            case 4:
                CopyOnWriteArrayList<C8W0> copyOnWriteArrayList4 = this.LJLLI;
                ArrayList arrayList4 = new ArrayList();
                Iterator<C8W0> it10 = copyOnWriteArrayList4.iterator();
                while (it10.hasNext()) {
                    C8W0 next4 = it10.next();
                    C8W0 c8w03 = next4;
                    if (c8w03.active && c8w03.hasLoaded) {
                        arrayList4.add(next4);
                    }
                }
                Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    C8W0 it12 = (C8W0) it11.next();
                    Lifecycle.State state4 = Lifecycle.State.STARTED;
                    o.LJIIIIZZ(it12, "it");
                    LJFF(state4, it12);
                }
                return;
            case 5:
                CopyOnWriteArrayList<C8W0> copyOnWriteArrayList5 = this.LJLLI;
                ArrayList arrayList5 = new ArrayList();
                Iterator<C8W0> it13 = copyOnWriteArrayList5.iterator();
                while (it13.hasNext()) {
                    C8W0 next5 = it13.next();
                    C8W0 c8w04 = next5;
                    if (c8w04.active && c8w04.hasLoaded) {
                        arrayList5.add(next5);
                    }
                }
                Iterator it14 = arrayList5.iterator();
                while (it14.hasNext()) {
                    C8W0 it15 = (C8W0) it14.next();
                    Lifecycle.State state5 = Lifecycle.State.CREATED;
                    o.LJIIIIZZ(it15, "it");
                    LJFF(state5, it15);
                }
                return;
            case 6:
                LJII();
                return;
            default:
                return;
        }
    }

    public AssemSupervisor(LifecycleOwner lifecycleOwner, Context context, C7C3 dataStore, C8VA serviceStore) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataStore, "dataStore");
        o.LJIIIZ(serviceStore, "serviceStore");
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 14));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 15));
        this.LJLLI = new CopyOnWriteArrayList<>();
        this.LJLLILLLL = new ConcurrentHashMap<>();
        this.LJLLJ = C221108m2.LIZIZ(C212368Vc.INSTANCE);
        this.LJLIL = dataStore;
        this.LJLILLLLZI = serviceStore;
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = context;
    }

    public AssemSupervisor(LifecycleOwner lifecycleOwner, ActivityC45651qj activityC45651qj, C8VU c8vu, C212348Va c212348Va) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 14));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 15));
        this.LJLLI = new CopyOnWriteArrayList<>();
        this.LJLLILLLL = new ConcurrentHashMap<>();
        this.LJLLJ = C221108m2.LIZIZ(C212368Vc.INSTANCE);
        this.LJLJI = c8vu;
        this.LJLJJI = c212348Va;
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = activityC45651qj;
    }
}
