package com.bytedance.als.ui.state;

import X.C06540Nm;
import X.C0IB;
import X.C1OY;
import X.C46621sI;
import X.C76800UCe;
import X.ESQ;
import X.InterfaceC29911Fj;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.TBT;
import X.TBW;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveState<T> extends C0IB<T> {
    public Object LIZ;
    public final ArrayList<LiveState<T>.CallbackWithLifecycle> LIZIZ = new ArrayList<>();
    public final HashMap<InterfaceC29911Fj<T>, LiveState<T>.CallbackWithLifecycle> LIZJ = new HashMap<>();
    public final HashMap<LiveState<T>.CallbackWithLifecycle, InterfaceC29911Fj<T>> LIZLLL = new HashMap<>();
    public final HashMap<TBW<?, ?>, LiveState<?>> LJ = new HashMap<>();
    public boolean LJFF;
    public int LJI;
    public final InterfaceC65784Pro<T> LJII;

    @Override // X.C0IB
    public final synchronized T LIZ() {
        if (!this.LJFF) {
            this.LIZ = this.LJII.invoke();
            this.LJI++;
            this.LJFF = true;
        }
        return (T) this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveState(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        this.LJII = interfaceC65784Pro;
    }

    @Override // X.C0IB
    public final void LIZJ(InterfaceC29911Fj<T> interfaceC29911Fj) {
        if (this.LIZJ.get(interfaceC29911Fj) != null) {
            return;
        }
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000((ESQ) interfaceC29911Fj, 30);
        C1OY c1oy = new C1OY();
        Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
        o.LJIIIZ(event, "event");
        c1oy.LJLIL.handleLifecycleEvent(event);
        LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(this, c1oy, iDqS416S0100000, Lifecycle.State.CREATED);
        this.LIZJ.put(interfaceC29911Fj, callbackWithLifecycle);
        this.LIZLLL.put(callbackWithLifecycle, interfaceC29911Fj);
        LJIIJ(c1oy, callbackWithLifecycle);
    }

    @Override // X.C0IB
    public final void LJFF(InterfaceC29911Fj<T> interfaceC29911Fj) {
        LiveState<T>.CallbackWithLifecycle remove;
        if (interfaceC29911Fj == null || this.LIZJ.size() == 0 || (remove = this.LIZJ.remove(interfaceC29911Fj)) == null) {
            return;
        }
        this.LIZIZ.remove(remove);
        remove.LJLILLLLZI.getLifecycle().removeObserver(remove);
        this.LIZLLL.remove(remove);
    }

    public final void LJI(boolean z) {
        if (!this.LJFF) {
            this.LJFF = true;
        }
        T invoke = this.LJII.invoke();
        if (!o.LJ(invoke, this.LIZ)) {
            this.LIZ = invoke;
            this.LJI++;
            Iterator it = ORZ.LLJI(this.LIZIZ).iterator();
            while (it.hasNext()) {
                ((CallbackWithLifecycle) it.next()).LIZ(invoke, this.LJI, z);
            }
        }
        Iterator LJ = C06540Nm.LJ(this.LJ, "mLiveStateMap.values");
        while (LJ.hasNext()) {
            ((LiveState) LJ.next()).LJI(z);
        }
    }

    public final LiveState LJII(TBT property) {
        LiveState<?> liveState;
        o.LJIIIZ(property, "property");
        synchronized (this) {
            liveState = this.LJ.get(property);
            if (liveState == null) {
                liveState = new LiveState<>(new IDqS176S0200000(this, property, 34));
                this.LJ.put(property, liveState);
            }
        }
        return liveState;
    }

    public final void LJIIJJI(LiveState<T>.CallbackWithLifecycle callbackWithLifecycle) {
        InterfaceC29911Fj<T> remove;
        this.LIZIZ.remove(callbackWithLifecycle);
        callbackWithLifecycle.LJLILLLLZI.getLifecycle().removeObserver(callbackWithLifecycle);
        if (this.LIZLLL.size() != 0 && (remove = this.LIZLLL.remove(callbackWithLifecycle)) != null) {
            this.LIZJ.remove(remove);
        }
    }

    /* loaded from: classes.dex */
    public final class CallbackWithLifecycle implements LifecycleEventObserver {
        public int LJLIL;
        public final LifecycleOwner LJLILLLLZI;
        public final InterfaceC88472Yns<T, C76800UCe> LJLJI;
        public final Lifecycle.State LJLJJI;
        public final /* synthetic */ LiveState LJLJJL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            o.LJIIIZ(source, "source");
            o.LJIIIZ(event, "event");
            Lifecycle lifecycle = this.LJLILLLLZI.getLifecycle();
            o.LJIIIIZZ(lifecycle, "this.owner.lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                this.LJLJJL.LJIIJJI(this);
                return;
            }
            int i = this.LJLIL;
            LiveState liveState = this.LJLJJL;
            if (i == liveState.LJI) {
                return;
            }
            LIZ(liveState.LIZ(), this.LJLJJL.LJI, true);
        }

        public final void LIZ(T t, int i, boolean z) {
            Lifecycle lifecycle = this.LJLILLLLZI.getLifecycle();
            o.LJIIIIZZ(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState().isAtLeast(this.LJLJJI) && z) {
                this.LJLIL = i;
                this.LJLJI.invoke(t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CallbackWithLifecycle(LiveState liveState, LifecycleOwner owner, InterfaceC88472Yns<? super T, C76800UCe> observer, Lifecycle.State targetState) {
            o.LJIIIZ(owner, "owner");
            o.LJIIIZ(observer, "observer");
            o.LJIIIZ(targetState, "targetState");
            this.LJLJJL = liveState;
            this.LJLILLLLZI = owner;
            this.LJLJI = observer;
            this.LJLJJI = targetState;
        }
    }

    @Override // X.C0IB
    public final void LIZIZ(LifecycleOwner lifecycleOwner, InterfaceC29911Fj<T> interfaceC29911Fj) {
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED || interfaceC29911Fj == null || this.LIZJ.get(interfaceC29911Fj) != null) {
                return;
            }
            LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(this, lifecycleOwner, new IDqS416S0100000(interfaceC29911Fj, 29), Lifecycle.State.STARTED);
            this.LIZJ.put(interfaceC29911Fj, callbackWithLifecycle);
            this.LIZLLL.put(callbackWithLifecycle, interfaceC29911Fj);
            LJIIJ(lifecycleOwner, callbackWithLifecycle);
        }
    }

    @Override // X.C0IB
    public final void LIZLLL(LifecycleOwner lifecycleOwner, InterfaceC29911Fj<T> interfaceC29911Fj) {
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED || this.LIZJ.get(interfaceC29911Fj) != null) {
                return;
            }
            LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(this, lifecycleOwner, new IDqS416S0100000(interfaceC29911Fj, 31), Lifecycle.State.STARTED);
            this.LIZJ.put(interfaceC29911Fj, callbackWithLifecycle);
            this.LIZLLL.put(callbackWithLifecycle, interfaceC29911Fj);
            LJIIJ(lifecycleOwner, callbackWithLifecycle);
        }
    }

    public final InterfaceC65784Pro<C76800UCe> LJIIJ(LifecycleOwner lifecycleOwner, LiveState<T>.CallbackWithLifecycle callbackWithLifecycle) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C46621sI.LJLIL;
        }
        this.LIZIZ.add(callbackWithLifecycle);
        callbackWithLifecycle.LIZ(LIZ(), this.LJI, true);
        lifecycleOwner.getLifecycle().addObserver(callbackWithLifecycle);
        return new IDqS176S0200000(this, callbackWithLifecycle, 22);
    }

    public final InterfaceC65784Pro<C76800UCe> LJIIIIZZ(LifecycleOwner lifecycleOwner, Lifecycle.State targetState, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(targetState, "targetState");
        o.LJIIIZ(callback, "callback");
        return LJIIJ(lifecycleOwner, new CallbackWithLifecycle(this, lifecycleOwner, callback, targetState));
    }
}
