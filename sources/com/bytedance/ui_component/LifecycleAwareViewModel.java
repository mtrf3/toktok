package com.bytedance.ui_component;

import X.InterfaceC61312at;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class LifecycleAwareViewModel<T extends InterfaceC61312at> extends JediViewModel<T> implements LifecycleOwner {
    public Lifecycle LJLJJLL;

    public final Lifecycle Hv0() {
        Lifecycle lifecycle = this.LJLJJLL;
        if (lifecycle != null) {
            return lifecycle;
        }
        o.LJIJI("_lifecycle");
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLJJLL;
        if (lifecycle != null) {
            return lifecycle;
        }
        o.LJIJI("_lifecycle");
        throw null;
    }

    public final void Iv0(Lifecycle lifecycle) {
        o.LJIIIZ(lifecycle, "<set-?>");
        this.LJLJJLL = lifecycle;
    }
}
