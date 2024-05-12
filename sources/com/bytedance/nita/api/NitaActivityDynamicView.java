package com.bytedance.nita.api;

import X.AbstractC39064FUu;
import X.C39056FUm;
import X.C39057FUn;
import X.EnumC38909FOv;
import X.FV2;
import X.HandlerC39055FUl;
import X.InterfaceC39061FUr;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.nita.Nita$beginDynamicInflate$1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class NitaActivityDynamicView extends AbstractC39064FUu implements GenericLifecycleObserver {
    public Activity LJLILLLLZI;
    public int LJLJI = 1;
    public LifecycleOwner LJLJJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        String viewTag = ((Nita$beginDynamicInflate$1) this).LJLJJL;
        Activity activity = this.LJLILLLLZI;
        if (activity != null) {
            o.LJIIJ(viewTag, "viewTag");
            HandlerC39055FUl.LJIIIIZZ.getClass();
            HandlerC39055FUl.LIZLLL(activity, viewTag);
            this.LJLILLLLZI = null;
            this.LJLJJI = null;
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC39061FUr
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.AbstractC39064FUu, X.InterfaceC39061FUr
    public final void LJI(View view, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LJIIIIZZ() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ComponentCallbacks2 componentCallbacks2 = this.LJLILLLLZI;
        if (componentCallbacks2 != null) {
            if (this.LJLJJI == null) {
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) componentCallbacks2;
                this.LJLJJI = lifecycleOwner2;
                Lifecycle lifecycle2 = lifecycleOwner2.getLifecycle();
                if (lifecycle2 != null) {
                    lifecycle2.addObserver(this);
                }
            }
            Nita$beginDynamicInflate$1 nita$beginDynamicInflate$1 = (Nita$beginDynamicInflate$1) this;
            InterfaceC39061FUr interfaceC39061FUr = C39056FUm.LIZ.get(nita$beginDynamicInflate$1.LJLJJL);
            if (interfaceC39061FUr != null && (interfaceC39061FUr instanceof LifecycleObserver) && (lifecycleOwner = this.LJLJJI) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver((LifecycleObserver) interfaceC39061FUr);
            }
            C39057FUn c39057FUn = C39057FUn.LIZJ;
            C39057FUn.LIZ(this);
            c39057FUn.LJFF(this.LJLILLLLZI, this.LJLJI, nita$beginDynamicInflate$1.LJLJJL);
            return;
        }
        throw new FV2(" dynamic use , please invoke withActivity first ");
    }

    @Override // X.InterfaceC39061FUr
    public EnumC38909FOv LIZ() {
        return EnumC38909FOv.AT_ONCE;
    }
}
