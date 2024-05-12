package com.ss.android.ugc.aweme.account.login.v2.base;

import X.AbstractC73635Sv9;
import X.C73600Sua;
import X.C73608Sui;
import X.C73629Sv3;
import X.C73849Syb;
import X.EnumC73681Svt;
import X.InterfaceC73504St2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes13.dex */
public final class MaybeBindLifeCycleTransformer implements GenericLifecycleObserver {
    public final C73849Syb<Integer> LJLIL = new C73849Syb<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            disposeRequest();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void disposeRequest() {
        this.LJLIL.onNext(1);
    }

    public final InterfaceC73504St2<Object> LIZ(AbstractC73635Sv9<Object> abstractC73635Sv9) {
        C73849Syb<Integer> c73849Syb = this.LJLIL;
        c73849Syb.getClass();
        return new C73629Sv3((C73608Sui) abstractC73635Sv9, new C73600Sua(c73849Syb).LJJLIIJ(EnumC73681Svt.MISSING));
    }
}
