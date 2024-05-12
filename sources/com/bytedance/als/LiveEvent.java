package com.bytedance.als;

import X.C15070iV;
import X.InterfaceC29911Fj;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class LiveEvent<T> {
    public MutableLiveData<T> LIZ;
    public final Set<InterfaceC29911Fj<T>> LIZIZ = new HashSet();
    public final List<C15070iV<InterfaceC29911Fj<T>, LifecycleOwner>> LIZJ = new ArrayList();

    public final void LIZIZ() {
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null) {
            if (mutableLiveData.getValue() != null) {
                Iterator it = ((ArrayList) this.LIZJ).iterator();
                while (it.hasNext()) {
                    this.LIZ.removeObserver((Observer) ((C15070iV) it.next()).LIZ);
                }
                this.LIZ = new MutableLiveData<>();
                Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                while (it2.hasNext()) {
                    C15070iV c15070iV = (C15070iV) it2.next();
                    S s = c15070iV.LIZIZ;
                    if (s != 0) {
                        this.LIZ.observe((LifecycleOwner) s, (Observer) c15070iV.LIZ);
                    } else {
                        this.LIZ.observeForever((Observer) c15070iV.LIZ);
                    }
                }
                return;
            }
            return;
        }
        this.LIZ = new MutableLiveData<>();
    }

    public T LIZJ() {
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null) {
            return mutableLiveData.getValue();
        }
        return null;
    }

    public final void LIZ(InterfaceC29911Fj<T> interfaceC29911Fj) {
        ((HashSet) this.LIZIZ).remove(interfaceC29911Fj);
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((C15070iV) it.next()).LIZ == interfaceC29911Fj) {
                it.remove();
                break;
            }
        }
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null && !mutableLiveData.hasObservers()) {
            this.LIZ = null;
        }
    }

    public void LJ(InterfaceC29911Fj<T> interfaceC29911Fj) {
        if (!((HashSet) this.LIZIZ).contains(interfaceC29911Fj)) {
            ((HashSet) this.LIZIZ).add(interfaceC29911Fj);
            LIZIZ();
            ((ArrayList) this.LIZJ).add(new C15070iV(interfaceC29911Fj, null));
            this.LIZ.observeForever(interfaceC29911Fj);
            return;
        }
        throw new IllegalArgumentException("Can't add the same observer twice");
    }

    public void LJFF(InterfaceC29911Fj<T> interfaceC29911Fj) {
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(interfaceC29911Fj);
            LIZ(interfaceC29911Fj);
        }
    }

    public void LIZLLL(LifecycleOwner lifecycleOwner, final InterfaceC29911Fj<T> interfaceC29911Fj) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!((HashSet) this.LIZIZ).contains(interfaceC29911Fj)) {
            ((HashSet) this.LIZIZ).add(interfaceC29911Fj);
            LIZIZ();
            ((ArrayList) this.LIZJ).add(new C15070iV(interfaceC29911Fj, lifecycleOwner));
            this.LIZ.observe(lifecycleOwner, interfaceC29911Fj);
            lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.als.LiveEvent.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void onDestroy() {
                    LiveEvent.this.LIZ(interfaceC29911Fj);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Can't add the same observer twice");
    }
}
