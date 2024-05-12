package androidx.lifecycle;

import X.C014303v;
import X.C16880lQ;
import X.C19Y;
import X.C28O;
import X.HRJ;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.ARunnableS40S0100000_4;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    public int mAddingObserverCounter;
    public final boolean mEnforceMainThread;
    public boolean mHandlingEvent;
    public final WeakReference<LifecycleOwner> mLifecycleOwner;
    public boolean mNewEventOccurred;
    public C19Y<LifecycleObserver, ObserverWithState> mObserverMap;
    public ArrayList<Lifecycle.State> mParentStates;
    public Lifecycle.State mState;

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(this, lifecycleObserver);
    }

    private boolean isSynced() {
        if (this.mObserverMap.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.mObserverMap.eldest().getValue().mState;
        Lifecycle.State state2 = this.mObserverMap.newest().getValue().mState;
        if (state == state2 && this.mState == state2) {
            return true;
        }
        return false;
    }

    private void popParentState() {
        ListProtector.remove(this.mParentStates, r1.size() - 1);
    }

    private void sync() {
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner.get();
        if (lifecycleOwner != null) {
            while (!isSynced()) {
                this.mNewEventOccurred = false;
                if (C16880lQ.LLJJIJIL(this.mState, this.mObserverMap.eldest().getValue().mState) < 0) {
                    backwardPass(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, ObserverWithState> newest = this.mObserverMap.newest();
                if (!this.mNewEventOccurred && newest != null && C16880lQ.LLJJIJIL(this.mState, newest.getValue().mState) > 0) {
                    forwardPass(lifecycleOwner);
                }
            }
            this.mNewEventOccurred = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.mObserverMap.size();
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.mState;
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void backwardPass(androidx.lifecycle.LifecycleOwner r6) {
        /*
            r5 = this;
            X.19Y<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            java.util.Iterator r4 = r0.descendingIterator()
        L6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            boolean r0 = r5.mNewEventOccurred
            if (r0 != 0) goto L66
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r3 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r3
        L1c:
            androidx.lifecycle.Lifecycle$State r1 = r3.mState
            androidx.lifecycle.Lifecycle$State r0 = r5.mState
            int r0 = X.C16880lQ.LLJJIJIL(r1, r0)
            if (r0 <= 0) goto L6
            boolean r0 = r5.mNewEventOccurred
            if (r0 != 0) goto L6
            X.19Y<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            java.lang.Object r1 = r2.getKey()
            java.util.HashMap<K, X.03v<K, V>> r0 = r0.LJLIL
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.downFrom(r0)
            if (r1 == 0) goto L4e
            androidx.lifecycle.Lifecycle$State r0 = r1.getTargetState()
            r5.pushParentState(r0)
            r3.dispatchEvent(r6, r1)
            r5.popParentState()
            goto L1c
        L4e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "no event down from "
            r1.append(r0)
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.backwardPass(androidx.lifecycle.LifecycleOwner):void");
    }

    private Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        C014303v<LifecycleObserver, ObserverWithState> c014303v;
        C19Y<LifecycleObserver, ObserverWithState> c19y = this.mObserverMap;
        Lifecycle.State state2 = null;
        if (c19y.LJLIL.containsKey(lifecycleObserver) && (c014303v = c19y.LJLIL.get(lifecycleObserver).LJLJJI) != null) {
            state = c014303v.LJLILLLLZI.mState;
        } else {
            state = null;
        }
        if (!this.mParentStates.isEmpty()) {
            state2 = (Lifecycle.State) ListProtector.get(this.mParentStates, r1.size() - 1);
        }
        return min(min(this.mState, state), state2);
    }

    public static LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return new LifecycleRegistry(lifecycleOwner, false);
    }

    private void enforceMainThreadIfNeeded(String str) {
        if (!this.mEnforceMainThread || C28O.LLLLZ().LLJJLIIIJLLLLLLLZ()) {
        } else {
            throw new IllegalStateException(a1.LJ("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void forwardPass(androidx.lifecycle.LifecycleOwner r6) {
        /*
            r5 = this;
            X.19Y<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            androidx.arch.core.internal.SafeIterableMap$d r4 = r0.iteratorWithAdditions()
        L6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            boolean r0 = r5.mNewEventOccurred
            if (r0 != 0) goto L64
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r3 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r3
        L1c:
            androidx.lifecycle.Lifecycle$State r1 = r3.mState
            androidx.lifecycle.Lifecycle$State r0 = r5.mState
            int r0 = X.C16880lQ.LLJJIJIL(r1, r0)
            if (r0 >= 0) goto L6
            boolean r0 = r5.mNewEventOccurred
            if (r0 != 0) goto L6
            X.19Y<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            java.lang.Object r1 = r2.getKey()
            java.util.HashMap<K, X.03v<K, V>> r0 = r0.LJLIL
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            r5.pushParentState(r0)
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.upFrom(r0)
            if (r0 == 0) goto L4c
            r3.dispatchEvent(r6, r0)
            r5.popParentState()
            goto L1c
        L4c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "no event up from "
            r1.append(r0)
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.forwardPass(androidx.lifecycle.LifecycleOwner):void");
    }

    private void moveToState(Lifecycle.State state) {
        Lifecycle.State state2 = this.mState;
        if (state2 == state) {
            return;
        }
        if (state2 != Lifecycle.State.INITIALIZED || state != Lifecycle.State.DESTROYED) {
            this.mState = state;
            if (this.mHandlingEvent || this.mAddingObserverCounter != 0) {
                this.mNewEventOccurred = true;
                return;
            }
            this.mHandlingEvent = true;
            sync();
            this.mHandlingEvent = false;
            if (this.mState == Lifecycle.State.DESTROYED) {
                this.mObserverMap = new C19Y<>();
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("no event down from ");
        LIZ.append(this.mState);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    private void pushParentState(Lifecycle.State state) {
        this.mParentStates.add(state);
    }

    public void androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        boolean z;
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.mState;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(lifecycleObserver, state2);
        if (this.mObserverMap.putIfAbsent(lifecycleObserver, observerWithState) != null || (lifecycleOwner = this.mLifecycleOwner.get()) == null) {
            return;
        }
        if (this.mAddingObserverCounter != 0 || this.mHandlingEvent) {
            z = true;
        } else {
            z = false;
        }
        Lifecycle.State calculateTargetState = calculateTargetState(lifecycleObserver);
        this.mAddingObserverCounter++;
        while (C16880lQ.LLJJIJIL(observerWithState.mState, calculateTargetState) < 0 && this.mObserverMap.LJLIL.containsKey(lifecycleObserver)) {
            pushParentState(observerWithState.mState);
            Lifecycle.Event upFrom = Lifecycle.Event.upFrom(observerWithState.mState);
            if (upFrom != null) {
                observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                popParentState();
                calculateTargetState = calculateTargetState(lifecycleObserver);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("no event up from ");
                LIZ.append(observerWithState.mState);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        if (!z) {
            sync();
        }
        this.mAddingObserverCounter--;
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    public void markState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        enforceMainThreadIfNeeded("removeObserver");
        this.mObserverMap.remove(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    /* loaded from: classes.dex */
    public static class ObserverWithState {
        public LifecycleEventObserver mLifecycleObserver;
        public Lifecycle.State mState;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            this.mLifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.mState = state;
        }

        public void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.mState = LifecycleRegistry.min(this.mState, targetState);
            this.mLifecycleObserver.onStateChanged(lifecycleOwner, event);
            this.mState = targetState;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.mObserverMap = new C19Y<>();
        this.mAddingObserverCounter = 0;
        this.mHandlingEvent = false;
        this.mNewEventOccurred = false;
        this.mParentStates = new ArrayList<>();
        this.mLifecycleOwner = new WeakReference<>(lifecycleOwner);
        this.mState = Lifecycle.State.INITIALIZED;
        this.mEnforceMainThread = z;
    }

    public static void androidx_lifecycle_LifecycleRegistry_com_ss_android_ugc_aweme_lancet_LifecycleRegistryLancet_addObserver(LifecycleRegistry lifecycleRegistry, LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            o.LJII(lifecycleRegistry, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            HRJ.LIZ(new ARunnableS40S0100000_4((InterfaceC65784Pro) new AqS148S0200000_1(lifecycleRegistry, observer, 16), 129));
        } else {
            lifecycleRegistry.androidx_lifecycle_LifecycleRegistry__addObserver$___twin___(observer);
        }
    }

    public static Lifecycle.State min(Lifecycle.State state, Lifecycle.State state2) {
        if (state2 != null && C16880lQ.LLJJIJIL(state2, state) < 0) {
            return state2;
        }
        return state;
    }
}
