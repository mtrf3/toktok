package com.bytedance.als.lazy;

import X.AbstractC29891Fh;
import X.C00X;
import X.C0I6;
import X.C0Y0;
import X.C76800UCe;
import X.C82622Wbi;
import X.C83683Qe;
import X.InterfaceC65784Pro;
import X.InterfaceC77386UYs;
import X.InterfaceC88472Yns;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SingleInstanceCreatedCallbackWithLifecycleWrapper implements GenericLifecycleObserver, InterfaceC77386UYs {
    public final Class<?> LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final Lifecycle LJLJI;
    public final InterfaceC88472Yns<C0I6, C76800UCe> LJLJJI;
    public final C0Y0 LJLJJL;
    public final C0Y0 LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        this.LJLJI.removeObserver(this);
        C82622Wbi c82622Wbi = this.LJLILLLLZI;
        Class<?> cls = this.LJLIL;
        if (cls != null) {
            c82622Wbi.getClass();
            if (c82622Wbi.LJIIL(new C83683Qe(null, cls), this)) {
                return;
            } else {
                throw new C00X("unregisterInstanceCreatedCallbacks failed");
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.bytedance.als.LogicComponent<T>>");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZIZ();
    }

    @Override // X.InterfaceC77386UYs
    public final void LIZ(Class clazz, Object obj, boolean z) {
        boolean z2;
        AbstractC29891Fh abstractC29891Fh = (AbstractC29891Fh) obj;
        o.LJIIIZ(clazz, "clazz");
        if (!z) {
            C0Y0 c0y0 = this.LJLJJL;
            synchronized (c0y0) {
                z2 = c0y0.LIZ;
            }
            if (!z2) {
                this.LJLJJLL.LIZ();
                LIZIZ();
                this.LJLJL.invoke();
                this.LJLJJI.invoke(abstractC29891Fh.getApiComponent());
                this.LJLJLJ.invoke();
            }
        }
    }

    public SingleInstanceCreatedCallbackWithLifecycleWrapper(Class componentClazz, C82622Wbi diContainer, LifecycleRegistry lifecycle, IDqS172S0200000 iDqS172S0200000, C0Y0 c0y0, C0Y0 c0y02, IDqS176S0200000 iDqS176S0200000, IDqS176S0200000 iDqS176S02000002) {
        o.LJIIIZ(componentClazz, "componentClazz");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJLIL = componentClazz;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = lifecycle;
        this.LJLJJI = iDqS172S0200000;
        this.LJLJJL = c0y0;
        this.LJLJJLL = c0y02;
        this.LJLJL = iDqS176S0200000;
        this.LJLJLJ = iDqS176S02000002;
    }
}
