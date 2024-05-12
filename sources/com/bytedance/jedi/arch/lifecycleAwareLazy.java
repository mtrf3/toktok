package com.bytedance.jedi.arch;

import X.C37692Eqm;
import X.C5H3;
import X.C71107RvT;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelEnsuranceKt;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class lifecycleAwareLazy implements GenericLifecycleObserver, C5H3, Serializable {
    public InterfaceC65784Pro<ViewModel> LJLIL;
    public volatile Object LJLILLLLZI;
    public final lifecycleAwareLazy LJLJI;
    public final LifecycleOwner LJLJJI;
    public final InterfaceC65784Pro<String> LJLJJL;

    public static /* synthetic */ void value$annotations() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onStart();
        }
    }

    @Override // X.C5H3
    public ViewModel getValue() {
        ViewModel invoke;
        Object obj = this.LJLILLLLZI;
        C71107RvT c71107RvT = C71107RvT.LIZ;
        if (obj != c71107RvT) {
            if (obj != null) {
                return (ViewModel) obj;
            }
            throw new C37692Eqm("null cannot be cast to non-null type T");
        }
        synchronized (this.LJLJI) {
            Object obj2 = this.LJLILLLLZI;
            if (obj2 != c71107RvT) {
                if (obj2 != null) {
                    invoke = (ViewModel) obj2;
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type T");
                }
            } else {
                InterfaceC65784Pro<ViewModel> interfaceC65784Pro = this.LJLIL;
                if (interfaceC65784Pro != null) {
                    invoke = interfaceC65784Pro.invoke();
                    this.LJLILLLLZI = invoke;
                    this.LJLIL = null;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        return invoke;
    }

    @Override // X.C5H3
    public boolean isInitialized() {
        if (this.LJLILLLLZI != C71107RvT.LIZ) {
            return true;
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.LJLJJL == null) {
            this.LJLJJI.getLifecycle().removeObserver(this);
        } else {
            LIZ(this.LJLJJI, getValue(), this.LJLJJL);
        }
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<ViewModel> initializer) {
        this(owner, null, initializer);
        o.LJIIJ(owner, "owner");
        o.LJIIJ(initializer, "initializer");
    }

    public lifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<ViewModel> initializer) {
        o.LJIIJ(owner, "owner");
        o.LJIIJ(initializer, "initializer");
        this.LJLJJI = owner;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLIL = initializer;
        this.LJLILLLLZI = C71107RvT.LIZ;
        this.LJLJI = this;
        owner.getLifecycle().addObserver(this);
    }

    public void LIZ(LifecycleOwner owner, ViewModel value, InterfaceC65784Pro<String> keyFactory) {
        o.LJIIJ(owner, "owner");
        o.LJIIJ(value, "value");
        o.LJIIJ(keyFactory, "keyFactory");
        ViewModelEnsuranceKt.ensureViewModel((Fragment) owner, value, keyFactory);
    }
}
