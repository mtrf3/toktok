package com.bytedance.android.livesdk.gift.base.utils.lazy;

import X.C5H3;
import X.InterfaceC65784Pro;
import X.XLV;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class lifecycleAwareLazy<T> implements C5H3<T>, Serializable {
    public InterfaceC65784Pro<? extends T> LJLIL;
    public volatile Object LJLILLLLZI;
    public final lifecycleAwareLazy<T> LJLJI;
    public final LifecycleOwner owner;

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // X.C5H3
    public T getValue() {
        T t;
        T t2 = (T) this.LJLILLLLZI;
        XLV xlv = XLV.LIZ;
        if (t2 != xlv) {
            return t2;
        }
        synchronized (this.LJLJI) {
            t = (T) this.LJLILLLLZI;
            if (t == xlv) {
                InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LJLIL;
                o.LJI(interfaceC65784Pro);
                t = interfaceC65784Pro.invoke();
                this.LJLILLLLZI = t;
                this.LJLIL = null;
            }
        }
        return t;
    }

    @Override // X.C5H3
    public boolean isInitialized() {
        if (this.LJLILLLLZI != XLV.LIZ) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public lifecycleAwareLazy(LifecycleOwner owner, InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(initializer, "initializer");
        this.owner = owner;
        this.LJLIL = initializer;
        this.LJLILLLLZI = XLV.LIZ;
        this.LJLJI = this;
        owner.getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.bytedance.android.livesdk.gift.base.utils.lazy.lifecycleAwareLazy.1
            public final /* synthetic */ lifecycleAwareLazy<T> LJLIL;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_CREATE) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onStart() {
                if (!this.LJLIL.isInitialized()) {
                    this.LJLIL.getValue();
                }
                this.LJLIL.owner.getLifecycle().removeObserver(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LJLIL = this;
            }
        });
    }
}
